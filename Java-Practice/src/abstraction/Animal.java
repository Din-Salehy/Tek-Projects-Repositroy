package abstraction;

public abstract class Animal {

	String name;
	String hieght;

	public abstract void animalSound();
	
	public void nonAbsMethod() {
		
		System.out.println("Non Abs method");
	}

}

class Dog extends Animal {
	public void animalSound() {
		
		System.out.println("Zzzzzz");

	}

}

class Main{
	public static void main(String[] args) {

		Dog d = new Dog();
		d.animalSound();

	}

}