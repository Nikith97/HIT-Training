package bookone;
/*
 * What will happen if you try and compile the following code....
 * 
 */
public class ProblemTwo {
	public static void main(String[] arguments) {
//		amethod(arguments);
	}
	public void amethod(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments[1]);
	}
}


//Output = ERROR (Cannot make static reference to a non-static method....)