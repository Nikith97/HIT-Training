package hit.day6;

public class VariableTypesOOA {
//local, class, instance
	int i=10; //declaration of a variable outside a method is called instance variable
	static int k = 100; //class variable
	void met() {
		int j=10;//local variables
	}
	
	public static void main(String[] args) {
		TrainingRoom gandhi = new TrainingRoom();
		TrainingRoom nehru = new TrainingRoom();
		gandhi.teach();gandhi.teach();
		nehru.teach();nehru.teach();
	}
}

class TrainingRoom{
	public TrainingRoom() {
		// TODO Auto-generated constructor stub
		System.out.println("Training room object is created....");
	}
	Projector pro = new Projector();//instance
	static Toilet toilet = new Toilet();//static
	void teach() {
		Student stu = new Student();
	}
}

class Projector{
	//constructor which automatically gets called when object is created
	public Projector() {
		System.out.println("Projector Object is created....");
	}
}//One projector per training room

class Toilet{
	public Toilet(){
		System.out.println("Toilet object is created...");
	}
}//For many training rooms, one toilet will be used

class Student{
	public Student() {
		System.out.println("Student object is created....");
	}
} //In one training room many students will sit......
