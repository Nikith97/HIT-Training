package hit.day10;

public class AssoDemo {
	
	public static void main(String[] args) {
		Laddu laddu = new Laddu();//association
		laddu.setSize(10);
		System.out.println("Before eating laddu " + laddu.size);
		
		AssoDemo obj = new AssoDemo();
		//Passing the object by reference
		obj.eatLaddu(laddu);
		
		System.out.println("After eating, the laddu size is " + laddu.size);
	}
	
	public void eatLaddu(Laddu l) {
		System.out.println("Laddu is eaten...half");
		l.setSize(5);
	}
}

class Laddu{
	int size;
	public void setSize(int size) {
		this.size = size;
	}
}