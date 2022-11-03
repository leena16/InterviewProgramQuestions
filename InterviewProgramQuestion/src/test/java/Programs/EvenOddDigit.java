package Programs;

public class EvenOddDigit {

	public static void main(String[] args) {
	int num=12345666;
	int rem=0;
	int oddcount=0;
	int evenCount=0;
	
	while(num!=0) {
		rem=num%10;
		
		System.out.println(rem);
		num=num/10;
		
		if(rem%2==0) {
			evenCount++;
		}else {
			oddcount++;
		}
	}
	System.out.print("Even"+evenCount);
	System.out.print("ODD"+oddcount);


	}

}
