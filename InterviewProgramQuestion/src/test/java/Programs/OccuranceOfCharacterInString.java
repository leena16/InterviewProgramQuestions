package Programs;

public class OccuranceOfCharacterInString {

	public static void main(String[] args) {
	
		String str= "hello to Java";
		String s1=str.replace("a","");
		
		System.out.print(str.length()-s1.length());
	}

}
