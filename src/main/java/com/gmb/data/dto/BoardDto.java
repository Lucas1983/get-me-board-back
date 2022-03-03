package com.gmb.data.dto;

import com.gmb.data.dictionary.Classification;
import com.gmb.data.dictionary.board.Base;
import com.gmb.data.dictionary.board.Core;
import com.gmb.data.dictionary.board.Profile;
import com.gmb.data.dictionary.board.Shape;
import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BoardDto extends EquipmentDto {

  Integer length;
  Classification classification;
  Profile profile;
  Shape shape;
  Core core;
  Base base;
}
