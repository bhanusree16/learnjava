package firstjavaprogram;

import java.util.Scanner;


public class valueEnterByUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter text: ");
		String text = sc.next();
		System.out.println("you enteterd " + text);
		System.out.println("enter number: ");
		int num = sc.nextInt();
		System.out.println("num you entered " + num);
		valueEnterByUser obj1 = new valueEnterByUser();
		obj1.m();
	}
	

	public void m()
	{
		System.out.println("one more method");
	}

}
