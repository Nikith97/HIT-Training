package hit.day12;

import java.util.Scanner;

public class BadFanDemo {
	public static void main(String[] args) {
		BadFan shaitan = new BadFan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Select the state to pull");
		scan.next();
		shaitan.pull();
	}
}

class BadFan{
	int state=0;
	public void pull() {
		if(state==0) {
			System.out.println("Switch on state");
			state = 1;
		}
		else if(state==1) {
			System.out.println("Medium state");
			state =2;
		}
		else if (state==2) {
			System.out.println("High State");
			state = 3;
		}
		else if (state==3) {
			System.out.println("Switch off state");
			state =0;
		}
	}
}