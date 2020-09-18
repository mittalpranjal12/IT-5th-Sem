package Expt_1;

import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number to check for Armstrong: ");
		n = s.nextInt();
		
		int digit = 0;
		int rem = 0;
		int ans = 0;
		int num = n;

		 for(n = num;num != 0;num /= 10,++digit);
	    {
	    	
	        num = n;
	    }
		while(num != 0)
		{
			rem = num%10;
			ans = ans + (int)Math.pow(rem,digit);
			num/=10;
		}
		
		if(ans == n) {
        	System.out.println("The number is an Armstrong number.");
        }else {
        	System.out.println("The number is not an Armstrong number.");
        }
		
		s.close();
	}

}
