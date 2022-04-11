//The Transport interface declares a deliver () method. The abstract class Animal is
//the super class of the Tiger, Camel, Deer and Donkey classes. The Transport
//interface is implemented by the Camel and Donkey classes. Write a test program
//that initialize an array of four Animal objects. If the object implements the
//Transport interface, the deliver () method is invoked.

package assignment1;

interface Transport
{
	void deliver();
}

abstract class Animal
{
	
}

class Tiger extends Animal
{
	
}

class Camel extends Animal implements Transport
{

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("This is deliver method of camel");
	}
	
}

class Deer extends Animal
{

}

class Donkey extends Animal implements Transport
{

	@Override
	public void deliver() {
		// TODO Auto-generated method stub
		System.out.println("This is deliver method of Donkey");
	}
	
}

public class Code4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Animal arr[] = new Animal[4];
		arr[0] = new Tiger();
		arr[1] = new Camel();
		arr[2] = new Deer();
		arr[3] = new Donkey();
		
		
		try
		{
			((Transport) arr[1]).deliver();
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
		try
		{
			((Transport) arr[3]).deliver();
		}
		catch(Exception e)
		{
			System.out.println();
		}
		
		try
		{
			((Transport) arr[0]).deliver();
		}
		catch(Exception e)
		{
			System.out.println("Tiger class is not implementing Transport interface, so it can't call deliver method");
		}
		
		try
		{
			((Transport) arr[2]).deliver();
		}
		catch(Exception e)
		{
			System.out.println("Deer class is not implementing Transport interface, so it can't call deliver method");
		}
		
		
//		try
//		{
//			((Transport) arr[1]).deliver();
//			((Transport) arr[3]).deliver();
//			
//			((Transport) arr[0]).deliver();
//			((Transport) arr[2]).deliver();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Error");
//		}
		
		
	}

}
