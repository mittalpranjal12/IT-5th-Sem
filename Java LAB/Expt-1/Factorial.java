package Expt_1;

import java.util.Scanner;

public class Factorial {

	public static int FactorialNum(int n)
	{
		if(n == 1 || n == 0)
		{
			return 1;
		}
		
		int ans = FactorialNum(n-1);
			return ans*n;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the number: ");
		n = s.nextInt();
		
		int fact = FactorialNum(n);
		
		System.out.println("The factorial of " + n + " is: " + fact);
		
		s.close();

	}

}
