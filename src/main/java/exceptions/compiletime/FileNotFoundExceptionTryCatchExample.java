package exceptions.compiletime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundExceptionTryCatchExample {
	public static void main(String args[]) {
		FileInputStream fis = null;
		//fis = new FileInputStream("abc.txt");//handling with try-catch
		
		try {
		  		fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("The source file does not exist. " + e);
		}catch (Exception e){
			System.out.println("in exception block1   " + e);
		}
		/*catch (IOException e){
			System.out.println("in exception block" + e);
		}*///exceptions should be in the order of child class to parent class, reverse is not possible
		int k;
		/*while ((k = fis.read()) != -1) {
			System.out.print((char) k);
		}
		fis.close();*///handling with try-catch
	try {
			while ((k = fis.read()) != -1) {
				System.out.print((char) k);
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("Some IO problem. " + e);
		}catch(Exception e){
			System.out.println("in exception block2    " + e);
		}
	}
}
