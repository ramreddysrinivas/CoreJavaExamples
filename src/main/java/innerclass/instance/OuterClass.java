package innerclass.instance;

public class OuterClass {
	//interface i{ }// it does not give error.
	 public void m1() {
         System.out.println("This is m1 in outer class");
      }
	   
	   // inner class
	    class InnerClass {
	      public void m1() {
	         System.out.println("This is m1 in inner class");
	      }
	      public void m2() {
		         System.out.println("This is m2 in inner class");
		      }
	      public void m3() {
		         System.out.println("This is m3 in inner class");
		      }
	   }
	   
	}


