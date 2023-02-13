package Array;

public class SearchForElementInArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		int search_ele = 500;

		for (int i = 0; i < a.length; i++) 
		{
//			System.out.println(a[i]);

			if (search_ele == a[i]) 
			{
				System.out.println("element found " + i);
				break;
			}
		}
	
		System.out.println("Element not found");
		
	}
}
