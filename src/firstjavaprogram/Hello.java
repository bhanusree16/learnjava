package firstjavaprogram;

import java.util.Date;

public class Hello {
	int id = 10;
	int marks = 50;

	public static void main(String[] args) {
		 Date now = new Date();
		 String x = "8";
		 System.out.println("my value"+x);
		 char string = 65;
		 int y =  (int) Double.parseDouble(x);
		 System.out.println("my int"+y);
		 System.out.println("hello");
		 System.out.println("\nbhanu");
		 System.out.println(now);
		 System.out.println(string);
		Hello obj1 = new Hello();
		System.out.println("having id "+obj1.id + " marks are " + obj1.marks);
	}  
}