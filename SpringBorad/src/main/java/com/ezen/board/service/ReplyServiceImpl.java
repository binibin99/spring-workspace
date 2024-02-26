package com.ezen.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.ezen.board.dto.ReplyDTO;
import com.ezen.board.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService {

	@Autowired
	ReplyMapper replyMapper;

	@Override
	public List<ReplyDTO> getByBoardId(int board_id) {
		return replyMapper.getByBoardId(board_id);
	}

	@Override
	public void list(Model model) {
		model.addAttribute("replies", replyMapper.getAll());
	}

	@Override
	public boolean detail(int reply_id, Model model) {
		ReplyDTO reply = replyMapper.get(reply_id);

		if (reply != null) {
			model.addAttribute("reply", reply);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int write(ReplyDTO dto) {
		int result = replyMapper.insert(dto);

		if (result == 1) {
			return dto.getReply_id();
		} else {
			return result;
		}
	}

}
