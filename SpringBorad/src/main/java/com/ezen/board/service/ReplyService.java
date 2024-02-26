package com.ezen.board.service;

import java.util.List;

import org.springframework.ui.Model;

import com.ezen.board.dto.ReplyDTO;

public interface ReplyService {
	
	List<ReplyDTO> getByBoardId(int board_id);
	
	void list(Model model);
	
	boolean detail(int Reply_id, Model model);
	
	int write(ReplyDTO dto);

	
}
