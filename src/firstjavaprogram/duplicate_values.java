package firstjavaprogram;

public class duplicate_values {
	static int count = 1;
	public static void main(String[] args)
	{
		String ar[] = {"bhanu","jagan","bhagi","bhanu","jagan"};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count += 1;
					if(count>1)
					{
						System.out.println(ar[i]);
						count = 1;
					}
				}
			}
		}
	}
}

