package com.test.example.repository;

import com.test.example.model.Driver;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends PagingAndSortingRepository<Driver, Integer> {

  @Override
  List<Driver> findAll();
}