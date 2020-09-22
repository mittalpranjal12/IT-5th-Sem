package Expt_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Expt_3A {
	
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		
		int a[] = new int[5];
		
		System.out.println("Enter the 5 numbers: ");
		
		try {
				for(int i = 0; i < 5; i++)
				{
					a[i] = s.nextInt();
				}
				int sum = 0;
				
					for(int j = 0; j < 5; j++)
					{
						sum = sum + a[j];
					}
					int avg = sum/5;
					
					System.out.println("sum = " + sum);
					System.out.println("average = " + avg);
			}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
		}
		s.close();
	}
		
}
