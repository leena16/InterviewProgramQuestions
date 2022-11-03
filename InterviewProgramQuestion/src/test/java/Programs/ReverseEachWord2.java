package Programs;

public class ReverseEachWord2 {

	public static void main(String[] args) {
		
			String str="hello to Java";
			String[] word=str.split(" ");
			String reverse="";
			for(String s:word) {
				StringBuilder sb= new StringBuilder(s);
				sb.reverse();
				reverse=reverse+sb.toString()+" ";
				
				
			}
			System.out.println(reverse);

	}

}
