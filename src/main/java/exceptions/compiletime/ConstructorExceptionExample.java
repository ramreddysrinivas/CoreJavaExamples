package exceptions.compiletime;

import java.io.IOException;

public class ConstructorExceptionExample {
	
	
public ConstructorExceptionExample() throws IOException{
	System.out.println(" before throw");
	throw new IOException();
	//System.out.println(" after throw");//unreachable code,compilation error.
	//return;//unreachable code,compilation error.
}
public static void main(String[] args) {
	try {
		ConstructorExceptionExample constructorExceptionExample = new ConstructorExceptionExample();
	} catch (IOException e) {
		System.out.println("inside catch block");
	}
			
			
			
}
}
