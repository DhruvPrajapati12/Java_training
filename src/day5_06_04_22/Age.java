package day5_06_04_22;
import java.time.LocalDate;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String birth;
		System.out.print("Enter your birth date: ");
		birth = sc.nextLine();
		
		String[] arr = new String[20];
		
		arr = birth.split("-");
		
		int [] arr1 = new int [arr.length];
	    for(int i=0; i<arr.length; i++) {
	        arr1[i] = Integer.parseInt(arr[i]);
	    }
	    
//	    for(int i=0; i<arr1.length; i++)
//	    {
//	    	System.out.println(arr1[i]);
//	    }
		
		LocalDate today = LocalDate.now();
//		int day = today.getDayOfMonth();
//		int month = today.getMonthValue();
		int year = today.getYear();
		
//		System.out.println(day);
//		System.out.println(month);
//		System.out.println(year);
		
		int ans = year - arr1[2];
		System.out.println("Age: " + ans);
		
		sc.close();
	}

}
