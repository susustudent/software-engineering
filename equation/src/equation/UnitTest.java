package equation;
import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	
	@Test
	public void test() {
		Complex x1 = new Complex();
		Complex x2 = new Complex();
		Complex x3 = new Complex(-1, 0);
		Equation x = new Equation(1, 2, 1);
		
		x.Count(x1, x2);
		x1.Output(); x2.Output();
		assertEquals(x3.re, x1.re, 0.00001); assertEquals(x3.re, x2.re, 0.00001);
	}
	
	@Test (expected = FirstCoefficientIsZeroException.class)
	public void test_first_coeff_is_zero()
	{
		Equation x = new Equation(0, 2, 1);
	}
}
