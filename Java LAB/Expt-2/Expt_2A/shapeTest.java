package Expt_2A;

import java.util.Scanner;

public class shapeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius:");
		float a=sc.nextFloat();
		
		System.out.println("Enter side:");
		float b=sc.nextFloat();
		
		Circle circle=new Circle();
		Square square =new Square();
		
		circle.getdata(a);
		circle.calcarea();
		circle.calcper();
		square.getdata(b);
		square.calcarea();
		square.calcper();
		
		sc.close();
		}
}
