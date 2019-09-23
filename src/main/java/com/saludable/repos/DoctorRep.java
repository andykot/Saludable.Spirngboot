package com.saludable.repos;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.saludable.modelo.Doctor;

@Repository
public interface DoctorRep extends CrudRepository<Doctor, Integer>{
	
	public Set<Doctor> findByusuario(String usuario);

}
