package Programs;

import java.util.HashMap;

public class digitCount {

	public static void main(String[] args) {
		int number=555577;
		HashMap <Integer, Integer> hm= new HashMap<Integer,Integer>();
		int count =0;
		while(number!=0) {
			
			int temp=number%10;
			System.out.println(temp);
				
				if(hm.containsKey(temp)) {
					hm.put(temp, ++count);
					
				}
				else {
					hm.put(temp, 1);
					count=1;
					
					
				}
			
			
			
			number=number/10;
			
			
		}
		System.out.print(hm);

	}

}
