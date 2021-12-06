package com.htu.hturecipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.htu.hturecipe.domains.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

}
