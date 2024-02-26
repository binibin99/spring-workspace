package com.ezen.springdb.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
	//DB의 컬럼명과 정확하게 일치하도록 작성하는 것이 좋다
	
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Double salary;
	private Double commission_pct;
	private String job_id;
	private Integer department_id;
	private Integer manager_id;
	
}
