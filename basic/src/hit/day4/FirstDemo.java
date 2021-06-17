package hit.day4;

public class FirstDemo {
	// Class contains "data" and "Functions"
	
	//data
	//Four datatypes in Java - number, decimals. boolean, string
	// number - byte, short, int, long, char
	//decimal - float, double
	//boolean - boolean
	//string - String
	
	int i;
	float f;
	short s;
	byte b;
	long laa;
	boolean boo;
	double dob;
	
	public static void main(String[] args) {
		FirstDemo obj = new FirstDemo();
		
		System.out.println("int default value is "+ obj.i);
		System.out.println("float default value is "+ obj.f);
		System.out.println("short default value is "+ obj.s);
		System.out.println("byte default value is "+ obj.b);
		System.out.println("long default value is "+ obj.laa);
		System.out.println("boolean default value is "+ obj.boo);
		System.out.println("double default value is "+ obj.dob);
		
	}
}
