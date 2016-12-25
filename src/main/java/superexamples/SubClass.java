package superexamples;

public class SubClass extends SuperClass {
	
	public SubClass(int a){
		super();
		System.out.println("SubClass.one arg constructor");
		System.out.println("super.a="+ super.a);
	}
	public SubClass(int a,int b){
		this(10);
		//super();//in a constructor we can add either this() or super() but not both
		super.printA(50);
		System.out.println("SubClass.two arg constructor");
		System.out.println("super.a="+ super.a);
		
	}
public static void main(String[] args) {
	//SubClass s = new SubClass();//compilation error because subclass has one arg constructor .
	//jvm will not provide default constructor in this case.
	//SubClass s = new SubClass(10,20);
	SubClass s = new SubClass(10);
	
}
}
