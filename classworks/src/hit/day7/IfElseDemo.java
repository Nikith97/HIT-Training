package hit.day7;

public class IfElseDemo {
	public static void main(String[] args) {
		int i = 48;
		if(i<40) {
			System.out.println("i is less than 40");
		}
		else if(i==50) {
			System.out.println("i is equal to 50");
		}
		else {
			System.out.println("i is greater than 40");
		}
		
		IfElseDemo obj = new IfElseDemo();
		String result = obj.met(i);
		System.out.println("The result is " + result);
		
		boolean b = true;
		obj.met3(b);
		
		String str = "Nikith";
		obj.met4(str);
	}
	
	String met(int i) {
		if(i %2 ==0 && i<50) {
			return "satisfied";
		}
		else {
			return "not satisfied";
		}
	}
	
	String met2(int i) {
		if(i%3==0 || i>45) {
			return "Satisfied";
		}
		else {
			return "not satisfied";
		}
	}
	
	void met3(boolean valid) {
		if(valid) {
			System.out.println("The value of valid is true....");
		}
		else {
			System.out.println("The value of valid is false....");
		}
	}
	
	void met4(String s) {
		if(s.equals("Hello")) {
			System.out.println("The value of String is Hello....");
		}
		else {
			System.out.println("The value of String is not Hello....");
		}
	}
}

