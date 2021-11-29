package assignments;

public class whileloop_even_odd {

	public static void main(String[] args) {
		int i = 1;
		System.out.print("odd numbers from 1 to 30 are ");
		while(i<=30)
		{
			if(i %2 !=0)
			System.out.print(i + " ");
			i++;
		}
		i = 1;
		System.out.println();
		System.out.print("even numbers from 1 to 30 are ");
		while(i<=30)
		{
			if(i%2 == 0)
			System.out.print(i + " ");
			i++;
		}

	}

}
