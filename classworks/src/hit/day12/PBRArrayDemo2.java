package hit.day12;
//Arrays are object type and they believe in Pass By Reference
public class PBRArrayDemo2 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i:arr)
			System.out.print(i + "\t");
		System.out.println();
		AcceptArray obj = new AcceptArray();
		obj.modifyArray(arr);
		System.out.println("After modification");
		for(int i:arr)
			System.out.print(i + "\t");
		System.out.println();
	}
}

//Array variables- PBR
//Normal variables - PBV
//JAVA Supports Multilevel Inheritance, not multiple inheritance
class AcceptArray{
	public void modifyArray(int []a) {
		a[2] = 200;
	}
}