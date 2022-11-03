package Programs;

public class RemoveJunkCharacter {

	public static void main(String[] args) {
		
		String str="hello $#^90 world";
		String str1=str.replaceAll("[^A-Za-z]", "");
		System.out.print(str1);
		

	}

}
