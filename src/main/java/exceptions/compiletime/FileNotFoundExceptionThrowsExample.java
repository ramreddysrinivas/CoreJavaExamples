package exceptions.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionThrowsExample {
	public static void main(String args[]) throws IOException,Exception,FileNotFoundException {
		System.out.println("enterd main method");
		FileInputStream fis = null;

		fis = new FileInputStream("abc.txt");
System.out.println("after file read");
		int k;

		while ((k = fis.read()) != -1) {
			System.out.print((char) k);
			
		}
		fis.close();
	}

	
}

