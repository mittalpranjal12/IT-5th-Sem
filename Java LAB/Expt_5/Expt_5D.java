package Expt_5;

import java.util.Scanner;

public class Expt_5D {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String a = s.nextLine();
		String b = s.nextLine();
		
		int alen = a.length();
		int blen = b.length();
		String next = "";
		
		int len = Math.min(alen,blen);
		
		for(int i = 0; i < len; i++)
		{
			next = next + a.charAt(i) + b.charAt(i);
		}
		
		if(len == alen)
		{
			if(alen != blen)
			{
				next = next + b.substring(len-1);
			}
		}
		else
		{
			next = next + a.substring(len-1);
		}
		System.out.println(next);
		s.close();
	}

}
