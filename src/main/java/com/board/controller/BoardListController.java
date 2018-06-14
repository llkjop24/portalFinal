package com.board.controller;

import com.board.domain.BoardVO;
import com.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class BoardListController {

    @Autowired
    private BoardMapper boardMapper;

    @RequestMapping("/board")
    public ModelAndView board() throws Exception {
        List<BoardVO> board = boardMapper.boardList();
        return new ModelAndView("boardList","list",board);
    }
}
