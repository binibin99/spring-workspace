package commons;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calculator = new Calculator();
	
	@Before
	public void before() {
		System.out.println("Before!");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1!");
		// assertEquals(expect, actual) : 기대하던 값이 나오면 테스트 성공 아니면 실패
		assertEquals(5, calculator.diff(15, 10));
	}
	
	@Test
	public void test2() {
		System.out.println("Test2!");
		assertEquals(5, calculator.diff(10, 15));
	}
}
