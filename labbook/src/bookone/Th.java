package bookone;

import java.io.DataInputStream;
import java.io.IOException;

public class Th {
	public static void main(String[] args) {
		Th t = new Th();
		t.amethod();
	}
	
	public void amethod() {
		try {
			ioCall();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void ioCall() throws IOException {
		// TODO Auto-generated method stub
		DataInputStream din = new DataInputStream(System.in);
		din.readChar();
	}

}
