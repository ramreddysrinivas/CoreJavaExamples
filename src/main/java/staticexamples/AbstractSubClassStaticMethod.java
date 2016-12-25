package staticexamples;

public class AbstractSubClassStaticMethod extends AbstractSuperClassStaticMethod {

	public  void m2(){
		AbstractSuperClassStaticMethod.staticm1();
		staticm1();
		
	}
/*	public	 void staticm1(){
		
	}
*///we can not override static method in sub class
	public	static void staticm1(){
		System.out.println("AbstractSubClassStaticMethod.staticm1");
		//this method will be treated as separate method no comparison with super class static method
	}
	public static void main(String[] args) {
		AbstractSubClassStaticMethod a1 = new AbstractSubClassStaticMethod();
		a1.m2();
		
	}
	}

