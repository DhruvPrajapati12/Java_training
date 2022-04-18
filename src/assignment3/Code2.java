//Write a program to replace all “word1” by “word2” to a file and display the no. of
//replacement.

package assignment3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File replaceFile = new File("replaceFile.txt");
		if(replaceFile.exists())
		{
			System.out.println("file already exists");
		}
		else
		{
			replaceFile.createNewFile();
		}
		
		try (FileWriter fw = new FileWriter("replaceFile.txt")) {
			fw.write("A paragraph is a collection of words strung together to make a longer\n"
					+ "unit than a sentence. Several sentences often make to a paragraph . \n"
					+ "There are normally three to eight sentences in a paragraph . \n"
					+ "paragraph can start with a five-space indentation or by skipping a line\n"
					+ "and then starting over.\n");
			fw.write("paragraph dhruv prajapati\n");
			fw.write("hello welcome to the java\n");
			fw.write("welcome to my paragraph\n");
		}
		Scanner fileData = new Scanner(replaceFile);
		
		int count = 0;
		String word = "";
		
		while(fileData.hasNext())
		{
			word = word +  fileData.next() + " ";
		}
		fileData.close();
		
		System.out.println("Before replacing file contents: ");
		System.out.println(word);
		System.out.println();
		
		Scanner string = new Scanner(word);
		String temp;
		while(string.hasNext())
		{
			temp = string.next();

			if(temp.equals("paragraph"))
			{
//				System.out.println(temp+" ");
				count++;
			}
		}
		string.close();
		word = word.replace("paragraph", "abc");
		System.out.println("Replacing 'paragraph' by 'abc'");
		System.out.println("No of replacement of: " + count);
		System.out.println();
		
		FileWriter fw = new FileWriter("replaceFile.txt");
		fw.write(word);
		fw.close();
		
		System.out.println("After replacing file contents: ");
		System.out.println(word);
		}
	

}
