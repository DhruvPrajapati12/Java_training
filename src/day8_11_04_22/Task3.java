package day8_11_04_22;

import java.util.Vector;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> arr = new Vector<String>(5); 
		arr.add("Cricket");
		arr.add("Football");
		arr.add("baseball");
		arr.add("Hockey");
		arr.add("volleyball");
		
		System.out.println(arr);
		
		List<String> list = new ArrayList<String>();
//		Collections.list(arr.elements());
		list.addAll(arr);
		
		System.out.println(list);
	}

}
