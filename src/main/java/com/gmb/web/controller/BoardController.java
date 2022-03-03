package com.gmb.web.controller;

import com.gmb.business.service.BoardService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
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
  public ResponseEntity<?> getById(@PathVariable Long id) throws Exception {

    return ResponseEntity.of(boardService.findOneById(id));
  }

  @GetMapping
  public ResponseEntity<?> getAll() throws Exception {

    return ResponseEntity.ok(boardService.findAll());
  }
}
