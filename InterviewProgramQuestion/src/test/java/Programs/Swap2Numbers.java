package Programs;

public class Swap2Numbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		b=b+a;
		a=b-a;
		b=b-a;
		
		System.out.print(a+ " "+b);
		

	}

}
