package interfacee;

interface X
{
int a = 100;
void m1();
}

interface Y
{
	int b = 200;
	void m2();
}


public class MultipleInterface implements X,Y{

	public void m1()
	{
		System.out.println(a);
	}
	
	public void m2() 
	{
	System.out.println(b);	
	}
	public static void main(String[] args) {
		
		MultipleInterface obj = new MultipleInterface();
		obj.m1();
		obj.m2();
	}
}
