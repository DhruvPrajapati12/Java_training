package day8_11_04_22;

import java.util.Collections;
import java.util.Vector;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> arr = new Vector<String>(5); 
		arr.add("Cricket");
		arr.add("Football");
		arr.add("baseball");
		arr.add("Hockey");
		arr.add("volleyball");
		
		System.out.println(arr);
		
//		arr.sort(null);
		Collections.sort(arr, String.CASE_INSENSITIVE_ORDER);  
		System.out.println(arr);
		
//		Collections.reverse(arr);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println(arr);
	}

}
