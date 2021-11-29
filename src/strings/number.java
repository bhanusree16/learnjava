package strings;

public class number {

	public static void main(String[] args) {
		int [] array_number = {22,7,13,5,1,98,43};
		 int count = 0;
		for (int i=0;i<array_number.length;i++)
		{
		for (int j=1;j<array_number.length;j++)
		{
		if(array_number [i]< array_number[j])
		{
		count++;
		}
		

		}
		if(count == 1)
			System.out.println("the second most highest number in array " + array_number[i]);
			count = 0;
		
			}

	}

}
