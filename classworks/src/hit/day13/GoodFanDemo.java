package hit.day13;

import java.util.Scanner;
/*
 * 1. Convert the condition to classes
 * 2. Group them under a hierarchy - Inheritance
 * 3. Create a Association between the using class and the hierarchy class - association
 *
 * Design Patterns - Strategy Pattern
 * A strategy to implements openclose principle
 * A strategy to remove if-else-condition
 */

public class GoodFanDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//BadFan shaitan=new BadFan();
				GoodFan khaitan=new GoodFan();
				while(true) {
					System.out.println("Press a key and then Enter for pulling chain..");
					scan.next();
					khaitan.pull();
				}
	}
}

class GoodFan{
	State state = new SwitchOffState(); //association
	public void pull() {
		state.pull(this);
	}
}
abstract class State{
	public abstract void pull(GoodFan fan);
}
// When the abstract method is called inside abstract class, then the child class methods should be overloaded...
// Otherwise, the program will not be compiled....

class SwitchOffState extends State{//Condition grouped under a category
	public void pull(GoodFan fan) {
		System.out.println("Switch on State....");
		fan.state = new SwitchOnState();
	}
}

class SwitchOnState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("Medium speed state....");
		fan.state = new MediumSpeedState();
		
	}
}

class MediumSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("High Speed State...");
		fan.state = new HighSpeedState();
	}
}

class HighSpeedState extends State{
	@Override
	public void pull(GoodFan fan) {
		System.out.println("Switch Off State....");
		fan.state = new SwitchOffState();
	}
}