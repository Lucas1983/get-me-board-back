package com.gmb.web.controller;

import com.gmb.business.service.BootsService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
  public ResponseEntity<?> getById(@PathVariable Long id) throws Exception {

    return ResponseEntity.of(bootsService.findOneById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() throws Exception {

    return ResponseEntity.ok(bootsService.findAll());
  }
}
