package innerclass.instance;

public class InstanceInnerClassDemo {
	public static void main(String args[]) {
	      // Instantiating the outer class 
	      OuterClass outer = new OuterClass();
	      OuterClass.InnerClass inner = outer.new InnerClass();
	     // OuterClass.InnerClass inner = new OuterClass().new InnerClass();
	      inner.m1();
	      inner.m2();
	      inner.m3();
	      outer.m1();
	   }

}
