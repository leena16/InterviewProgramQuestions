package Programs;

public class LargestofthreeNumber {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 int c=30;
		 
		 if(a>b) {
			 if(a>c) {
				 System.out.print("a is greater");
			 }else {
				 System.out.print("c is greater");
			 }
		 }else if(b>c){
			 System.out.print("b is greater");
		 }else {
			 System.out.print("c is greater");
		 }
	}

}
