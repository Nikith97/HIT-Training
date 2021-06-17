package hit.day7;

public class ConsDemo {
	public ConsDemo() {
		System.out.println("Constructor called....");
	}
	
	
	public ConsDemo(int i) {
		System.out.println("Overloaded Constructor called....");
	}
	
	public ConsDemo(String s) {
		System.out.println("String constructor is called....");
	}
	
	public ConsDemo(int s, String str) {
		System.out.println("Multiparameter constructor is called...");
	}
	public static void main(String[] args) {
		ConsDemo obj1 = new ConsDemo(45,"Nikith");
		ConsDemo obj2 = new ConsDemo("Nikith");
		ConsDemo obj3 = new ConsDemo(22);
		ConsDemo obj4 = new ConsDemo();
		
		obj4.met();
		obj3.met(4);
		//To call a particular constructor, we give its necessary parameter in the object. This is called Virtual Method Invocation
		//Only one cosntructor can be called when one object is created
	}
	
	void met() {
		System.out.println("Method without parameter called....");
	}
	
	void met(int i) {
		System.out.println("Method with parameter called....");
	}
	
	
}
