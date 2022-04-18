package day8_11_04_22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class ArraylistStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>(); 
		arr.add("USA");
		arr.add("India");
		arr.add("UK");
		arr.add("Chaina");
		
		ArrayList<String> arr1 = new ArrayList<String>(); 
		arr1.add("USA");
		arr1.add("India");
		arr1.add("UK");
		arr1.add("Chaina");
		
		arr1.set(1, "pak");
		
		System.out.println(arr);
		
//		System.out.println(arr.get(1));
		
		Iterator<String> itr = arr.iterator();
		
		while(itr.hasNext())
		{
			String str = itr.next();
			if(str.equals("India"))
			{
				System.out.println(str);
			}
		}
		
		arr.addAll(arr1);
		System.out.println(arr);
		
		Stack<Character> stack = new Stack<Character>();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		
		System.out.println(stack);
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
	}

}
