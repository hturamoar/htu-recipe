package com.htu.hturecipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.htu.hturecipe.domains.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);
	
}
