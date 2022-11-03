package Programs;

public class CountwordInString {

	public static void main(String[] args) {
		String str= "Hello to the world and java";
		String[] word=str.split(" ");
		int count=0;
		
		System.out.println(word.length);
		for(String w:word) {
			count ++;
			
		}
		System.out.println(count);

	}

}
