package net.codejava;

public class Main 
{
	public static void main(String[] args)
	{
		double dividedPopulation = 592307692+(4/13);
		int givenYears = 3;
		int desiredYears = 50;
		
		System.out.println("If the disciples can train 2 people per year, then it will take " 
						+ BibleHW1.yearsToConvert(dividedPopulation, givenYears) + " years to convert everyone.");
		System.out.println();
		System.out.print("If they want to convert everyone in " + desiredYears 
						+ " years, then each disciple must train " + 
						BibleHW1.numberToConvert(dividedPopulation,desiredYears) + " people per year.");
	}
}