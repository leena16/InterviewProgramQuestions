package Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class DuplicateWithSort {

	public static void main(String[] args) {
		int[] arr = {1,2,9,4,2,3,4,7,5,6};
		//int b[]= new b[arr.length];
		
		LinkedHashSet<Integer> hs= new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		
		System.out.println(hs);
	
		LinkedList ls= new LinkedList();
		ls.addAll(hs);
		System.out.print(ls);
		Collections.sort(ls);
		System.out.print(ls);
		

	}

}
