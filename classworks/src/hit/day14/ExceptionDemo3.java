package hit.day14;

public class ExceptionDemo3 {
	public static void main(String[] args) {
		System.out.println("Before Exception...");
		try {
			int i=1/0;
		}
		catch(Exception e) {
			e.initCause(e);
			e.printStackTrace();
			System.out.println(e.getCause());
		}
		finally {
			System.out.println("Finally block called...");
		}
		System.out.println("After exception...");
	}
}
