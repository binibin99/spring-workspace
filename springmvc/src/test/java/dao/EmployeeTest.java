package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeTest {

	EmployeeDAO dao = new EmployeeDAO();
	
	
	
	@Test
	public void test1() {
		assertEquals(6, dao.getEmpByDept(30).size());
	}
	
	@Test
	public void test2() {
		assertNull(dao.getEmpByDept(99));
	}
	
}
