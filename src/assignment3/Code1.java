package assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n;
		String number;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total numbers: ");
		n = sc.nextInt();
		
		File folder = new File("numbersCode");
		if(folder.exists())
		{
//			System.out.println("Already exists");
		}
		else
		{
			folder.mkdir();
		}
		
		File numbers = new File("numbersCode/numbers.txt");
		if(numbers.exists())
		{
//			System.out.println("numbers file already exists");
		}
		else
		{
			numbers.createNewFile();
		}
		
		FileWriter fw = new FileWriter("numbersCode/numbers.txt");
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter " + (i+1) + "th element: ");
			number = sc.next();
			fw.write(number + " ");
		}
		fw.close();
		
		try (Scanner file = new Scanner(numbers)) {
			FileWriter feven = new FileWriter("numbersCode/even.txt");
			FileWriter fodd = new FileWriter("numbersCode/odd.txt");
			
			while(file.hasNext())
			{
				String word = file.next();

//			System.out.println(word);
				
				if(Integer.parseInt(word) % 2 == 0)
				{
					feven.write(word + " ");
				}
				else if(Integer.parseInt(word) % 2 != 0)
				{
					fodd.write(word + " ");
				}
			}
			
			feven.close();
			fodd.close();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}



//package assignment3;
//
////import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Code1 {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		File folder = new File("numbersCode");
//		if(folder.exists())
//		{
//			System.out.println("Already exists");
//		}
//		else
//		{
//			folder.mkdir();
//		}
//		
//		File numbers = new File("numbersCode/numbers.txt");
//		if(numbers.exists())
//		{
//			System.out.println("numbers file already exists");
//		}
//		else
//		{
//			numbers.createNewFile();
//		}
//		
//		FileWriter fw = new FileWriter("numbersCode/numbers.txt");
//		char arr[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
////		int arr[] = {0,1,2,3,4,5,6,7,8,9, 10, 11, 12 , 13, 14, 15, 16, 17, 18, 19, 20};
//		for(int i=0; i<arr.length; i++)
//		{
////			fw.write(Integer.toString(arr[i]) + " ");
//			fw.write(arr[i] + " ");
//		}
////		fr.write("hello");
//		fw.close();
//		System.out.println("successfully write data on numbers file");
//		
//		FileReader fr = new FileReader("numbersCode/numbers.txt");
////		BufferedReader fr1 = new BufferedReader(fr);
////		StringBuffer str = new StringBuffer();
////		FileWriter feven = null;
////		FileWriter fodd = null;
//		int i;
//		while((i = fr.read()) != -1)
//		{
//			char num = (char)i;
//			if((int)num % 2 == 0)
//			{
//				FileWriter feven = new FileWriter("numbersCode/even.txt", true);
//				feven.write(num);
//				feven.close();
//			}
//			else
//			{
//				FileWriter fodd = new FileWriter("numbersCode/odd.txt", true);
//				fodd.write(num + " ");
//				fodd.close();
//			}
//		}
////		feven.close();
////		fodd.close();
//		fr.close();
//	}
//
//}
