package bookone;

public class ProblemTwelve {
	public static void main(String[] args) {
		int i=1;
		switch(i) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:{
			System.out.println("Two");
			break;
		}
		default:{
			System.out.println("Default");
		}
		}
	}
}

//Output = One
