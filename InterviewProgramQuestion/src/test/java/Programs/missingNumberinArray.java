package Programs;

public class missingNumberinArray {

	public static void main(String[] args) {
		

		int[] a= {1,2,4,5,6};
		
		int len= a.length;
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<len-1;i++) {
			sum1=sum1+a[i];
			
		
		}
		
		for(int i=1;i<=a.length;i++) {
			sum2=sum2+i;
			
		}
		
		System.out.print(sum2-sum1);

	}

}
