package Expt_1;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("Enter the number for Fibonacci series: ");
		n = s.nextInt();
		
		int n1 = 0,n2 = 1,n3;    
		 System.out.print(n1 + " " + n2);		//printing 0 and 1    
		    
		 for(int i = 2; i < n; ++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3 = n1 + n2;    
		  
		  System.out.print(" " + n3);    
		  
		  n1 = n2;    
		  n2 = n3;    
		 }    
		
		s.close();
		}

}
