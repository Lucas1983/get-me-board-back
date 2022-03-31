package com.gmb.web.controller;

import com.gmb.business.service.SearchService;
import com.gmb.data.dto.SearchFilterDto;
import com.gmb.data.dto.SearchResultDto;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SearchController {

  @NonNull private final SearchService searchService;

  @PostMapping(("/search"))
  public SearchResultDto searchAccordingToFilter(@RequestBody SearchFilterDto searchFilterDto) {
    return searchService.calculate(searchFilterDto);
  }
}
