package hit.day10;

public class ConsInherDemo {
	public static void main(String[] args) {
		Shoe shoe = new LeatherShoe(22);
	}
}

class Shoe{
	int i;
	public Shoe() {
		System.out.println("Cons of Shoe is called....");
	}
	public Shoe (int i) {
		System.out.println("Parametric constructor of Shoe called...");
	}
	public void method() {
		System.out.println("Parent shoe class method called.....");
	}
}

class LeatherShoe extends Shoe{
	//There is no concept of method overriding in constructors.....
	//Always the parent class default constructor is called....
	public LeatherShoe(int i) {
		super(222);//super can refer parent/super class constructor
		super.i=100;//super can refer to super class variable
		super.method();//super can refer to super class method
		System.out.println("Cons of LeatherShoe is called....");
	}
}