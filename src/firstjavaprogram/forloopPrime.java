package firstjavaprogram;

public class forloopPrime {

	public static void main(String[] args) {
		for (int n=2;n<=100;n++) {
			boolean isprime = true;
			for (int div=2; div<n; div++) {
				if(n%div ==0) {
					isprime =false;
					break;
				}
			}
			if(isprime) {
				System.out.println(n + " is prime" );
			}
		}

	}

}
