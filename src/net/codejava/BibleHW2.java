package net.codejava;

public class BibleHW2 
{
	
	public static long findPopulation(long totalConverted, int ageOfStartPopulation, long startPopulation)
	{
		int years = 0;
		int ageOfKids = 0;
		long numOfKids = 0;
		//long newlyConverted = 0;
		//long canBeConverted = startPopulation;
		long totalPopulation = startPopulation;
		
		while(years <= 132)
		{	
			if(ageOfStartPopulation == 30)
			{
				numOfKids = startPopulation * 2;
				totalPopulation = totalPopulation + numOfKids;
			}
			else if(ageOfStartPopulation > 30 || ageOfStartPopulation != 72)
			{
				if(ageOfKids == 18) //can start being trained
				{
					//numOfKids = startPopulation * 2;
					//canBeConverted = canBeConverted + numOfKids;
				}
				else if(ageOfKids == 30)
				{
					numOfKids = numOfKids * 2;
					//canBeConverted = canBeConverted + numOfKids;
					totalPopulation = totalPopulation + numOfKids;
				}
				ageOfKids++;
			}
			else if(ageOfStartPopulation == 72)
			{
				totalPopulation = totalPopulation - startPopulation;
				ageOfKids++;
			}
			ageOfStartPopulation++;
			years++;
		
			/*if(years > 0 && years % 3 == 0)
			{
				newlyConverted = totalConverted * 2;
				totalConverted = totalConverted + newlyConverted;
				//canBeConverted = canBeConverted - newlyConverted;
			}*/
		}	
		return totalPopulation;
	}
	
	public static int yearsToConvert(long totalPopulation)
	{
		long disciples = 13L;
		int yearsToConvert = 0;
		
		while(disciples <= totalPopulation)
		{
			disciples = disciples * 3;
			yearsToConvert = yearsToConvert + 3;
		}
		return yearsToConvert;
	}
}