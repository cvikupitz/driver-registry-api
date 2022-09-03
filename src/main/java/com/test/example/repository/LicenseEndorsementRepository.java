package com.test.example.repository;

import com.test.example.model.LicenseEndorsement;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseEndorsementRepository extends CrudRepository<LicenseEndorsement, Integer> {

  @Override
  List<LicenseEndorsement> findAll();
}