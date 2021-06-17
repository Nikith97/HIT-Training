package bookone;

class Lase{
	private void amethod(int iBase) {
		System.out.println("base.amethod");
	}
}
public class Over extends Lase {
	public static void main(String[] args) {
		Over o = new Over();
		int iBase=0;
		o.amethod(iBase);
	}
	public void amethod(int iOver) {
		System.out.println("Over.amethod");
	}
}
//Over.amethod