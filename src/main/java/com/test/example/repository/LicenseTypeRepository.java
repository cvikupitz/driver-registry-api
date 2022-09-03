package com.test.example.repository;

import com.test.example.model.LicenseType;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseTypeRepository extends CrudRepository<LicenseType, Integer> {

  @Override
  List<LicenseType> findAll();
}