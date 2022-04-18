package day8_11_04_22;
import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
		hm.put(100, "OOP");
		hm.put(102, "AEM");
		hm.put(101, "DBMS");
		hm.put(103, "CN");
		
		System.out.println(hm);
		
		for(int i=100; i<100+hm.size(); i++)
		{
			System.out.println(i + "  " + hm.get(i));
		}
		System.out.println();
		
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}