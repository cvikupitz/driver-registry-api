package com.test.example.repository;

import com.test.example.model.Driver;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends PagingAndSortingRepository<Driver, Integer> {

}