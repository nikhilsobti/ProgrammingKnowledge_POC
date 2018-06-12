package ProgrammingKnowledge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {
	@Test
	public void Multiplytest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.multiply(10, 20);
		assertEquals(200,result);
	}

}
