package Programs;


public class primenumbe {
	
	public static boolean isprime(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
		
	}
	
	

	public static void main(String[] args) {
		System.out.print(isprime(8));
	}

}
