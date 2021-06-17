package hit.day7;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		SwitchCaseDemo obj = new SwitchCaseDemo();
		obj.met('f');
		obj.met(10);
		obj.met("Hi Nikith");
	}
	
	void met(String s) {
		switch(s) {
		case "Hi Nikith":{
			System.out.println("The value is Hello World...");
			break;
		}
		
		case "Hello":{
			System.out.println("The value is Hello...");
			break;
		}
		
		case "Bye": {
			System.out.println("The value is Bye...");
			break;
		}
		}
	}
	
	void met(int i) {
		switch(i) {
		case 10:{
			System.out.println("The value is 10...");
			break;
		}
		
		case 9: {
			System.out.println("The value is 9...");
			break;
		}
		
		default:{
			System.out.println("Default case...");
			break;
		}
		}
	}
	
	void met(char c) {
		switch(c) {
		case 'b':{
			System.out.println("The value is b...");
			break;
		}
		default:{
			System.out.println("This is a default case...");
			break;
		}
		case 'c':{
			System.out.println("The value is c....");
			break;
		}
		
		case 'a':{
			System.out.println("You have chosen the right one...");
			System.out.println("The value is aaa....");
			break;
		}
		}
		
	}
}

