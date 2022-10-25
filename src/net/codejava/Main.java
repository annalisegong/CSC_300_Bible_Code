package net.codejava;

public class Main 
{
	public static void main(String[] args)
	{
		/* Bible hw 1 
		 * long population = 7700000000L;
		int givenYears = 3;
		int desiredYears = 50;
		
		System.out.println("If the disciples can train 2 people per 3 years, then it will take " 
						+ BibleHW1.yearsToConvert(population) + " years to convert everyone.");
		System.out.println();
		System.out.print("If they want to convert everyone in " + desiredYears 
						+ " years, then each disciple must train " + 
						BibleHW1.numberToConvert(population,desiredYears) + " people per year.");*/
		/*Bible hw 2
		long totalConverted = 13L; // assume starting age = 21
		int ageOfStartPopulation = 18;
		long startPopulation = 7700000000L;
		
		long totalPopulation = BibleHW2.findPopulation(totalConverted, ageOfStartPopulation, startPopulation);
		System.out.println(BibleHW2.yearsToConvert(totalPopulation) + " years to convert the entire pooulation");*/
		
		// Bible hw 3
		long currentConverted = 2300000000L; // assume starting age = 21
		long yearsToConvert = BibleHW3.numberConverted(currentConverted);
		
		System.out.println(yearsToConvert + " years is an estimate of how long it will take to"
				+ " train at least 2.3 billion people if circumstancial events occur");
	}
}