package com.ezen.springmvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Department {
	@Setter
	private Integer department_id;
	@Getter @Setter
	private String department_name;
	@Getter @Setter
	private Integer manager_id;
	@Getter @Setter
	private Integer location_id;
	
}
