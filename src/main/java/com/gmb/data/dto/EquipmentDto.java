package com.gmb.data.dto;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public abstract class EquipmentDto {

  Long id;
  Brand brand;
  String model;
  Integer year;
  Flex flex;
  Level level;
}
