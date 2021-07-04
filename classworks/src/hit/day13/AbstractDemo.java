package hit.day13;

public class AbstractDemo {
	public static void main(String[] args) {
		//Condition One = We cannot create an object of Parent Class
			//new Parent(); (ERROR)
		new Child();
	}
}
/*
 * Final variables, values cannot be changed
 * Final classes cannot be inherited, their methods cannot be overridden
 * When an abstract class extends another abstract class, this child class need not to override the abstract method of the parent class.....
 */

abstract class GrandParent{
	public abstract void met();
}
abstract class Parent extends GrandParent{
	//Condition Two = Constructors can be called inside an abstract class. To call the constructor, we need to call from the object of the child class
	public Parent() {
		System.out.println("Cons of Parent class called from the object of Child Class....");
	}
	
	public abstract void youSayHello(); //This method should be overridden
	final public void meSayHello() { //This method cannot not be overridden and should be declared as with final keyword
		System.out.println("Saying Hello as per the abstract class norms... ");
	}
}

class Child extends Parent{
	public void met() {
		
	}
	public Child() {
		System.out.println("Child class of abstract parent object is created");
	}
	@Override
	public void youSayHello() {
		System.out.println("Saying Hello as per the Child class norms....");	
	}
	
}