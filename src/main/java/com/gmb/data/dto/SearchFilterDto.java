package com.gmb.data.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchFilterDto {

  Long height;
  Long weight;
  Long size;
  String skill;
  String ride;
  String sex;
}
