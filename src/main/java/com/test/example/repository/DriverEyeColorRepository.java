package com.test.example.repository;

import com.test.example.model.DriverEyeColor;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface DriverEyeColorRepository extends CrudRepository<DriverEyeColor, Integer> {

  @Override
  List<DriverEyeColor> findAll();
}