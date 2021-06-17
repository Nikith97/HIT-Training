package booktwo;

public class Bird {
int age;
String name;

	Bird(){
		System.out.println("This is parrot");
	}
	
	Bird(String x){
		name = x;
		System.out.println("This is " + name);
	}
	
	Bird(int y, String z){
		age = y;
		name = z;
		System.out.println("This is" + " " + age + " years old" +". " + "It is a " + name +".");
	}
	public static void main(String[] args) {
		Bird a = new Bird();
		Bird b = new Bird("Peacock");
		Bird c = new Bird(16, "Sparrow");
	}
}
