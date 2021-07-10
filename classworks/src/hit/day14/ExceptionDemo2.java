package hit.day14;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		int num = 0;
		try {
			num = Integer.parseInt(args[0]);
			int i = 1/num;
		System.out.println("immediate line after exception...");
		} catch (ArithmeticException ae) {
					System.out.println("Logic to Handle arithmetic exception");
//					num = num;
				}
				catch(ArrayIndexOutOfBoundsException aoe) {
//					num=1;
				}
				catch(Exception e) {
			System.out.println("Global Exception Handling...");
//			num = 1;
		}
		finally {// block of code executed at all times even exception arises or not.
			System.out.println("Finally called...");
			num = 1;
		}
		int i=1/num;
		System.out.println("Value of i is = " + num);
		System.out.println("After Exception....");
	}
}
