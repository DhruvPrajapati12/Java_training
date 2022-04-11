package day6_07_04_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("newFolder");
		
		if(!folder.exists())
		{			
			folder.mkdir();
		}
		else
		{
			System.out.println("Already exists");
		}
		
		File file1 = new File("newFolder/file1.txt");
		if(!file1.exists())
		{			
			file1.createNewFile();
			System.out.println("file1 created");
		}
		else
		{
			System.out.println("File1 already exists");
		}
		
		File file2 = new File("newFolder/file2.txt");
		if(!file2.exists())
		{			
			file2.createNewFile();
			System.out.println("file2 created");
		}
		else
		{
			System.out.println("File2 already exists");
		}
		
		File file3 = new File("newFolder/file3.txt");
		if(!file3.exists())
		{			
			file3.createNewFile();
			System.out.println("file3 created");
		}
		else
		{
			System.out.println("File3 exists");
		}
		
		File ls1 = new File("newFolder");
		String lsArr1[] = new String[10];
		lsArr1 = ls1.list();
		System.out.println("\nls Command");
		for(String name: lsArr1)
		{
			System.out.println(name);
		}
		System.out.println();
		
		// write the data on file1 using ByteStream Class
		FileOutputStream fw1 = new FileOutputStream("newFolder/file1.txt");
		String str1 = "Hello Dhruv Prajapati";
		byte arr1[] = str1.getBytes();
		fw1.write(arr1);
		fw1.close();
		
		// read the data from file1 using CharacterStream Class
		FileReader fr1 = new FileReader("newFolder/file1.txt");
		int i=0;
		while((i = fr1.read()) != -1)
		{
			System.out.print((char)i);
		}
		fr1.close();
		
		// write the data from file2 using CharacterStream Class
		FileWriter fw2 = new FileWriter("newFolder/file2.txt");
		fw2.write("Hello Het Shah\n");
		fw2.write("Hello How are you\n");
		fw2.write("Hello India\n");
		fw2.write("I am Dhruv Prajapati\n");
		fw2.close();
		
		// read the data from file1 using ByteStream Class
		FileInputStream fr2 = new FileInputStream("newFolder/file1.txt");
		i=0;
		System.out.println();
		while((i = fr2.read()) != -1)
		{
			System.out.print((char)i);
		}
		fr2.close();
		
		// delete file3
		File deleteFile3 = new File("newFolder/file3.txt");
		deleteFile3.delete();
		
		System.out.println("\n\nls Command");
		File ls2 = new File("newFolder");
		String lsArr2[] = new String[10];
		lsArr2 = ls2.list();
		
//		System.out.println();
		for(String name: lsArr2)
		{
			System.out.println(name);
		}
		System.out.println();
		// check for India word in file2
//		String fr21 = new String("newFolder/file2.txt");
//		String indiaString = new String(fr2);
//		System.out.println(fr21);
		
		FileReader fr21 = new FileReader("newFolder/file2.txt");
		Scanner sc = new Scanner(fr21);
		boolean flag = false;
		while(sc.hasNextLine())
		{
			String indString = sc.nextLine();
			if(indString.contains("India"))
			{
				System.out.println(indString);
				flag = true;
			}
		}
		if(flag == false)
		{
			System.out.println("file2 does not contain India keyword");
		}
//		if(fr21.contains("India"))
//		{
//			System.out.println("\nYes file2 contains India keyword");
//		}
//		else
//		{
//			System.out.println("\nFile does not contain India keyword");
//		}
		sc.close();
		fr21.close();
		
//		StringBuilder sb = new StringBuilder("Good Morning");
//		sb.insert(1, "Friend ");
//		System.out.println(sb);
	}

}
