package Programs;

import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		int [] arr= {2,0,8,0,4,0};
		int[] temp=new int[arr.length];
		int count=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[count]=arr[i];
				count++;
				
			}
		}
		System.out.print(Arrays.toString(temp));

	}

}
