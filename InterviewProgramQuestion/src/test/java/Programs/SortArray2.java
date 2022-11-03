package Programs;

import java.util.Arrays;
import java.util.Collections;

public class SortArray2 {

	public static void main(String[] args) {
		/*int a[]= {1,7,4,5};
		Arrays.parallelSort(a);
		System.out.print(Arrays.toString(a));*/
		
		/*int a[]= {1,7,4,5};
		Arrays.sort(a);
		System.out.print(Arrays.toString(a));*/
		
		Integer a[]= {3,9,6,2};
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.print(Arrays.toString(a));
		
	}

}
