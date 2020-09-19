package Expt_2A;

public class Circle extends Shape
{
	void getdata(float a)
	{
		radius=a;
	}
	
	void calcarea()
	{
		 System.out.println("Area of circle "+ 3.14*radius*radius);
	}
	
	void calcper()
	{
		 System.out.println("Perimeter of circle "+ 3.14*radius*2);
	}
}
