package day4_05_04_22;

import java.util.Scanner;

class Registration
{
	Scanner sc = new Scanner(System.in);
	String name, surname, passwd, conpasswd="", email;
	StringBuffer mobile = new StringBuffer();
	
	void getData()
	{
		System.out.print("Enter the name: ");
        name = sc.nextLine();

        System.out.print("Enter the surname: ");
        surname = sc.nextLine();
        
        System.out.print("Enter mobile number: ");
        mobile.insert(0, sc.nextLine());
        
        System.out.print("Enter the password: ");
        passwd = sc.nextLine();

        System.out.print("Confirm the password: ");
        conpasswd = sc.nextLine();
        
        if(passwd.equals(conpasswd)){
            System.out.println("Password done");;
        }else{
            System.out.println("Wrong Password");
        }
        
        email = name + surname + mobile.substring(0, 4) + "@gmail.com";
        System.out.println("Email: "+email);
	}
//	System.out.println("hi");
	void initial(){
		System.out.println("First character of name " + name + " is: " + name.charAt(0));
        System.out.println("First character of surname " + surname + " is: " + surname.charAt(0));
    }
	
	void replace_mo(){
        mobile.replace(0,11,"1234567890");
        System.out.println("Mobile: "+mobile);
        mobile.replace(2, 4, "66");
        System.out.println("After replace Mobile: "+mobile);
    }

    void check(){
        System.out.println("Name contains: "+name.contains("a"));
    }

    void reverse(){
        System.out.println("Reverse mobile number: "+mobile.reverse());
    }

    void m_split(){
        String arr[] = mobile.toString().split("66");
        System.out.println("\nAfter split: ");
        for(String data:arr)
            System.out.println(data);
    }

    void e_split(){
//        char char_only[] = new char[100];
//        int int_only[] = new int[100];
//        char special_only[] = new char[100];
        
        char emailArray[] = email.toCharArray();
        
        StringBuffer char_ = new StringBuffer();
        StringBuffer int_ = new StringBuffer();
      	StringBuffer special_ = new StringBuffer();
        
        for(int i=0;i<email.length();i++)
        {
        	if(emailArray[i] >= '0' && emailArray[i] <= '9')
        	{
        		int_.append(emailArray[i]);
       		}
        	else if((emailArray[i] >= 'a' && emailArray[i] <= 'z') || (emailArray[i] >= 'A' && emailArray[i] <= 'Z') )
        	{
        		char_.append(emailArray[i]);
        	}
        	else
        	{
        		special_.append(emailArray[i]);
        	}
        	
//        	if(Character.isDigit(email.charAt(i)))
//        	{
//        		int_.append(email.charAt(i));
//        	}
//        	else if(Character.isAlphabetic(email.charAt(i)))
//        	{
//        		char_.append(email.charAt(i));
//        	}
//        	else
//        	{		
//        		special_.append(emailArray[i]);
//        	}
        }
        
         System.out.println("integers: " + int_);
         System.out.println("characters: " + char_);
         System.out.println("specials: " + special_);
    }
}

public class Strings
{
    public static void main(String[] args) {
    	
    	Registration r1 = new Registration();
        r1.getData();

        System.out.println("Printing Initials of name and surname...");
        r1.initial();
        System.out.println("Replacing mobile number...!");
        r1.replace_mo();
        r1.check();
        r1.reverse();
        r1.m_split();
        r1.e_split();
    }
}