package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.BoardVO;
@Mapper
public interface BoardMapper {
	
	
	/**
	 * @Since : 2022. 12. 9.
	 * @Author : mr.Choi
	 * @Return : List<BoardVO>
	 * @Comment : Board 테이블 조회
	 */
	List<BoardVO> selectBoard();
}
