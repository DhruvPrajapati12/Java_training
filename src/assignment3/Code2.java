//Write a program to replace all “word1” by “word2” to a file and display the no. of
//replacement.

package assignment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File replaceFile = new File("replaceFile.txt");
		if(replaceFile.exists())
		{
			System.out.println("numbers file already exists");
		}
		else
		{
			replaceFile.createNewFile();
		}
		
		try (FileWriter fw = new FileWriter("replaceFile.txt")) {
			fw.write("hello dhruv prajapati\n");
			fw.write("hello dhruv prajapati\n");
			fw.write("hello dhruv dhruv\n");
			fw.write("hello dhruv prajapati\n");
			fw.write("hello dhruv prajapati\n");
		}
		Scanner file = new Scanner(replaceFile);
		int count = 0;
		String word = "";
		while(file.hasNext())
		{
			word = word +  file.next() + " ";
		}
		
		System.out.println(word);
		
		Scanner string = new Scanner(word);
		String temp;
		while(string.hasNext())
		{
			temp = string.next();

			if(temp.equals("dhruv"))
			{
				System.out.println(temp+" ");
				count++;
			}
		}
		word = word.replace("dhruv", "abc");
			
		System.out.println("Count: " + count);
		
		FileWriter fw = new FileWriter("replaceFile.txt");
		fw.write(word);
		fw.close();
		System.out.println(word);
		}
	

}
