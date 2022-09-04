package com.test.example.repository;

import com.test.example.model.DriverRace;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRaceRepository extends CrudRepository<DriverRace, Integer> {

  @Override
  List<DriverRace> findAll();
}