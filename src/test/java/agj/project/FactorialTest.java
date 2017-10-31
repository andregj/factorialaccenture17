package agj.project;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
	
	@Test
	public void Testfact1(){
		Factorial factorial = new Factorial();
		long result = factorial.compute(0);
		long expectedValue =1;
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void Testfact2(){
		Factorial factorial = new Factorial();
		long result = factorial.compute(1);
		long expectedValue =1;
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void Testfact3(){
		Factorial factorial = new Factorial();
		long result = factorial.compute(2);
		long expectedValue =2;
		assertEquals(expectedValue, result);
	}
	
	@Test
	public void Testfact4(){
		Factorial factorial = new Factorial();
		long result = factorial.compute(3);
		long expectedValue =6;
		assertEquals(expectedValue, result);
	}

	@Test
	public void Testfact5(){
		Factorial factorial = new Factorial();
		long result = factorial.compute(4);
		long expectedValue =24;
		assertEquals(expectedValue, result);
	}
}
