package day5_06_04_22;

//import java.io.IOException;
import java.util.Scanner;

//class CustomException extends Exception {
//    /* Optional: Include Serial UID */
//
//    public CustomException(Throwable t) {
//        super(t);
//    }
//}

interface Login
{
	void login();
}


class Data
{
	String name, surname, email, mobile, passwd, conpass;
	Scanner sc = new Scanner(System.in);
	
	void setData()
	{
		
		
		System.out.print("Enter the name: ");
		name = sc.nextLine();
		
		System.out.print("Enter surname: ");
		surname = sc.nextLine();
		
		System.out.print("Enter email: ");
		email = sc.nextLine();
		
		System.out.print("Enter mobile no: ");
		mobile = sc.nextLine();
		
		System.out.print("Enter password: ");
		passwd = sc.nextLine();
		
		System.out.print("Confirm the password: ");
		conpass = sc.nextLine();
//		sc.close();
	}
}


class Child extends Data implements Login
{
	void registration()
	{
		System.out.println("name: " + name);
		System.out.println("surname: " + surname);
		System.out.println("email: " + email);
		System.out.println("mobile: " + mobile);
		System.out.println("password: " + passwd);
		
		System.out.println("\nUser Successfully registered");
		System.out.println();
	}
	
	void check()
	{
		if(email.contains("@"))
		{
			System.out.println("\nEmail contains @\n");
		}
		else
		{
			System.out.println("Email does not contains @");
		}
	}
	
	void convertMobile()
	{
		long mobileNo = Long.parseLong(mobile);
		System.out.println("Mobile: " + mobileNo);
	}
	
	void authorize() throws Exception
	{
		try
		{
			if(!passwd.equals(conpass))
			{
				throw new Exception("Hello");
			}
		}
		catch(Exception e)
		{
			System.out.println("Error password not same");
		}
		
	}

//	@SuppressWarnings("null")
	@Override
	public void login() {
		// TODO Auto-generated method stub
		String uname, password;
		System.out.print("\nEnter username: ");
		uname = sc.nextLine();
		System.out.print("Enter password: ");
		password = sc.nextLine();
		
		if(name.equals(uname) && passwd.equals(password))
		{
			System.out.println("You are authenticated");
		}
		else
		{
			System.out.println("Wrong password");
		}
	}
}


public class Registration {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Child c = new Child();
		
		c.setData();
		c.registration();
		
		c.check();
		c.convertMobile();
		
		c.authorize();
		c.login();
		
	}

}
