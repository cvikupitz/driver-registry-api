package com.test.example.repository;

import com.test.example.model.DriverGender;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverGenderRepository extends CrudRepository<DriverGender, Integer> {

  @Override
  List<DriverGender> findAll();
}