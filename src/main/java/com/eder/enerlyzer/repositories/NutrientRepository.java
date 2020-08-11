package com.eder.enerlyzer.repositories;

import com.eder.enerlyzer.entities.Nutrient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutrientRepository extends CrudRepository<Nutrient, Integer> {
}
