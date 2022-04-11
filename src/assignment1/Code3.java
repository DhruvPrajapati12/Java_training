//The abstract vegetable class has three subclasses named Potato, Brinjal and
//Tomato. Write a java prog. That demonstrates how to establish this class hierarchy.
//Declare one instance variable of type String that indicates the color of a vegetable.
//Crete and display instances of these objects. Override the toString() method of
//object to return a string with the name of vegetable and its color.

package assignment1;

abstract class Vegetable
{
    String color;
    
    Vegetable(String arg)
    {
    	color = arg;
    }
	
	public abstract String toString();
}

class Potato extends Vegetable
{	
	Potato(String arg) {
		super(arg);
		
//		super();
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "name: potato" + "  color: " + color;
	}
}

class Brinjal extends Vegetable
{
	Brinjal(String arg) {
		super(arg);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "name: brinjal" + "  color: " + color;
	}
}

class Tomato extends Vegetable
{
	Tomato(String arg) {
		super(arg);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "name: tomato" + "  color: " + color;
	}
}

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Potato p = new Potato("yellow");
		Brinjal b = new Brinjal("purple");
		Tomato t = new Tomato("red");
		
		System.out.println(p.toString());
		System.out.println(b.toString());
		System.out.println(t.toString());
	}

}
