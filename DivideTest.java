package ProgrammingKnowledge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTest {
	@Test
	public void Dividetest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.divide(20, 10);
		assertEquals(2,result);
	}

}
