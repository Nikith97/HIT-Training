package bookone;

public class ProblemThirtyFive {
	public static void main(String[] args) {
		ProblemThirtyFive c = new ProblemThirtyFive();
		String s = new String("ello");
		c.amethod(s);
	}
	
	public void amethod(String s) {
		String c= "H";
		c+=s;
		System.out.println(c);
	}
}

//"Hello"