package com.test.example.repository;

import com.test.example.model.LicenseRestriction;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRestrictionRepository extends CrudRepository<LicenseRestriction, Integer> {

  @Override
  List<LicenseRestriction> findAll();
}