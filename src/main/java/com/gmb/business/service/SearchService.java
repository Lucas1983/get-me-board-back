package com.gmb.business.service;

import com.gmb.data.dto.SearchFilterDto;
import com.gmb.data.dto.SearchResultDto;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

  public SearchResultDto calculate(SearchFilterDto searchFilterDto) {

    Integer length = 0;
    String type = null;

    Long height = searchFilterDto.getHeight();
    Long weight = searchFilterDto.getWeight();

    if (searchFilterDto.getSex().equals("MALE")) {
      length = computeSizeForMale(height, weight);
    } else {
      length = computeSizeForFemale(height, weight);
    }
    return SearchResultDto.builder().length(length).type(type).build();
  }

  private int computeSizeForFemale(Long height, Long weight) {
    return 0;
  }

  private int computeSizeForMale(Long height, Long weight) {
    return 0;
  }
}
