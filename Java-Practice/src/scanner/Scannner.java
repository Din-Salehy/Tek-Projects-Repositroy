package scanner;

import java.util.Scanner;

public class Scannner {

	public static void main(String[] args) {
		int age1 =44;
		String samanName = "Saman";
		int size = 35;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name");
		String name = sc.next();
		System.out.println("How old are you");
		int age = sc.nextInt();
		System.out.println("Profession");
		String activity = sc.next();
		
		System.out.println("Your name is " +name + " And Your age is "+ age +" " +activity +" Ativiist at church strret");
	
		if (name.contentEquals("Shashpar") && (age >=34) || (activity.contains("Acivist"))){
			System.out.println("Shshshshsh---------------  :) Shashpar is super active at church street ");
		
			if ((age1 > 35) && (size >36)){
				System.out.println("You are eligible to do rangila with Servar");
				}
			}
			System.out.println("cho da kone shashpar");
		}
	}

