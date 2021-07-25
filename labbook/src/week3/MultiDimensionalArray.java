package week3;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int [][] uneven = {
				{1,2,3},
				{4,5,6,9},
				{7},
		};
		
		//Calculating length of each row
		System.out.println("Length of row 1: " + uneven[0].length);
		System.out.println("Length of row 2: " + uneven[1].length);
		System.out.println("Length of row 3: " + uneven[2].length);
		
		System.out.println("----------------------");
		
		int [][] a = {
				{1,-2,3},
				{-4,5,-6,9},
				{7,8},
		};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; ++j) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("----------------------");
		
		int [][] nikki = {
				{1,3,5,7},
				{2,4,6,8},
				{-2,-4,-6,-8},
		};
		
		for(int []innerarray:nikki) {
			for(int data: innerarray) {
				System.out.println(data);
			}
		}
			
	}
}
