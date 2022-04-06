package day5_06_04_22;

import java.io.IOException;

public class Exception2 {
	
	static int calculator()
	{
		int n1 = 13, n2 = 12;
		
		int c = n1 - n2;
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = calculator();
		
		try
		{
			if(c == 0 || c < 0)
			{
				throw new IOException();	
			}
			else
			{
				System.out.println("no problem");
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception");
		}
		
		System.out.println("hi");
	}

}
