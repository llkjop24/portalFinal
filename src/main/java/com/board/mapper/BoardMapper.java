package com.board.mapper;

import com.board.domain.BoardVO;

import java.util.List;


public interface BoardMapper {

    public void boardInsert(BoardVO board)throws Exception;

    public List<BoardVO> boardList()throws Exception;


}