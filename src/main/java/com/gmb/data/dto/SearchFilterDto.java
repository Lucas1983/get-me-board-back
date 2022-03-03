package com.gmb.data.dto;

import lombok.Value;

@Value
public class SearchFilterDto {

  Long height;
  Long weight;
  Long size;
  String skill;
  String ride;
  String sex;
}
