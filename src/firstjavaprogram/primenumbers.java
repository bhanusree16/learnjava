package firstjavaprogram;

public class primenumbers {

	public static void main(String[] args) {
		int number = 1;
		int factors = 0;
		String text = " is prime number";
		while(number<=100) {
			int divisor =1;
			while(divisor<=100) {
				if(number%divisor==0) {
					factors++;
					divisor++;
					if(number<divisor){
						break;
					}
				}
				else
					divisor++;
			}
			
			if (factors == 2) 
				System.out.println(number + text );
			if (factors > 2) 
				System.out.println(number + " is composite number" );
				factors = 0;
				number++;
		}

	}

}
