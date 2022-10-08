package net.codejava;

public class BibleHW1 
{
	public static double yearsToConvert(double p, int g)
	{
		double years = (double) Math.pow(p,g);
		years =  (double) Math.log(years); 
		years = years / ((double) Math.log(g));
		
		return Math.round(years);
	}
	
	public static double numberToConvert(double p, double y)
	{
		double e = 3/y;
		double num = (Math.pow(p,e)-1);
		return num;
	}
}
