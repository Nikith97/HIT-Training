package bookone;

import java.io.*;
public class ProblemFifteen {
	public static void main(String argv[]) {
		ProblemFifteen m = new ProblemFifteen();
		System.out.println(m.amethod());
	}
	
	public int amethod() {
		try {
			FileInputStream dis = new FileInputStream("Hello.txt");
		}
		catch(FileNotFoundException fne) {
			System.out.println("No such file found");
			return -1;
		}
		catch(IOException ioe) {
			
		}
		finally {
			System.out.println("Doing Finally...");
		}
		
		return 0;
	}
}


//No such file found, Doing Finally, -1