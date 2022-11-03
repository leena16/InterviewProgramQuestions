package Programs;

public class sumOfDigit {

	public static void main(String[] args) {
		int a=9876;
		int rem=0;
		int sum=0;
		while(a!=0) {
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}

		System.out.print(sum);
	}

}
