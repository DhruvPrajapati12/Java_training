package day6_07_04_22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("file2.txt");
		fw.write("Hello Dhruv How are you?");
		fw.close();
		
		FileReader fr = new FileReader("file2.txt");
		int i=0;
		
		while((i = fr.read()) != -1)
		{
			System.out.print((char)i);
		}
		fr.close();
		
//		System.out.println();
	}

}
