package Expt_5;

import java.util.Scanner;

public class Expt_5A {
//Check for palindrome
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s.nextLine();
		String str_rev = "";
		
		//to check for palindrome
		for(int i = 0; i < str.length(); ++i)
		{
			str_rev = str.charAt(i) + str_rev;
		}
		if(str.equals(str_rev))
		{
			System.out.println("The string is a palindrome");
		}
		else
		{
			System.out.println("The string is not palindrome");
		}
		s.close();
	}
}
