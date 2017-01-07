package exceptions.runtime;

public class NumberFormatExceptionExample {
	public static void main(String args[])
	   {
	      try{
		 int num=Integer.parseInt ("10") ;
		 System.out.println(num);
		 int num1=Integer.parseInt ("XYZ") ;
		 System.out.println(num1);
	      }catch(NumberFormatException e){
		  System.out.println("Number format exception occurred" + e);
	       }
	   }

}
