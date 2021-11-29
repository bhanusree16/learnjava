package polymorphism;

public class overloading {

	public static void main(String[] args) {
		overloading obj1 = new overloading();
		obj1.add(5, 8);
		obj1.add(5, 9, 5);
		obj1.add(5.5, 6);
		obj1.add(4, 5);
	}
	
	public void add(int a,int b)
	{
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void add(int a,int b,int c)
	{
		int d= a+b;
		System.out.println(d);
		
	}
	
	public void add(double a,int b)
	{
		double c= a+b;
		System.out.println(c);
		
	}
	public void add(int b,double a)
	{
		double c= a+b;
		System.out.println(c);
		
	}

}
