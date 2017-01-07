package exceptions.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionThrowExample {

	public static void main(String args[]) throws Exception {
		FileInputStream fis = null;
		
		try {
		  		fis = new FileInputStream("abc.txt");
		} 
		catch (Exception e){
			System.out.println("in exception block1   " + e);
			throw new Exception();
		}
		finally {
			System.out.println(" finally block1");
		}
		int k;
	try {
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
		} catch (Exception e) {
			System.out.println("Some IO problem. " + e);
			throw new Exception();
		}
	
	finally{
		try {
			fis.close();
		} catch (IOException e) {
			System.out.println("exception while closing file  " + e);
		}
		}
	}


}
