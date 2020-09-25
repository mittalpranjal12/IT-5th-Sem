package Expt_4;

class number extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
        	try 
        	{
        		if(i == 5)
        		{
        			sleep(5000);
        			System.out.println("Sleeping...");
        		}
        		
        	}
        	catch(Exception e)
        	{
        		
        	}
            System.out.println("Number" + ": " + i);
        }
    }
}

public class Expt_4A {
	public static void main(String ar[])
    {
        number n1 = new number();
        n1.start();
    }
}
