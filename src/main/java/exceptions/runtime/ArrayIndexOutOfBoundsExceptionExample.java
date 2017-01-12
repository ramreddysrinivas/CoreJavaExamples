package exceptions.runtime;

public class ArrayIndexOutOfBoundsExceptionExample {
	 public static void main(String args[]) {
		 int[] a = { };
		 int len= 0;
	      try {
	    	  
	        a = new int[2];
	           len=a.length;
	         System.out.println(len);
	         
	         System.out.println("Access element three :" + a[2]);
	      }catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);
	         System.out.println("array size is" + len);
	      }
	      System.out.println("Out of the block");
	     
	      
	 }
	   }
