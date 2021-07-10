package hit.day14;

import java.util.Scanner;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Dog tiger = new Dog();
		Child baby = new Child();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the item, Stick/Biscuit - ");
//		String item = scan.next();
		
		Item item = new Biscuit();
		baby.PlaywithDog(tiger, item);
	}
}

class DogExceptions extends Exception{
	
}

class DogBiteException extends DogExceptions{
	String msg;
	public DogBiteException(String msg) {
		this.msg=msg;// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Exception is = " + msg;
	}
}

class DogHappyException extends DogExceptions{
	String msg;
	public DogHappyException(String msg) {
		this.msg = msg;// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Exception is = " + msg;
	}
}

/*
 * When you override a method, you cannot throw an exception which is not in the parent class
 * We have to throw exception in both parent and child methods.
 * 
 */
abstract class Item{
	public abstract void execute() throws DogBiteException, DogHappyException;
}

class Stick extends Item{
	@Override
	public void execute() throws DogBiteException {
		throw new DogBiteException("You hit, I will bite.....");
		
	}
}

class Biscuit extends Item{
	@Override
	public void execute() throws DogHappyException {
		throw new DogHappyException("I Love Biscuits...");
		
	}
}
class Dog{
//		if(item.equals("stick")) {
//			throw new DogBiteException("You hit, I will bite.....");
//		}
//		
//		else if(item.equals("biscuit")) {
//			throw new DogHappyException("I Love Biscuits...");
//		}
		public void play(Item item) throws DogBiteException, DogHappyException {
			item.execute();
		}
	}

class Child {
	public void PlaywithDog(Dog tiger, Item item) {
		try{
			tiger.play(item);
		}
		catch(DogBiteException dbe) {
			System.out.println(dbe);
		}
		catch(DogHappyException dhe) {
			System.out.println(dhe);
		}
	}
}
