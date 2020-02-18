package epam.task4;

public class CompoundInterest {
	public double CompoundInterestCalculator(int principle_amount,int time,double rate)
	{
		double compoundinterestcalculating=principle_amount*(Math.pow((1 + rate/100),time));
		return compoundinterestcalculating;
	}

}
