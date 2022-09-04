package com.test.example.service;

import com.test.example.dto.metadata.MetadataDto;
import com.test.example.dto.metadata.MetadataResponse;
import com.test.example.mapper.MetadataMapper;
import com.test.example.model.DriverEyeColor;
import com.test.example.model.DriverGender;
import com.test.example.model.DriverHairColor;
import com.test.example.model.DriverRace;
import com.test.example.model.LicenseEndorsement;
import com.test.example.model.LicenseRestriction;
import com.test.example.model.LicenseType;
import com.test.example.repository.DriverEyeColorRepository;
import com.test.example.repository.DriverGenderRepository;
import com.test.example.repository.DriverHairColorRepository;
import com.test.example.repository.DriverRaceRepository;
import com.test.example.repository.LicenseEndorsementRepository;
import com.test.example.repository.LicenseRestrictionRepository;
import com.test.example.repository.LicenseTypeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetadataService {

  @Autowired
  private DriverEyeColorRepository driverEyeColorRepository;
  @Autowired
  private DriverGenderRepository driverGenderRepository;
  @Autowired
  private DriverHairColorRepository driverHairColorRepository;
  @Autowired
  private DriverRaceRepository driverRaceRepository;
  @Autowired
  private LicenseTypeRepository licenseTypeRepository;
  @Autowired
  private LicenseEndorsementRepository licenseEndorsementRepository;
  @Autowired
  private LicenseRestrictionRepository licenseRestrictionRepository;
  @Autowired
  private MetadataMapper metadataMapper;

  public List<MetadataDto> getDriverEyeColors() {
    List<DriverEyeColor> eyeColors = driverEyeColorRepository.findAll();
    return metadataMapper.mapMultipleDriverEyeColorModelsToDto(eyeColors);
  }

  public List<MetadataDto> getDriverGenders() {
    List<DriverGender> genders = driverGenderRepository.findAll();
    return metadataMapper.mapMultipleDriverGenderModelsToDto(genders);
  }

  public List<MetadataDto> getDriverHairColors() {
    List<DriverHairColor> hairColors = driverHairColorRepository.findAll();
    return metadataMapper.mapMultipleDriverHairColorModelsToDto(hairColors);
  }

  public List<MetadataDto> getDriverRaces() {
    List<DriverRace> races = driverRaceRepository.findAll();
    return metadataMapper.mapMultipleDriverRaceModelsToDto(races);
  }

  public List<MetadataDto> getLicenseTypes() {
    List<LicenseType> licenses = licenseTypeRepository.findAll();
    return metadataMapper.mapMultipleLicenseTypeModelsToDto(licenses);
  }

  public List<MetadataDto> getLicenseEndorsements() {
    List<LicenseEndorsement> endorsements = licenseEndorsementRepository.findAll();
    return metadataMapper.mapMultipleLicenseEndorsementModelsToDto(endorsements);
  }

  public List<MetadataDto> getLicenseRestrictions() {
    List<LicenseRestriction> restrictions = licenseRestrictionRepository.findAll();
    return metadataMapper.mapMultipleLicenseRestrictionModelsToDto(restrictions);
  }

  public MetadataResponse getAllMetadata() {
    // TODO - caching + parallel
    MetadataResponse response = new MetadataResponse();
    response.setLicenseTypes(getLicenseTypes());
    response.setLicenseEndorsements(getLicenseEndorsements());
    response.setLicenseRestrictions(getLicenseRestrictions());
    response.setDriverEyeColors(getDriverEyeColors());
    response.setDriverGenders(getDriverGenders());
    response.setDriverHairColors(getDriverHairColors());
    response.setDriverRaces(getDriverRaces());

    return response;
  }
}