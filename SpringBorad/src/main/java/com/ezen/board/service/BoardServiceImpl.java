package com.ezen.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ezen.board.dto.BoardDTO;
import com.ezen.board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public void list(Model model) {
		model.addAttribute("boards", boardMapper.getAllwithReplyCount());
	}

	@Override
	public boolean detail(int board_id, Model model) {
		BoardDTO board = boardMapper.get(board_id);
		
		if (board != null) {
			model.addAttribute("board", board);
			return true;
		} else {
			return false;
		}
	}
	
	/** insert 성공시 pk를 반환, 실패시 0을 반환 */
	@Override
	public int write(BoardDTO dto) {
		int result = boardMapper.insert(dto);
		
		if (result == 1) {
			return dto.getBoard_id();
		} else {
			return result;
		}
	}

	@Override
	public int delete(BoardDTO dto) {
		int result = boardMapper.delete(dto);
		
		if (result == 1) {
			return dto.getBoard_id();
		} else {
			return result;
		}
	}

}

