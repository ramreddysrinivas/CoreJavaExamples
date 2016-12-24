package staticexamples;

public class AbstractSubClassStaticMethod extends AbstractSuperClassStaticMethod {

	public  void m2(){
		
	}
/*	public	 void staticm1(){
		
	}
*///we can not override static method in sub class
	public	static void staticm1(){
		
		//this method will be treeted as seperate method no comparision with super class static method
	}
	}

