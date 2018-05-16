/**
 * 
 */
package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author lenovo
 *
 */
public class TestBufferedReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr =new FileReader("d:\\filename.txt");
		BufferedReader br = new BufferedReader(fr);
        String line;  
        
        while((line = br.readLine())!=null){  
            System.out.println(line);  
	}
        br.close();
        fr.close();
  }
}
