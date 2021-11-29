package strings;

import java.util.ArrayList;
import java.util.List;

public class string_buffer {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("bhanu");
		sbf.append(" reddy");
		System.out.println(sbf);
		sbf.replace(0, 5, "bhagya");
		System.out.println(sbf);
		StringBuffer newS = sbf.reverse();
		System.out.println(newS);
		System.out.println(sbf);
		sbf.append(" "+ 76.64);
		System.out.println(sbf);
		System.out.println(sbf.capacity());
		
		List js = new ArrayList();
		
	}

}
