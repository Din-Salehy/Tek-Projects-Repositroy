package Array;

public class Array {

	public static void main(String[] args) {
		
//		int a [] = new int [7];
//		a[0] =100;
//		a[1] =200;
//		a[2] =300;
//		a[3] =400;
//		a[4] =500;
//		a[5] =600;
//		a[6] =700;
//		
//		System.out.println(a[5]);
		
		int a [] = {100,200,300,400,500,600,700};
		System.out.println(a.length);
		System.out.println(a[5]);
		
		System.out.println("-------------------------------------");
		//Using for loop
		for(int i =0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------------------------------------");
		//read values using for each loop (enhanced loop)
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
