package Programs;

public class FindAllsubstrings {

	public static void main(String[] args) {
		String str= "Hello";
		int count=0;
		//for (int i=0;i< str.length()-1;i++) {
			
			for(int j=0;j<str.length()-2;j++) {
				String sub=str.substring(j,j+3);
				System.out.println(sub);
			
				
			}
		//}
		

	}

}
