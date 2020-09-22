package Expt_3;

import java.util.Scanner;

public class UserRegistration {
	
	void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry!= "India") 
			throw new InvalidCountryException();
		else
			System.out.println("User  registration  done successfully");
	}
	
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	UserRegistration user = new UserRegistration();
	
	System.out.println("Enter the username and country: ");
	
	String u_name = s.nextLine();
	String country = s.nextLine();
	try
	{
		user.registerUser(u_name, country);
	}
	catch(InvalidCountryException e)
	{
		System.out.println(e);
	}
	s.close();	
  }
}
