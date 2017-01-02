package exceptions.runtime;

import java.util.Scanner;

public class ArithmaticException {
	public double div(int a,int b){
	double d1=	a/b;
		
		return d1 ;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a value");
		int a = scanner.nextInt();
		System.out.println("enter b value");
		int b = scanner.nextInt();
		ArithmaticException arithmaticException = new ArithmaticException();
		double d2= arithmaticException.div( a, b);
		System.out.println(d2);
	}

}
