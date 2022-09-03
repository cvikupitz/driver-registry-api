package com.test.example.service;

import com.test.example.dto.metadata.LicenseEndorsementDto;
import com.test.example.dto.metadata.LicenseRestrictionDto;
import com.test.example.dto.metadata.LicenseTypeDto;
import com.test.example.dto.metadata.MetadataResponse;
import com.test.example.mapper.MetadataMapper;
import com.test.example.model.LicenseEndorsement;
import com.test.example.model.LicenseRestriction;
import com.test.example.model.LicenseType;
import com.test.example.repository.LicenseEndorsementRepository;
import com.test.example.repository.LicenseRestrictionRepository;
import com.test.example.repository.LicenseTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetadataService {

  @Autowired
  private LicenseTypeRepository licenseTypeRepository;
  @Autowired
  private LicenseEndorsementRepository licenseEndorsementRepository;
  @Autowired
  private LicenseRestrictionRepository licenseRestrictionRepository;
  @Autowired
  private MetadataMapper metadataMapper;

  public List<LicenseTypeDto> getLicenseTypes() {
    List<LicenseType> licenses = licenseTypeRepository.findAll();
    return metadataMapper.mapMultipleLicenseTypeModelsToDto(licenses);
  }

  public List<LicenseEndorsementDto> getLicenseEndorsements() {
    List<LicenseEndorsement> endorsements = licenseEndorsementRepository.findAll();
    return metadataMapper.mapMultipleLicenseEndorsementModelsToDto(endorsements);
  }

  public List<LicenseRestrictionDto> getLicenseRestrictions() {
    List<LicenseRestriction> restrictions = licenseRestrictionRepository.findAll();
    return metadataMapper.mapMultipleLicenseRestrictionModelsToDto(restrictions);
  }

  public MetadataResponse getAllMetadata() {
    MetadataResponse response = new MetadataResponse();
    response.setLicenseTypes(getLicenseTypes());
    response.setLicenseEndorsements(getLicenseEndorsements());
    response.setLicenseRestrictions(getLicenseRestrictions());
    return response;
  }
}