package com.ezen.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyDTO {
	private Integer reply_id; // 댓글 번호 PK
	private Integer board_id; // 글 번호 FK
	private String reply_writer;
	private String reply_content;
	private String reply_password;
	private Date reply_date;
}
