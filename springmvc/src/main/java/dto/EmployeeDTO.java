package dto;

public class EmployeeDTO {
	
	private Integer department_id;

	public EmployeeDTO() {}
	
	public EmployeeDTO(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	
}