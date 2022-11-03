package Programs;

public class findallSubstring2 {

	public static void main(String[] args) {
		String str= "Hello";
		
		
		for(int i=0;i<str.length();i++) {
			for (int j=i;j<=str.length();j++) {
				if(i!=j) {
				String substr=str.substring(i,j);
				System.out.println(substr);
				}
				
				
				
				
			}
		}

	}

}
