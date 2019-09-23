package com.saludable.repos;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saludable.modelo.Paciente;


@Repository
public interface PacienteRep extends CrudRepository<Paciente, Integer>{
	
	public Set<Paciente> findByusuario(String usuario);
	
	
	

}
