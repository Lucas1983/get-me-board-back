package com.gmb.web.controller;

import com.gmb.business.service.BindingsService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bindings")
@RequiredArgsConstructor
public class BindingsController {

  @NonNull private final BindingsService bindingsService;

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {

    return ResponseEntity.of(bindingsService.findOneById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() {

    return ResponseEntity.ok(bindingsService.findAll());
  }

  @GetMapping("/page")
  public ResponseEntity<Page<?>> getAll(Pageable pageable) {

    return ResponseEntity.ok(bindingsService.findAll(pageable));
  }
}
