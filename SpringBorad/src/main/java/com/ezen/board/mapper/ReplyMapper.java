package com.ezen.board.mapper;

import java.util.List;

import com.ezen.board.dto.ReplyDTO;

public interface ReplyMapper {
	
	List<ReplyDTO> getByBoardId(int board_id);

	List<ReplyDTO> getAll();

	ReplyDTO get(int reply_id);

	int insert(ReplyDTO dto);

}
