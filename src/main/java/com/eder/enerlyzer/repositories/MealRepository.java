package com.eder.enerlyzer.repositories;

import com.eder.enerlyzer.entities.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
}
