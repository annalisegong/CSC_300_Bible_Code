package net.codejava;

public class Main 
{
	public static void main(String[] args)
	{
		double dividedPopulation = 592307692+(4/13);
		int givenYears = 3;
		int desiredYears = 50;
		
		System.out.println("If the disciples can train 2 people per year, then it will take " 
						+ yearsToConvert(dividedPopulation, givenYears) + " years to convert everyone.");
		System.out.println();
		System.out.println("If they want to convert everyone in " + desiredYears 
						+ " years, then each disciple must train " + numberToConvert
						(dividedPopulation,desiredYears) + " people per year.");
	}
	
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