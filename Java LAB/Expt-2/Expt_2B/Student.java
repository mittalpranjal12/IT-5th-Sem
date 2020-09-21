package Expt_2B;

public class Student extends Person
{
	   int rollNo;
	   String branch;

	   void getdata(String name,String city,String branch,int rollNo)
	   {
			 this.name=name;
			 this.city=city;
			 this.rollNo=rollNo;
			 this.branch=branch;
		}
	   
		void display()
		{
			 System.out.println("Name of student: "+name);
			 System.out.println("City of student: "+city);
			 System.out.println("roll no of student: "+rollNo);
			 System.out.println("branch of student: "+branch);
		}
}

