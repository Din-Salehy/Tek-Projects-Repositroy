package Array;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		
		int a [] = {12,123,12,345,435,56};
		int sum = Arrays.stream(a).sum();
		System.out.println(sum);
		
		}
}
