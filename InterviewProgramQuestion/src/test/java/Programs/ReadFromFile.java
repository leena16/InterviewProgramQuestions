package Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
	
		/*FileReader fr= new FileReader("/Users/leenakelkar/Documents/Notes/test.txt");
			BufferedReader br= new BufferedReader(fr);
			String str="";
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
	}*/
		
		
	//*******using file and scanner class
		
		File file = new File("/Users/leenakelkar/Documents/Notes/test.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()) {
			System.out.print(scan.nextLine());
		}

}
}
