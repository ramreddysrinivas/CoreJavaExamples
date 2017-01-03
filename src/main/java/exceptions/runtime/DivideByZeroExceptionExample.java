package exceptions.runtime;

import java.util.Scanner;

public class DivideByZeroExceptionExample {
	
	public static DivideByZeroExceptionExample createObject() {

		DivideByZeroExceptionExample arithmaticException = new DivideByZeroExceptionExample();
		return arithmaticException;
	}

	public double div(int a, int b) {
		double d1 = 0.0;
		try {
			//System.exit(20);// control will come out of jvm.it will not execute finally block.
			
			d1 = a / b;
			return d1;
		}

		// System.out.println("try block completed");// we should not write any
		// other stmt b/w try and catch blocks.
		catch (ArithmeticException ae) {
			System.out.println("invalid input for variable b  " + b
					+ " it throws exception  " + ae);
		}
		// System.out.println("catch block completed");// we should not write
		// any other stmt b/w catch and finally blocks.
		finally {
			System.out.println("finally block");
		}
		return d1;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value");
		int a = scanner.nextInt();
		//double d2 = arithmaticException.div(a, b);
		//DivideByZeroExceptionExample arithmaticException = DivideByZeroExceptionExample.createObject();
		System.out.println("enter b value");
		int b = scanner.nextInt();
		DivideByZeroExceptionExample arithmaticException = createObject();
		/*DivideByZeroExceptionExample arithmaticException2 = createObject();
		DivideByZeroExceptionExample arithmaticException3 = createObject();
		DivideByZeroExceptionExample arithmaticException4 = createObject();
		*/
		double d2 = arithmaticException.div(a, b);
		System.out.println(d2);
	}

}
