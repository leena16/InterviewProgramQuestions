package Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntofile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("/Users/leenakelkar/Documents/Notes/test.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		fw.write("writing from java");
		
		fw.close();
	}

}
