package Programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a= 1234321;
		int revNum=0;
		while(a!=0) {
			revNum=revNum*10+a%10;
			a=a/10;
		}
		
		System.out.print(revNum);

	
		if(a==revNum) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
}
}
