package com.htu.hturecipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.htu.hturecipe.domains.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	Optional<Category> findByDescription(String description);
}
