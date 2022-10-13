package net.codejava;

public class BibleHW1 
{
	public static int yearsToConvert(long population)
	{
		long disciples = 13L;
		int years = 0;
		while(disciples <= population)
		{
			disciples = disciples * 3;
			years = years + 3; 
		}
		return years;
	}
	
	public static double numberToConvert(double p, double y)
	{
		double e = 3/y;
		double num = (Math.pow(p,e)-1);
		return num;
	}
}
