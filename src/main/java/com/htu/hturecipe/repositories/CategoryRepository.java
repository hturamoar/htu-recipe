package com.htu.hturecipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.htu.hturecipe.domains.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
