package scanner.examples;

import java.util.Scanner;

public class ReadDataTypesFromConsole {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a line of statement to read ");
		String s2=sc.nextLine();
		System.out.println("enter integer value");
		int i1=sc.nextInt();
		System.out.println("enter double value");
		double d1=sc.nextDouble();
		System.out.println("enter boolean value");
		boolean b1=sc.nextBoolean();
		//System.out.println("enter char value");
		//char c1=sc.nextChar();//we dont have nextChar() in Scanner Class
		System.out.println("enter string value");
		String s1=sc.next();
		sc.nextLine();//if we dont give this statement, it internally calling the next "nextLine()"to read s3 value 
		              // from console at execution time.
		System.out.println("enter a line of statement to read ");
		String s3=sc.nextLine();
		System.out.println("i1="+  i1  + "  d1="+  d1 + "  b1="+  b1 + "  s1="+  s1);
		System.out.println(" s2 =" + s2);
		
	}

}
