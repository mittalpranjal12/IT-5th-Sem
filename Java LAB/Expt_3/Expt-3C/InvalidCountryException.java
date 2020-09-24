package Expt_3;

public class InvalidCountryException extends Exception
{
	public InvalidCountryException() {
		super();
		System.out.println("User Outside India  cannot be registered");
	}
}
