package hit.day10;

public class InherDemo {
	public static void main(String[] args) {
		Employee p = new Engineer();
		Employee eng = new Engineer(); 
		
		p.met(2);
		eng.met(2);
	}
}

class Human{
	public void blabla() {
		System.out.println("Blabla method called...");
	}
}

class Employee extends Human{
	public int met(int i) {
		System.out.println("Met method of Employee called....");
		return i;
	}
}

//Rules of Overriding - 
//1- Method name and return type should be same to same
//2- Access specifier cannot be reduced - Visibility can be increased but not reduced
//Inheritance/Generalization
class Engineer extends Employee{
	public int met(int i) {//method overriding
		System.out.println("Engineer met method is called....");
		super.met(5);
		super.blabla();
		return i;
	}
}

//class Attender extends Employee{
//	public int met(int i) {
//		System.out.println("Attender met method is called...");
//		super.met(4);
//		super.blabla();
//		return i;
//	}
//}