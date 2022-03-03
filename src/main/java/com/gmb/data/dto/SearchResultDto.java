package com.gmb.data.dto;

import java.util.List;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchResultDto {

  List<BoardDto> boards;
  List<BindingsDto> bindings;
  List<BootsDto> boots;
}
