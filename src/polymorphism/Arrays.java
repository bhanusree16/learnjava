package polymorphism;

public class Arrays {

	public static void main(String[] args) {
		int student_id[] = new int[7];
		student_id[0] = 45;
		student_id[1] = 40;
		student_id[2] = 35;
		student_id[3] = 50;
		student_id[4] = 45;
		student_id[5] = 21;
		student_id[6] = 32;
//		int array_length = student_id.length;
		
		for (int i=0;i<student_id.length;i++)
		{
			System.out.println("student_id's "+ student_id[i]);
		}
		
		int i = 0;
//		System.out.println('while loop');
		while(i<student_id.length) {
			System.out.println("student_id "+ student_id[i]);
			i++;
		}
		

	}

}
