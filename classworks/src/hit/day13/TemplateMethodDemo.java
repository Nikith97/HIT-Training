package hit.day13;

public class TemplateMethodDemo {
	public static void main(String[] args) {
		//We will call the process method of abstract class with the help of child class
		Sangeetha sangeethaHotel = new NikithRestaurant();
		sangeethaHotel.process();
	}
}

abstract class Sangeetha{

	// Sangeetha defines the following methods to follow by us...
	
	public final void uniform() {
		System.out.println("Uniform defined by Sangeetha");
	}
	
	public final void serve() {
		System.out.println("Service defined by Sangeetha...");
	}
	
	public abstract void makeIdly();
	
	public final void createIdlyPlate() {
		System.out.println("Idly Plate defined by Sangeetha...");
	}
	
	public final void charge() {
		System.out.println("Sangeetha defining charges...");
	}
	
	// Now Sangeetha explains the order of making a process
	
	public final void process() { //Template Method
		uniform();
		makeIdly();
		createIdlyPlate();
		serve();
		charge();
	}
}

// Creating my restaurant in association with Sangeetha Restaurant

class NikithRestaurant extends Sangeetha{
	@Override
	public void makeIdly() {
		System.out.println("Workers make Idlies.....");
	}
	
}