package epam.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void test() {
		CompoundInterest test = new CompoundInterest();
		double compoundinterestcalcullatingouput=test.CompoundInterestCalculator(1200, 2, 5.4);
		assertEquals(1333.0992,compoundinterestcalcullatingouput,0);
	}

}
