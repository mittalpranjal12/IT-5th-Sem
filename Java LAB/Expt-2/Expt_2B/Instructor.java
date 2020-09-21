package Expt_2B;

import java.util.Scanner;

public class Instructor
{

	public static void main(String[] args)
	{
		Student s = new Student();
		Teacher t = new Teacher();

		Scanner sc = new Scanner (System.in);

		System.out.println("Enter name of student: ");
		String a = sc.nextLine();

		System.out.println("Enter city of student: ");
		String b = sc.nextLine();

		System.out.println("Enter roll No:");
		int c = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter branch: ");
		String d = sc.nextLine();


		System.out.println("Enter name of Teacher: ");
		String e = sc.nextLine();

		System.out.println("Enter city of Teacher: ");
		String f = sc.nextLine();

		System.out.println("Enter subject:");
		String g = sc.nextLine();

		System.out.println("Enter quaification: ");
		String h = sc.nextLine();



		s.getdata(a,b,d,c);
		s.display();

		t.getdata(e,f,g,h);
		t.display();
		
		sc.close();
	}
}

