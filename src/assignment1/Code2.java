//Write a program that illustrates interface inheritance. Interface GrandParent is
//extended by Parent1 and Parent2. Interface child inherits from both Parent1 and
//Parent2. Each interface declares one method. Class Family implements child
//.Instantiate Family and invoke each of its methods.

package assignment1;

interface GrandParent
{
	void grandparent();
}

interface Parent1 extends GrandParent
{
	void parent1();
}

interface Parent2 extends GrandParent
{
	void parent2();
}

interface Child extends Parent1, Parent2
{
	void child();
}

class Family implements Child
{

	@Override
	public void parent1() {
		// TODO Auto-generated method stub
		System.out.println("this is parent1 method");
	}

	@Override
	public void grandparent() {
		// TODO Auto-generated method stub
		System.out.println("this is grandparent method");
	}

	@Override
	public void parent2() {
		// TODO Auto-generated method stub
		System.out.println("this is parent1 method");
	}

	@Override
	public void child() {
		// TODO Auto-generated method stub
		System.out.println("this is child method");
	}
	
}

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family f = new Family();
		f.grandparent();
		f.parent1();
		f.parent2();
		f.child();
	}

}
