//The abstract class Engineering is the super class of the Computer and Mechanical
//classes. Define abstract method void display() in Engineering class. The
//Programming interface declares a coding() method. The Programming interface is
//implemented by the Computer class. The Drawing interface declares a draw()
//method. The Drawing interface is implemented by the Mechanical class. Create
//object of Child class and call its method.

package assignment1;

abstract class Engineering
{
	abstract void display();
}

class Computer implements Programming
{
	@Override
	public void coding() {
		// TODO Auto-generated method stub
		System.out.println("This is coding method");
	}
}

class Mechanical implements Drawing
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("This is drawing method");
	}
	
}

interface Programming
{
	void coding();
}

interface Drawing 
{
	void draw();
}
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		Mechanical m = new Mechanical();
		
		c.coding();
		m.draw();

	}

}
