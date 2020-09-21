package Expt_2B;

public class Teacher extends Person
{
	 String qualification;
	 String subject;

	 void getdata(String name,String city, String subject,String qualification)
	{
		 this.name=name;
		 this.city=city;
		 this.qualification=qualification;
		 this.subject=subject;
	}

	 void display()
	 {
		 System.out.println("Name of teacher: "+ name);
		 System.out.println("City of teacher: "+ city);
		 System.out.println("Subject of Teacher: "+ subject);
		 System.out.println("Qualification of Teacher: "+ qualification);

	}
}
