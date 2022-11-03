package Programs;

public class ReverseAString {

	public static void main(String[] args) {
		String s= "Hello";
		String revStr="";
		
		for(int i=s.length()-1;i>=0;i--) {
			
			revStr=revStr+s.charAt(i);
			
		}
		System.out.print(revStr);
	}
	

}
