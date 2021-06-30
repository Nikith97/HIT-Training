package bookone;

public class Lin {
	public static void main(String[] args) {
		Lin a = new Lin();
		a.amethod();
	}
	public void amethod() {
		int ia[] = new int[4];
//		for(int i=0; i<4; i++)
		for(int i=0; i<ia.length;i++)
		{
			ia[i] = i;
			System.out.println(ia[i]);
		}
	}
}
