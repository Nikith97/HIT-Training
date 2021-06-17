package bookone;

public class EqTest {
	public static void main(String[] args) {
		EqTest e = new EqTest();
	}
	
	EqTest(){
		String s = "Java";
		String s2 = "java";
//		if(s==s2)
//		if(s.equals(s2))
		if(s.equalsIgnoreCase(s2))
//		if(s.noCaseMatch(s2))
		{
			System.out.println("Equal");
		}
		
		else {
			System.out.println("Not equal");
		}
	}
}
