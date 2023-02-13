package arrayList;

import java.util.ArrayList;

public class DeclaraingArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
//		ArrayList <String>list = new ArrayList<String>();
//		ArrayList <Integer>list = new ArrayList<Integer>();
		
		list.add("John");
		list.add("David");
		list.add("Nasir");
		list.add("Karin, Kamal, Farshid");
		list.add('a');
		list.add(100);
		
		
		System.out.println(list.size());
		System.out.println(list);
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(1, "Scott");
		System.err.println(list);
		for (Object a:list)
		{
			System.out.println(a);
		}
		
		
		
		
	}
}
