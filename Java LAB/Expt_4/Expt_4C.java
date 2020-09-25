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

public class Expt_4C {
	public static void main(String ar[])
    {
        number n1 = new number();
        number n2 = new number();
        number n3 = new number();
        
        n1.start();
        n2.start();
        
        n3.stop();
        
        System.out.println("Thread n3 is stopped...");
    }
}
