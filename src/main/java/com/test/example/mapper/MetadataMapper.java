package com.test.example.mapper;

import com.test.example.dto.metadata.MetadataDto;
import com.test.example.model.DriverEyeColor;
import com.test.example.model.DriverGender;
import com.test.example.model.DriverHairColor;
import com.test.example.model.DriverRace;
import com.test.example.model.LicenseEndorsement;
import com.test.example.model.LicenseRestriction;
import com.test.example.model.LicenseType;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MetadataMapper {

  MetadataDto mapDriverEyeColorModelToDto(DriverEyeColor eyeColor);

  List<MetadataDto> mapMultipleDriverEyeColorModelsToDto(List<DriverEyeColor> eyeColors);

  MetadataDto mapDriverGenderModelToDto(DriverGender gender);

  List<MetadataDto> mapMultipleDriverGenderModelsToDto(List<DriverGender> genders);

  MetadataDto mapDriverHairColorModelToDto(DriverHairColor hairColor);

  List<MetadataDto> mapMultipleDriverHairColorModelsToDto(List<DriverHairColor> hairColors);

  MetadataDto mapDriverRaceModelToDto(DriverRace race);

  List<MetadataDto> mapMultipleDriverRaceModelsToDto(List<DriverRace> races);

  MetadataDto mapLicenseModelToDto(LicenseType licenseType);

  List<MetadataDto> mapMultipleLicenseTypeModelsToDto(List<LicenseType> licenseTypes);

  MetadataDto mapLicenseEndorsementToDto(LicenseEndorsement licenseEndorsement);

  List<MetadataDto> mapMultipleLicenseEndorsementModelsToDto(List<LicenseEndorsement> licenseEndorsements);

  MetadataDto mapLicenseRestrictionToDto(LicenseRestriction licenseRestriction);

  List<MetadataDto> mapMultipleLicenseRestrictionModelsToDto(List<LicenseRestriction> licenseRestrictions);
}