package day5_06_04_22;
import java.util.Scanner;

public class DateEarlier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date1, date2;
		System.out.print("Enter your date: ");
		date1 = sc.nextLine();
		System.out.print("Enter your date: ");
		date2 = sc.nextLine();
		
		String[] arrdate1 = new String[20];
		String[] arrdate2 = new String[20];
		
		arrdate1 = date1.split("-");
		arrdate2 = date2.split("-");
		
		int [] arr1 = new int [arrdate1.length];
	    for(int i=0; i<arrdate1.length; i++) {
	        arr1[i] = Integer.parseInt(arrdate1[i]);
	    }
	    
	    int [] arr2 = new int [arrdate2.length];
	    for(int i=0; i<arrdate2.length; i++) {
	        arr2[i] = Integer.parseInt(arrdate2[i]);
	    }
	    
	    if(arr1[0] + arr1[1] + arr1[2]  > arr2[0] + arr2[1] + arr2[2])
	    {
	    	System.out.println("Earlier");
	    }
	    else
	    {
	    	System.out.println("Not earlier");
	    }
	    
	    sc.close();
	}

}
