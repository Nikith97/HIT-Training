package bookone;

abstract class ProblemEleven{
	abstract void amethod();
	static int i;
}

abstract class Mine extends ProblemEleven {
	public static void main(String argv[]) {
		int[] ar = new int[5];
		for(i=0; i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}

//Error : Mine class should be declared abstract