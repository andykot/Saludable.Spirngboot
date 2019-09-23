package com.saludable.repos;

import org.springframework.data.repository.CrudRepository;

import com.saludable.modelo.Alimentacion;

public interface AlimentacionRep extends CrudRepository<Alimentacion, Integer> {

}
