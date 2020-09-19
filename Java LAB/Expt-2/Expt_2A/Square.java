package Expt_2A;

public class Square extends Shape
{
	void getdata(float a)
	{
		 side=a;
	}
	
	void calcarea()
	{
		 System.out.println("Area of square "+ side*side);
	}
	
	void calcper()
	{
		 System.out.println("Perimeter of square "+ 4*side);
	}
}
