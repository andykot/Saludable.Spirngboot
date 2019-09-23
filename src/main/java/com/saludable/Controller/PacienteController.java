package com.saludable.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.modelo.Paciente;
import com.saludable.repos.PacienteRep;
import com.saludable.servicio.PacienteServ;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class PacienteController implements PacienteServ {

	ArrayList<Paciente> listaPacientes;
	
	
	
	public PacienteController() {
		
		listaPacientes= new ArrayList<Paciente>();
		
	}
	
	
	@Autowired	
	PacienteRep pacRepo;
	
	@PostMapping(value = "nuevopaciente")
	public Paciente nuevoPaciente(@RequestBody Paciente p) {
		
		return pacRepo.save(p);
	}

	
	@GetMapping(value = "resumenpacientes")
	public Iterable<Paciente> listarTodosLosPacientes() {

		listaPacientes = (ArrayList<Paciente>) pacRepo.findAll();
				
		return listaPacientes;
		}


	@GetMapping (value= "pacienteId/{id}")
	public Optional<Paciente> ListaPacienteporID(@PathVariable("id") Integer id) {
		
		
		return pacRepo.findById(id);
	}


	@GetMapping (value = "loginPaciente")
	public Paciente validarpaciente(@RequestParam(value = "usuario") String usuario, @RequestParam("clave") String contrasenia) {

		listaPacientes.addAll((Collection<? extends Paciente>) this.pacRepo.findAll());
		int z = -1;
		Paciente p=null;
		
		for (int i=0; i<listaPacientes.size();i++) {
			if (listaPacientes.get(i).getUsuario().equals(usuario) ) {
				z=i;
			}else {
				z=z;
				
			}
		}
		if(listaPacientes.get(z).getContrasenia().equals(contrasenia)) {
			p=listaPacientes.get(z);
			return p;
		}
		
		return null;
		
		
	}

	
	
	
	
	

}
