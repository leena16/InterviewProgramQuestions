package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=2356;
		int b=0;
		while(a!=0) {
		 b=	b*10+a%10;
			a=a/10;
		}
		System.out.print(b);

	}

}
