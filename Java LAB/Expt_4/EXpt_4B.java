package Expt_4;

class even extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 20; i++)
        {
        	if(i % 2 == 0)
        	{
        		System.out.println("Even number " + ": " + i);	
        	}
        }
    }
}

class odd extends Thread
{
    public void run()
    {
        for(int j = 1; j < 20; j++)
        {
        	if(j % 2 != 0)
        	{
        		System.out.println("Odd number" + ": " + j);
        	}
        }
    }
}

public class EXpt_4B {
	public static void main(String ar[])
    {
        even e1 = new even();
        odd o1 = new odd();
        e1.start();
        o1.start();
    }
}
