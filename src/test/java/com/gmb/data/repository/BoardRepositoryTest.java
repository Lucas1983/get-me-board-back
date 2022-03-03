package com.gmb.data.repository;

import com.gmb.data.dictionary.Brand;
import com.gmb.data.dictionary.Classification;
import com.gmb.data.dictionary.Flex;
import com.gmb.data.dictionary.Level;
import com.gmb.data.dictionary.board.Base;
import com.gmb.data.dictionary.board.Core;
import com.gmb.data.dictionary.board.Profile;
import com.gmb.data.dictionary.board.Shape;
import com.gmb.data.model.Board;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BoardRepositoryTest {

  @Autowired BoardRepository boardRepository;

  Board board1 =
      Board.builder()
          .id(1L)
          .brand(Brand.SALOMON)
          .model("")
          .level(Level.BEGINNER)
          .flex(Flex.SOFT)
          .length(150)
          .classification(Classification.ALL_MOUNTAIN)
          .profile(Profile.FLAT)
          .shape(Shape.DIRECTIONAL)
          .core(Core.WOOD)
          .base(Base.EXTRUDED)
          .build();
  Board board2 =
      Board.builder()
          .id(2L)
          .brand(Brand.BURTON)
          .model("")
          .level(Level.INTERMEDIATE)
          .flex(Flex.MEDIUM)
          .length(155)
          .classification(Classification.FREERIDE)
          .profile(Profile.CAMBER)
          .shape(Shape.ASYMMETRICAL)
          .core(Core.ALUMINIUM)
          .base(Base.SINTERED)
          .build();
  Board board3 =
      Board.builder()
          .id(3L)
          .brand(Brand.DC)
          .model("")
          .level(Level.ADVANCED)
          .flex(Flex.STIFF)
          .length(160)
          .classification(Classification.FREESTYLE)
          .profile(Profile.ROCKER)
          .shape(Shape.TRUE_TWIN)
          .core(Core.KEVLAR)
          .base(Base.SINTERED)
          .build();

  @Test
  public void shouldFindByLength() {

    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byLength = boardRepository.findByLength(150);

    Assertions.assertThat(byLength).isNotEmpty().containsExactly(board1);
  }

  @Test
  public void shouldFindByClassification() {

    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byClassification =
        boardRepository.findByClassification(Classification.ALL_MOUNTAIN);

    Assertions.assertThat(byClassification).isNotEmpty().containsExactly(board1);
  }

  @Test
  public void shouldFindByProfile() {

    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byProfile = boardRepository.findByProfile(Profile.FLAT);

    Assertions.assertThat(byProfile).isNotEmpty().containsExactly(board1);
  }

  @Test
  public void shouldFindByShape() {
    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byShape = boardRepository.findByShape(Shape.DIRECTIONAL);

    Assertions.assertThat(byShape).isNotEmpty().containsExactly(board1);
  }

  @Test
  public void shouldFindByCore() {

    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byCore = boardRepository.findByCore(Core.WOOD);

    Assertions.assertThat(byCore).isNotEmpty().containsExactly(board1);
  }

  @Test
  public void shouldFindByBase() {

    boardRepository.saveAll(List.of(board1, board2, board3));

    List<Board> byBase = boardRepository.findByBase(Base.EXTRUDED);

    Assertions.assertThat(byBase).isNotEmpty().containsExactly(board1);
  }
}
