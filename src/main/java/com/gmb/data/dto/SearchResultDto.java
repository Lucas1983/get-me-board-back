package com.gmb.data.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchResultDto {

  Integer length;
  String type;
}
