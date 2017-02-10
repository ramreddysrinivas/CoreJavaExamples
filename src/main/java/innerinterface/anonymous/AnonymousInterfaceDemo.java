package innerinterface.anonymous;

public class AnonymousInterfaceDemo {
	public static void main(String[] args) {
		AnonymousInterface i = new AnonymousInterface(){

			@Override
			public void mymethod1() {
	            System.out.println("AnonymousInterface overriden Method");
	            mymethod2();
	         }
	         public void mymethod2() {
		            System.out.println("AnonymousClass Method");
		           
		         }
			
		};
		i.mymethod1();
	      //i.mymethod2();// myMethod2() is not belongs to AnonymousInterface. 
	      //it is a method of AnonymousClass which is created at compilation time.
	}

}
