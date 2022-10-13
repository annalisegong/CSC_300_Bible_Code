package net.codejava;

public class Main 
{
	public static void main(String[] args)
	{
		long population = 7700000000L;
		int givenYears = 3;
		//int desiredYears = 50;
		
		//System.out.println("If the disciples can train 2 people per 3 years, then it will take " 
						//+ BibleHW1.yearsToConvert(population) + " years to convert everyone.");
		System.out.println();
		//System.out.print("If they want to convert everyone in " + desiredYears 
					//	+ " years, then each disciple must train " + 
					//	BibleHW1.numberToConvert(population,desiredYears) + " people per year.");*/
		
		long totalConverted = 13L; // assume starting age = 21
		int ageOfStartPopulation = 18;
		long startPopulation = 7700000000L;
		
		long totalPopulation = BibleHW2.findPopulation(totalConverted, ageOfStartPopulation, startPopulation);
		System.out.println(BibleHW2.yearsToConvert(totalPopulation) + " years to convert the entire pooulation");
		
	}
}