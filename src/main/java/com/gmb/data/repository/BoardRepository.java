package com.gmb.data.repository;

import com.gmb.data.dictionary.Classification;
import com.gmb.data.dictionary.board.Base;
import com.gmb.data.dictionary.board.Core;
import com.gmb.data.dictionary.board.Profile;
import com.gmb.data.dictionary.board.Shape;
import com.gmb.data.model.Board;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends EquipmentRepository<Board>, CrudRepository<Board, Long> {

  List<Board> findByLength(Integer length);

  List<Board> findByClassification(Classification classification);

  List<Board> findByProfile(Profile profile);

  List<Board> findByShape(Shape shape);

  List<Board> findByCore(Core core);

  List<Board> findByBase(Base base);
}
