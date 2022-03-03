package com.gmb.data.dto;

import com.gmb.data.dictionary.bindings.Type;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BindingsDto extends EquipmentDto {

  Type type;
}
