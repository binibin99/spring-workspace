package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.EmployeeDTO;

public class EmployeeDAO {

	public List<EmployeeDTO> getEmpByDept(int fk) {
		String sql = "SELECT department_id FROM employees WHERE department_id = ?";
		List<EmployeeDTO> list = new ArrayList<>();

		try (DBSession session = DBConnector.getConnection();
			PreparedStatement pstmt = session.prepareStatement(sql);) {

			pstmt.setInt(1, fk);

			try (ResultSet rs = pstmt.executeQuery();) {

				while (rs.next()) {
					EmployeeDTO dto = new EmployeeDTO();
					dto.setDepartment_id(rs.getInt("department_id"));

					list.add(dto);
				}
			}
			if (list.isEmpty()) {
				return null;
			} else {
				return list;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
