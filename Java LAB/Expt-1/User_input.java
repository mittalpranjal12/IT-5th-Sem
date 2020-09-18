package Expt_1;

import java.util.Scanner;

public class User_input {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,d;

		System.out.println("Enter four numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		d = s.nextInt();
		
		if(a > b && a > c && a > d)
		{
				System.out.println(a + " is the greatest");
		}
		else if(b > c && b > d)
		{
			System.out.println(b + " is the greatest");
		}
		else if(c > d)
		{
			System.out.println(c + " is the greatest");
		}
		else {
			System.out.println(d + " is the greatest");
		}
		
		if(a < b && a < c && a < d)
		{
			System.out.println(a + " is the smallest");	
		}
		else if(b < c && b < d)
		{
			System.out.println(b + " is the smallest");	
		}
		else if(c < d)
		{
			System.out.println(c + " is the smallest");	
		}
		else
		{
			System.out.println(d + " is the smallest");	
		}
		
		// Calculate average of numbers
		float avg = (float)(a + b + c + d)/4;
		
		System.out.println("Average of four numbers is: " + avg);
		
		s.close();
		}

}
