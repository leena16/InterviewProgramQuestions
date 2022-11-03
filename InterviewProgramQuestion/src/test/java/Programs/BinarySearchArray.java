package Programs;

public class BinarySearchArray {

	

		
public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,0};
		
		int l=0;
		int h=arr.length-1;
		int key=0;
		boolean flag = false;
		
		while(l<=h) {
			int m=(l+h)/2;
			 if(arr[m]==key) {
				 System.out.print("element Found");
				 flag=true;
				 //break;
				 }
					 if(arr[m]<key) {
						 l=m+1;
					 }
					if(arr[m]>key) {
						h=m-1;
					}
			
			
		}
		
		if(flag==false) {
			System.out.print("Element not found");
		}
	}


	}
