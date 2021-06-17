package hit.day6;

public class ArrDemo {
	//int, float, long, double, short, byte....
	int i=10;
	int marks[] = {10,20,30,40}; //this is an array
	int score[] = new int[5]; //An array with 5 columns
	//To make some operations on the variable
	//Method is compulsory
	void met() {
		score[0] = 100;
		score[1] = 80;
		score[2] = 90;
		score[3] = 50;
		score[4] = 100;
	}
	public static void main(String[] args) {
		ArrDemo obj = new ArrDemo();
		for(int i=0;i<4;i++) {
			System.out.println(obj.marks[i]);
		}
	}
}
