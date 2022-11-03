package Programs;

import java.util.HashMap;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String str= "Hello world";
		str=str.replace(" " , "");
		
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for(int i =0;i<str.length()-1;i++) {
			if(hm.containsKey(str.charAt(i))) {
				int count =hm.get(str.charAt(i));
			System.out.println(count);
				hm.put(str.charAt(i),++count); 
				

			}else {
				hm.put(str.charAt(i), 1);
			}
			System.out.println(hm);
			
		}
		
	}
}
