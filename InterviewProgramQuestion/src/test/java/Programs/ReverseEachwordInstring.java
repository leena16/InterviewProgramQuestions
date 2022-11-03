package Programs;

public class ReverseEachwordInstring {

	public static void main(String[] args) {
		
		String str= "Hell0 World";
		System.out.println("Before Reverse "+str);
		
		String reverseString="";
		String[] s= str.trim().split(" ");
		
	
		for(String s1: s) {
			String temp="";
			for(int i=s1.length()-1;i>=0;i--) {
				
				temp=temp+s1.charAt(i);
				
				
			}
			
			 reverseString = reverseString+temp+" ";
		
		}
	
		System.out.println(reverseString);
	}

}
