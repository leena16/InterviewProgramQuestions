package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Create2DArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter rows:" );
		int rows=scan.nextInt();
		
		System.out.println("enter columns: ");
		int cols= scan.nextInt();
		
		int[][] data= new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				data[i][j]=scan.nextInt();
				
			}
			
		}
		
		for(int[] f:data) {
			System.out.print(Arrays.toString(f));
		}

	}

}
