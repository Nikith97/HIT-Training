package bookone;


class Base{
	
}

class Sub extends Base{
	
}

class Sub2 extends Base{
	
}
public class ProblemSeventeen {
	public static void main(String argv[]) {
		Base b = new Base();
		Sub s = (Sub)b;
	}
}
