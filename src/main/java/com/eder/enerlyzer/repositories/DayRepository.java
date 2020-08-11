package com.eder.enerlyzer.repositories;

import com.eder.enerlyzer.entities.Day;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DayRepository extends CrudRepository<Day, Integer> {
}
