package com.gmb.data.mapper;

import com.gmb.data.dto.BoardDto;
import com.gmb.data.model.Board;
import org.mapstruct.Mapper;

@Mapper
public interface BoardMapper {

  Board toBoard(BoardDto dto);

  BoardDto fromBoard(Board record);
}
