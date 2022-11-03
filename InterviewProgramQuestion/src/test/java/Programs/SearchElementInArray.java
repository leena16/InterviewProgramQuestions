package Programs;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==3) {
				System.out.println(a[i]+"found at"+i);
				break;
			}
		}

	}

}
