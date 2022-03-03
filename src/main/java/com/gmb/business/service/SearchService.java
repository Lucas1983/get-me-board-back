package com.gmb.business.service;

import com.gmb.data.dto.SearchFilterDto;
import com.gmb.data.dto.SearchResultDto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

  public SearchResultDto calculate(SearchFilterDto searchFilterDto) {

    return SearchResultDto.builder().boards(List.of()).boots(List.of()).bindings(List.of()).build();
  }
}
