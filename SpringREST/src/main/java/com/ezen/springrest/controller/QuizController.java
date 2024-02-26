package com.ezen.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springrest.dto.EmployeeDTO;

@RequestMapping("/quiz")
@Controller
public class QuizController {

	@GetMapping(value = "/r1", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDTO ramdom1() {
		List<EmployeeDTO> empList = new ArrayList<>();
		
		EmployeeDTO emp = new EmployeeDTO();
		
		
		return emp;
	}
	
	// jackson-dataformat-xml : DTO를 XML 형식 문자열로 응답해주는 라이브러리
	
	@GetMapping(value = "/r2", produces = MediaType.APPLICATION_XML_VALUE)
	public EmployeeDTO ramdom2() {
		EmployeeDTO emp = new EmployeeDTO();
		
	
		
		return emp;
	}
}
