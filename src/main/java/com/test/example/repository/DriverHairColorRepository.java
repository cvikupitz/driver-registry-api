package com.test.example.repository;

import com.test.example.model.DriverHairColor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DriverHairColorRepository extends CrudRepository<DriverHairColor, Integer> {

  @Override
  List<DriverHairColor> findAll();
}