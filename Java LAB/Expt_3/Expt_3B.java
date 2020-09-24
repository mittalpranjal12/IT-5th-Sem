package Expt_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Expt_3B {
	
	public static double division(int a, int b) throws ArithmeticException 
	{
		return a / b;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        
		System.out.println("Enter two numbers: ");
		
		int x = s.nextInt();
        int y = s.nextInt();
        
        try{
            
        	double r = division(x,y);
            System.out.println(r);
        }
        catch(InputMismatchException e)
        {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e)
        {  
            System.out.println(e);
        }
        
        s.close();
	}

}
