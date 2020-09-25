package Expt_5;

import java.util.Scanner;

public class Expt_5C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.nextLine();
		
		String next = "";
		
		int n = str.length();
		
		if(n%2 != 0)
		{
			System.out.println("null");
		}
		else
		{
			for(int i = 0; i < n/2; i++)
			{
				next = next + str.charAt(i);
			}
		}
		System.out.println(next);
		s.close();
	}
}
