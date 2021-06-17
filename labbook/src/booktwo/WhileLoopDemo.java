package booktwo;

public class WhileLoopDemo {
public static void main(String[] args) {
		
		int sum=0, n=1;
		while (n <= 10) {
			sum += n;
			n++;
		}
		System.out.println("Summation: " + sum);
	}
}
