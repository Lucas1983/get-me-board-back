package com.gmb.data.dto;

import com.gmb.data.dictionary.boots.Lacing;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BootsDto extends EquipmentDto {

  Lacing lacing;
}
