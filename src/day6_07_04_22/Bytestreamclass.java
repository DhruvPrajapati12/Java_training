package day6_07_04_22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bytestreamclass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			FileOutputStream fout = new FileOutputStream("file.txt");
//			fout.write(65);

			String str = "Dhruv Prajapati Arvindbhai";
			byte arr[] = str.getBytes();
			fout.write(arr);
			
			System.out.println("Success");
			fout.close();
		
			FileInputStream fin = new FileInputStream("file.txt");
			byte readArr[] = new byte[100];
			fin.read(readArr);
			String readString = new String(readArr);
			fin.close();
			System.out.println(readString);
			
			System.out.println();
			
			FileInputStream fin1 = new FileInputStream("file.txt");
			int i=0;
			
			while((i = fin1.read()) != -1)
			{
				System.out.print((char)i);
			}
			fin1.close();	
				
	}

}
