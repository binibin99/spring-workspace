package com.ezen.board.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {
	private Integer board_id;
	private String board_title;
	private String board_content;
	private String board_password;
	private String board_writer;
	private Integer view_count;
	private Date write_date;
	private Integer reply_count;
}
