package innerclass.methodlocal;

public class OuterClass {
	// instance method of the outer class 
	   void my_Method() {
	      final int num = 23;

	      // method-local inner class
	      class MethodInnerClass {
	         public void print() {
	            System.out.println("This is method inner class "+num);	   
	         }   
	      } // end of inner class
		   
	      // Accessing the inner class
	      MethodInnerClass inner = new MethodInnerClass();
	      inner.print();
	   }
	   
	   	   	   
	   }


