package strings;

import org.testng.annotations.Test;

public class string_methods {
	@Test
	public void main() {
		String name = "bhanu 'sree' 1234 sareddy." + "jagan mohan reddy";
		String s1 = "kalukurthy";
		s1 = "jagan";
		String s2 = "kalukurthy";

		System.out.println(name.substring(11));
		System.out.println(name.subSequence(2, name.length()));
		
//		if any same characters or symbols like '' in sentense use this method 
		System.out.println(name.substring(name.indexOf("'")+1,name.lastIndexOf("'")));
		
//		System.out.println(name.substring(name.lastIndexOf("-")+1,name.indexOf("'")))
		System.out.println(name.replace('s', 'S'));
		
//		extract numbers from string
		System.out.println(name.replaceAll("[^_0-9]+",""));
		
//		extract only string
		System.out.println(name.replaceAll("[0-9]+",""));
		
		System.out.println(s1);
		System.out.println(name);

//		using split
		String splits[] = (String[]) name.split(" ");
		for(int i=0;i<splits.length;i++)
		{
			System.out.println(splits[i]);
		}

	}

}
