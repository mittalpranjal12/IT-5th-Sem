package Expt_4;


	class t1 extends Thread
	{
	    public void run()
	    {
	        for(int i =0;i<100;i++)
	        {
	            System.out.println("T1" + ":" + i);
	        }
	    }
	}
	class t2 extends Thread
	{
	    public void run()
	    {
	        for(int j =0;j<100;j++)
	        {
	            System.out.println("T2" + ":" + j);
	        }
	    }
	}
	public class javatest {
	    public static void main(String ar[])
	    {
	        t1 o1 = new t1();
	        t2 o2 = new t2();
	        o1.start();
	        o2.start();
	    }
	}

