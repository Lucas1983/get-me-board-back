package com.gmb.web.controller;

import com.gmb.business.service.BoardService;
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
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

  @NonNull private final BoardService boardService;

  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {

    return ResponseEntity.of(boardService.findOneById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() {

    return ResponseEntity.ok(boardService.findAll());
  }

  @GetMapping("/page")
  public ResponseEntity<Page<?>> getAll(Pageable pageable) {

    return ResponseEntity.ok(boardService.findAll(pageable));
  }
}
