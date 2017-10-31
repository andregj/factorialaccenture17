package agj.project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class FactorialTest {

	private Factorial factorial;

	@Before
	public void init() {
		factorial = new Factorial();
	}

	@Test
	public void shouldFactoralOfZeroReturnOne() {

		long result = factorial.compute(0);
		long expectedValue = 1;
		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactoralOfOneReturnOne() {

		long result = factorial.compute(1);
		long expectedValue = 1;
		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactoralOfTwoReturnTwo() {

		long result = factorial.compute(2);
		long expectedValue = 2;
		assertEquals(expectedValue, result);
	}

	@Test
	public void shouldFactoralOfthreeReturnSix() {

		long result = factorial.compute(3);
		long expectedValue = 6;
		assertEquals(expectedValue, result);
	}

	@Test (expected =RuntimeException.class)
	public void shouldFactoralOfNegativeRaiseException() {

		factorial.compute(-1);
	}
	
	
}
