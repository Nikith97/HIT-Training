package hit.day7;

public class TernaryDemo {
	public static void main(String[] args) {
		//Ternary Operator ???
		String result = (30<20)?"10 is lesser than 20":"10 is not lesser than 20";
		
		int i =10;
		String number = (i%2==0)? "Even Number":"Odd Number";
		
		System.out.println("The number is" + " " + number);
		System.out.println(result);
		//(expression) ? "true": "false";
		
		
	}
}
