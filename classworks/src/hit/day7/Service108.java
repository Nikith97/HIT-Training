package hit.day7;

//Polymorphism
//Only one constructor can be called....
//We should never use if-else-if method (Hindrance, Static Binding). We can use method overloading (VMI, Eliminates if-else blocks).
public class Service108 {
	//Calling methods with method overloading....
	void help(Police p) {
		System.out.println("The caller is a policeman...Connect to control room.");
	}
	
	void help(AccidentVictim a) {
		System.out.println("The caller is an accident victim....Connect to the doctor.");
	}
	
	void help(Helper h) {
		System.out.println("The caller is an helper....Support him.");
	}
	
	//Calling methods usinf if-else-if within one method
//	void help(Object q) {
//		if(q instanceof Police) {
//			System.out.println("Police....");
//		}
//		
//		else if(q instanceof AccidentVictim) {
//			System.out.println("Accident Victim...");
//		}
//		
//		else if(q instanceof Helper) {
//			System.out.println("Helper....");
//		}
//	}
	public static void main(String[] args) {
		Service108 obj = new Service108();
		Police captain = new Police();
		AccidentVictim ac = new AccidentVictim();
		Helper heap = new Helper();
		
		obj.help(ac);
	}
}

class Police{
	
}

class AccidentVictim{
	
}

class Helper{
	
}