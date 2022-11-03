package Programs;

public class StringPalindrome {

	public static void main(String[] args) {
		String str="madamr";
		String revstr="";
		
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		
		System.out.print(revstr);
		
		if(str.equalsIgnoreCase(revstr)) {
			System.out.print("string is palindrome");
		}
		else {
			System.out.print("string is not palindrome");
		}

	}

}
