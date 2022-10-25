package net.codejava;
import java.util.Random;

public class BibleHW3 
{
	public static long numberConverted(long totalConverted)
	{
		Random rand = new Random();
		long disciple = 13l;
		int count = 1;
		
		while(disciple <= totalConverted)
		{
			boolean reject = randomReject();
			boolean disaster = randomDisaster(); 
			
			if(reject == true)
			{
				// no increase in disciple because people who can be trained refuse to be trained
				count++;
			}
			else if(disaster == true) // disaster = i.e. mass shooting or natural disaster
			{
				// num must be less than disciple
				// 68000 is the average number of people who die by a natural disaster per year
				long num = rand.nextInt(68000); 
				disciple = disciple - num;
				count++;
			}
			else
			{
				if(count % 3 == 0)
				{
					disciple = disciple * 3;
					count = count + 3;
				}
				else
				{
					count++;
				}
			}
		}
		return count;
	}
	
	public static boolean randomReject()
	{
		Random rand = new Random();
		int num  = rand.nextInt(10000);
		
		boolean result = true; 
		// % 30 == 0 because 2.3 billion is about one third of 7.7 billion
		if(num % 30 == 0)
		{
			result = false; // do not reject; become disciples
		}
		return result;
	}
	
	public static boolean randomDisaster()
	{
		Random rand = new Random();
		int num  = rand.nextInt(10000);
		
		boolean result = false;
		// % 40 == 0 because disasters cause 4% of deaths per year
		if(num % 40 == 0)
		{
			result = true;
		}
		return result;
	}
}