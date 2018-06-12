package ProgrammingKnowledge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubtractTest {
	@Test
	public void Subtracttest() {
		MyJUnitClass junit = new MyJUnitClass();
		int result = junit.subtract(100, 200);
		assertEquals(-100,result);
	}

}
