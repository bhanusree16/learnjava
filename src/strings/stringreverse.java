package strings;

public class stringreverse {
 final int q=2;  
	public static void main(String[] args) {
		String s = "bhanu";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
		System.out.println();
		System.out.println("string length "+s.length());


	}
	
	static
	{
		
//		stringreverse obj1 = new stringreverse();
//		System.out.println("static block " + obj1.q);
		System.out.println("i m in static block");
		
	}
	
	public static void sub()
	{
		System.out.println("sub class");
		
	}

}
