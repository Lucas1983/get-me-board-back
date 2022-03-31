package com.gmb.web.controller;

import com.gmb.business.service.BootsService;
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
@RequestMapping("/boots")
@RequiredArgsConstructor
public class BootsController {
  @NonNull private final BootsService bootsService;

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {

    return ResponseEntity.of(bootsService.findOneById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() {

    return ResponseEntity.ok(bootsService.findAll());
  }

  @GetMapping("/page")
  public ResponseEntity<Page<?>> getAll(Pageable pageable) {

    return ResponseEntity.ok(bootsService.findAll(pageable));
  }
}
