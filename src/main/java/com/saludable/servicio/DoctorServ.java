package com.saludable.servicio;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.saludable.modelo.Doctor;


@Service
public interface DoctorServ {
	
	
		public Doctor nuevoDoctor(Doctor d);
	
		public Iterable<Doctor> listarTodosLosDoctores();
		
		public Optional<Doctor> ListaDoctorporID (Integer id);
		
		public Doctor validarDoctro(String usuario, String contrasenia);
		

}
