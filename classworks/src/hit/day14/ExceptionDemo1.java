package hit.day14;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Before Exception....");
		int num = 1;
		try {
			num = Integer.parseInt(args[0]);
			int i = 1/num;
		System.out.println("immediate line after exception...");
		} catch (Exception e) {
				if (e instanceof ArithmeticException) {
					System.out.println("Logic to Handle arithmetic exception");
					num = num + 1;
				}
				else if (e instanceof ArrayIndexOutOfBoundsException) {
					num=1;
				}
				else if (e instanceof NumberFormatException) {
					num=1;
				}
		}
		int i=1/num;
		System.out.println("Value of i is = " + num);
		System.out.println("After Exception....");
	}
}
