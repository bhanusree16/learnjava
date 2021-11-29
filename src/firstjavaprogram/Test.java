package firstjavaprogram;

//
public class Test {
	 static int i = 1;
	 public static void main(String args[])
	 {
	 System.out.print(i + ",");
	 m(3);
	 System.out.println(i);
	 }
	 public static int m(int i) {
	 i += 2;
	 System.out.println(i);
	 return i;
	 }
	 

//	 int a;
//	 Test(int a) {
//	 this.a = a;
//	 }
//	 public static void main(String[] args) {
//	 Test obj = new Test(10);
//	 System.out.println(obj.a);
//	 }
	 

//	 public static void main(String[] args)
//	 {
//	 String s1 = new String("HELLO");
//	 String s2 = new String("HELLO");
//	 System.out.println(s1 == s2);
//	 System.out.println(s1.equals(s2));
//	 }
	 

	
//	final static short i = 2;
//	public static int j = 0;
//
//	public static void main(String[] args) {
//		for (int k = 0; k < 3; k++) {
//			switch (k) {
//			case i:
//				System.out.print(" 0 ");
//			case i - 1:
//				System.out.print(" 1 ");
//			case i - 2:
//				System.out.print(" 2 ");
//			}
//		}
//	}
	
//	public static void main(String[] args) {
//		int a = 2;
//		int b = 3;
//		a= b;
//		System.out.println("a = "+a);
//		b=a-1;
//		System.out.println("b = "+b);
//	}
	
//	public static void main(String[] args) {
//	String input = "my name bhanusree";
//
//	String seperateword[] = input.split(" ");
//	for(int i=seperateword.length-1; i>=0;i--)
//	{
//	System.out.print(seperateword[i] + " ");
//	}
//	}
}
