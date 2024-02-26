package com.ezen.board.service;

import org.springframework.ui.Model;

import com.ezen.board.dto.BoardDTO;

public interface BoardService {

	void list(Model model);
	
	boolean detail(int board_id, Model model);
	
	int write(BoardDTO dto);

	int delete(BoardDTO dto);
}
