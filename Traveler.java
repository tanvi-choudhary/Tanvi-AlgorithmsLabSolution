package algorithmsLabSolution;

import java.util.*;

public class Traveler 
{

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int curr = sc.nextInt();
		int[] array = new int[curr];
	
		int[] denom = new int[array.length];
	
		
		System.out.println("Enter the currency denominations value ");
		for(int i = 0;i< (array.length); i++) 
		{	
			denom[i] = sc.nextInt();
		}
		
		Arrays.sort(denom);
		
				
		System.out.println("Enter the amount you want to pay");
		int amt = sc.nextInt();
		
		int [] counter  = new int[array.length];

		
		for(int j = array.length-1; j>=0; j--)
		{
			
			if(denom[j]<=amt)
			{
				//System.out.println("Amount "+ amt);
				//System.out.println(denom[j]);
				counter[j]= amt/denom[j];  //no of notes required of highest denomination
				amt = amt - counter[j] * denom[j]; //to find left amount after highest denomination
				
			}
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int j = array.length-1; j>=0; j--)
		{
			if(counter[j] != 0) 
			{
				System.out.println( denom[j] + ":" + counter[j]);
			}
		}
		
		sc.close();
	}

}
