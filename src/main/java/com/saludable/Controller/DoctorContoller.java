package com.saludable.Controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saludable.modelo.Doctor;
import com.saludable.modelo.Paciente;
import com.saludable.repos.DoctorRep;
import com.saludable.servicio.DoctorServ;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class DoctorContoller implements DoctorServ {

		ArrayList<Doctor> listaDoctor;
		
		public DoctorContoller() {
			
			listaDoctor=new ArrayList<Doctor>();

		}
	
		 @Autowired
		 DoctorRep docRep;

		 
		 
		@PostMapping(value = "nuevodoctor")
		public Doctor nuevoDoctor(Doctor d) {
			return docRep.save(d);
		}

		 @GetMapping(value = "listardoc")
		public Iterable<Doctor> listarTodosLosDoctores() {
			
			 return docRep.findAll();
		}

		 @GetMapping (value= "doctorId/{id}")
		public Optional<Doctor> ListaDoctorporID(@PathVariable("id") Integer id) {
			// TODO Auto-generated method stub
			return docRep.findById(id);
		}

		 @GetMapping (value = "loginDoc")
		 public Doctor validarDoctro(@RequestParam(value = "usuario") String usuario, @RequestParam("clave") String contrasenia) {

			 listaDoctor.addAll((Collection<? extends Doctor>) this.docRep.findAll());
				int z = -1;
				Doctor d=null;
				
				for (int i=0; i<listaDoctor.size();i++) {
					if (listaDoctor.get(i).getUsuario().equals(usuario) ) {
						z=i;
					}else {
						z=z;
						
					}
				}
				if(listaDoctor.get(z).getClave().equals(contrasenia)) {
					d =listaDoctor.get(z);
					return d;
				}
				
				return null;
				

			 
		}	
	
}
