package net.codejava;

public class Main 
{
	public static void main(String[] args)
	{
		int dividedPopulation = 592307692;
		int givenYears = 3;
		int desiredYears = 50;
		System.out.println("If 13 disciples can train 2 people per year, then it will take " 
						+ yearsToConvert(dividedPopulation, givenYears) + " years to convert everyone.");
		System.out.println();
		System.out.println("If they want to convert everyone in " + desiredYears 
						+ " years, then each discple must train " + numberToConvert
						(dividedPopulation,desiredYears) + " people per year.");
	}
	
	public static int yearsToConvert(int p, int g)
	{
		int years = (p / 2) * g;
		return years;
	}
	
	public static int numberToConvert(int p, int y)
	{
		int num = p/y;
		return num;
	}
}