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

	protected abstract void deliver();
	
}

class Tiger extends Animal
{

	@Override
	protected void deliver() {
		// TODO Auto-generated method stub
		
	}
	
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

	@Override
	protected void deliver() {
		// TODO Auto-generated method stub
		
	}
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj[] = new Animal[4];
		obj[0] = new Tiger();
		obj[1] = new Camel();
		obj[2] = new Deer();
		obj[3] = new Donkey();
		
		obj[0].deliver();
		obj[1].deliver();
		obj[2].deliver();
		obj[3].deliver();
	}

}
