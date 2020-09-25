package Expt_5;

import java.util.Scanner;

public class Expt_5B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.nextLine();
		
		String next = "";
		
		int n = str.length();
		
		for(int i = 0; i < n; i++)
		{
			next = next + str.charAt(0) + str.charAt(1);
		}
		System.out.println(next);
		s.close();
	}

}
