package bookone;

 class Vase{
	Vase(){
		int i = 100;
		System.out.println(i);
	}
}

public class Pri extends Vase{
static int i = 200;
public static void main(String[] args) {
	Pri p = new Pri();
	System.out.println(i);
}
}

//100, 200