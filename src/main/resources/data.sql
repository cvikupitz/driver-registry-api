INSERT INTO LICENSE_TYPE
    (_ID, ABBREVIATION, TITLE) VALUES
  (101, 'D', 'Unrestricted'),
  (102, 'DJ', 'Provisional/Junior'),
  (103, 'A', 'Commercial License A'),
  (104, 'B', 'Commercial License B'),
  (105, 'C', 'Commercial License C'),
  (106, 'E', 'Taxi & Livery'),
  (107, 'M', 'Motorcycle'),
  (108, 'MJ', 'Motorcycle (Junior)'),
  (109, 'EDL', 'Enhanced');

INSERT INTO LICENSE_ENDORSEMENT
    (_ID, ABBREVIATION, DESCRIPTION) VALUES
  (201, 'P', 'Passenger Transport'),
  (202, 'H', 'Hazardous Materials'),
  (203, 'N', 'Tank Vehicles'),
  (204, 'T', 'Double/Triple Trailers'),
  (205, 'X', 'Hazardous Materials & Tank Combination'),
  (206, 'S', 'School Bus');

INSERT INTO LICENSE_RESTRICTION
    (_ID, ABBREVIATION, DESCRIPTION) values
  (301, 'B', 'Corrective Lenses are required while operating a motor vehicle.'),
  (302, 'C', 'A mechanical aid is required to operate a commercial vehicle.'),
  (303, 'D', 'A prosthetic aid is required to operate a commercial vehicle.'),
  (304, 'E', 'The driver may only operate a commercial vehicle with an automatic transmission.'),
  (305, 'F', 'An outside mirror is required on the commercial vehicle.'),
  (306, 'G', 'The driver of a commercial vehicle is only allowed to operate during daylight hours.'),
  (307, 'K', 'Drivers are authorized to drive a commercial vehicle within the state of issue (intrastate) only.'),
  (308, 'L', 'Drivers are restricted from operating a commercial vehicle with air brakes.'),
  (309, 'M', 'CDL-A holders may operate CDL-B school buses only.'),
  (310, 'N', 'CDL-A and CDL-B holders may operate CDL-C school buses only.'),
  (311, 'O', 'Driver limited to pintail hook trailers only.'),
  (312, 'Z', 'Alcohol Interlock Device required in the commercial vehicle.'),
  (313, 'T', '60-day temporary license.');