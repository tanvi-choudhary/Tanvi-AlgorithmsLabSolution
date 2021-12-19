package algorithmsLabSolution;

import java.util.Scanner;


public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int trans = sc.nextInt();
		int[] array = new int[trans];
	
		int[] val = new int[array.length];
		
		System.out.println("Enter the values of array ");
		for(int i = 0;i< (array.length); i++) 
		{	
			val[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targ = sc.nextInt();
		int[] target = new int[targ];
		
		int[] valTarg = new int[target.length];
		
		boolean flag = true;
		while (flag) 
		{
		for(int k = 0;k< (valTarg.length); k++) 
		{
			System.out.println("Enter the value of target ");
			valTarg[k] = sc.nextInt();
		    int x = valTarg[k];
		    
			    int total = 0;
			    int r = 0;
			    boolean match = false;
				for(int s=0; s< val.length ;s++)
				{
					
					total = val[s]+total;
					if(total >= x)
					{
						 r = s+1;
						System.out.println("Target achieved after " +r +" transactions");
						System.out.println();
						match = true;
						break;
					}

				}
				flag = false;

				if(!match)
				{
				System.out.println("Given target is not achieved");
					flag = false;
				}
		   }	
			
		
		}
		flag = false;
		sc.close();
	}
		

}
