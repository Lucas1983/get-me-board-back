package com.gmb.business.service;

import com.gmb.data.model.Board;
import com.gmb.data.repository.BoardRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService implements EquipmentService<Board> {

  @NonNull private final BoardRepository boardRepository;

  @Override
  public Optional<Board> findOneById(Long id) {
    return boardRepository.findById(id);
  }

  @Override
  public Collection<Board> findAll() {
    Collection<Board> coll = new ArrayList<>();
    boardRepository.findAll().forEach(coll::add);
    return coll;
  }

  @Override
  public void create(Board board) {
    boardRepository.save(board);
  }

  @Override
  public void update(Board board) {
    boardRepository.save(board);
  }

  @Override
  public void remove(Board board) throws Exception {
    boardRepository.delete(board);
  }

  @Override
  public void removeById(Long id) throws Exception {
    boardRepository.deleteById(id);
  }
}
