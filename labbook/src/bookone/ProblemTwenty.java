package bookone;

import java.awt.*;

public class ProblemTwenty extends Frame {
	public static void main(String argv[]) {
		ProblemTwenty MyBut = new ProblemTwenty();
	}
	ProblemTwenty(){
		Button HelloBut = new Button("Hello");
		Button ByeBut = new Button("Bye");
		add(HelloBut);
		add(ByeBut);
		setSize(300,300);
		setVisible(true);
	}
}

//One button occupying the entire frame saying Bye.....