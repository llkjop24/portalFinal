package kr.ac.jejunu.portalfinal.mapper;

import kr.ac.jejunu.portalfinal.domain.BoardVO;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper {

    public void boardInsert(BoardVO board) throws Exception;
}
