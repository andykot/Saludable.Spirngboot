package com.saludable.servicio;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saludable.modelo.Paciente;


@Service
public interface PacienteServ {

	public Paciente nuevoPaciente(Paciente p);
	
	public Iterable<Paciente> listarTodosLosPacientes();
	
	public Optional<Paciente> ListaPacienteporID (Integer id);
	
	public Paciente validarpaciente(String usuario, String contrasenia);
	
	
	
}
