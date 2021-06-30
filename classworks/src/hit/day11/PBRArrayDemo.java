package hit.day11;

public class PBRArrayDemo {
	static int classVariable; //class Variable
	int instanceVariable; //Local Variable
	public static void main(String[] args) {
		System.out.println(classVariable);
		PBRArrayDemo pba = new PBRArrayDemo();
		System.out.println(pba.instanceVariable);
		
		int localVariable = 5;//Local Variables are not initialized by default
		System.out.println(localVariable);
	}
}
