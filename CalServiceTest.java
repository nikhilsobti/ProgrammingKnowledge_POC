package ProgrammingKnowledge;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import junit.framework.Assert;

public class CalServiceTest {

	CalService calService;
	
	@Before
	public void setup()
	{
		ICalculator cal = mock(ICalculator.class);
		when(cal.add(3, 3)).thenReturn(6);
		calService = new CalService();
		calService.setCal(cal);
	}
	
	@Test
	public void testAddTwoNumbers()
	{
		Assert.assertEquals(6, calService.addTwoNumbers(3, 3));
	}
}
