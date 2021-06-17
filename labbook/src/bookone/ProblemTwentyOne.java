package bookone;

public class ProblemTwentyOne {
	public static void main(String[] args) {
		int i;
		int j;
		
		for(i=1;i<3;i++)
			for(j=1;j<3;j++) {
				if(j==2) 
					continue;
					System.out.println("Value for i = "+ i +"  " + "Value for j = "+ j);
				}
					
	}
}

//Value for i = 1  Value for j = 1
//Value for i = 2  Value for j = 1

