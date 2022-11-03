package Programs;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int[] a= {1,4,6,5,3};
		 System.out.println("Before Sorting"+Arrays.toString(a));
		 
		 for(int i=0;i<a.length-1;i++) {
			 
			 for(int j=0;j<a.length-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 
				 }
				 
			 }
		 }
		 System.out.println("after Sorting"+Arrays.toString(a));
		

	}

}
