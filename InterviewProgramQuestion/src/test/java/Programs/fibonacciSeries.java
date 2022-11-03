package Programs;

public class fibonacciSeries {
	public static void main(String args[]) {
	//0,1,1,2,3,5,8....
	int a=0;
	int b=1;
	int sum=0;
	System.out.print(a+","+b);
			for(int i=0;i<20;i++) {
				 sum=a+b;
				 
				a=b;
			b=sum;
				System.out.print(","+sum);
				
			}
			
	}

}
