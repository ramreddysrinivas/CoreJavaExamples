package innerclass.anonymous;

public class AnonymousAbstractClassDemo {
	public static void main(String args[]) {
		AnonymousAbstractClass inner = new AnonymousAbstractClass() {
			@Override
	         public void mymethod1() {
	            System.out.println("AnonymousInnerClass overriden Method");
	            mymethod2();
	         }
			
	         public void mymethod2() {
		            System.out.println("AnonymousInnerClass Method");
		           
		         }
	      };
	      inner.mymethod1();
	      //inner.mymethod2();// myMethod2() is not belongs to AnonymousAbstractClass. 
	      //it is a method of AnonymousClass which is created at compilation time.
	   }

}
