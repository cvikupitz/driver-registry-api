package com.test.example.mapper;

import com.test.example.dto.metadata.LicenseEndorsementDto;
import com.test.example.dto.metadata.LicenseRestrictionDto;
import com.test.example.dto.metadata.LicenseTypeDto;
import com.test.example.model.LicenseEndorsement;
import com.test.example.model.LicenseRestriction;
import com.test.example.model.LicenseType;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MetadataMapper {

  LicenseTypeDto mapLicenseModelToDto(LicenseType licenseType);

  List<LicenseTypeDto> mapMultipleLicenseTypeModelsToDto(List<LicenseType> licenseTypes);

  LicenseEndorsementDto mapLicenseEndorsementToDto(LicenseEndorsement licenseEndorsement);

  List<LicenseEndorsementDto> mapMultipleLicenseEndorsementModelsToDto(List<LicenseEndorsement> licenseEndorsements);

  LicenseRestrictionDto mapLicenseRestrictionToDto(LicenseRestriction licenseRestriction);

  List<LicenseRestrictionDto> mapMultipleLicenseRestrictionModelsToDto(List<LicenseRestriction> licenseRestrictions);
}