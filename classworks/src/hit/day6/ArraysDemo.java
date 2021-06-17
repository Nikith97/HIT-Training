package hit.day6;

public class ArraysDemo {
	public static void main(String[] args) {
		//initializing an array		
		int arr[]= {1,5,7,9};
		int marks[] = new int[5]; // I want initialize values in an array. The length of the array is 5 columns
		marks[1] = 1000;
		//To loop a 1-D array
		for(int i=0; i<marks.length; i++) {
			//System.out.println(marks[i]);
		}
		
		//Modern way of Writing for loop
		for(int i:marks) {
			System.out.println("Value is " + i);
		}
		// We cannot resize an array
		
								//2-D array
		//initialization
		int twod[][] = { {22,33,44,55},{11,22,66,77}};
		int [][]twodd = new int[3][4]; //Created two rows and four columns....
		twodd[1][1] = 10000;
		//To loop a 2-D array...nested for loop...each loop for each row
		for(int i=0; i<twod.length;i++) {//outer for loop...three times...rows
			for(int k=0;k<twod[i].length;k++) {//inner loop runs 12 times...rows and columns
				//System.out.print(twod[i][k]+"    ");
			}
			//System.out.println();
		}
		
		//Another way of for loop.....
		for(int i[]:twod) {
			for(int j:i) {
				System.out.print(j+"......");
			}
			System.out.println();
		}
		
		int unevenarr[][] = {//Uneven multidimensional array
				{12,34,56},
				{56,23},
				{55,88,89,12}
		};
		
		int unevenarray2[][] = new int[3][]; // 3 rows but columns not specified
		unevenarray2[0] = new int[3]; // first row will have 3 columns
		unevenarray2[1] = new int[5]; //second row will have 5 columns
		unevenarray2[2] = new int[4]; // third row will have 4 columns
		
		for(int i[]:unevenarr) {
			for(int k:i) {
				System.out.print(k+".....");
			}
			System.out.println();
		}
	
	
	}
}
