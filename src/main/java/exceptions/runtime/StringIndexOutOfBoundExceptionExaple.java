package exceptions.runtime;

public class StringIndexOutOfBoundExceptionExaple {
	public static void main(String args[])
	   {
	      try{
		 String str="srinu";
		 System.out.println(str.length());
		 char c = str.charAt(4);
		 System.out.println(c);
		 c = str.charAt(5);
		 System.out.println(c);
	      }catch(StringIndexOutOfBoundsException e){
		  System.out.println(e);
	       }
	   }

}
