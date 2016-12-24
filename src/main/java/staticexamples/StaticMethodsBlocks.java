package staticexamples;

public class StaticMethodsBlocks {
	private int i=10;
	
	{
		staticM1();//we can call static method in instance block directly(with out using class name inside same class)
		System.out.println("Instance Block1");
		
	}//Instance Block
	
	static {
		
		//i=20;
		//System.out.println(i);
		//m2();//we can not access instance variables, instance method in static block
		System.out.println("Static Block1");
	}//static Block1
	
	public StaticMethodsBlocks(){
		System.out.println("default constructor");
	}
	
	public StaticMethodsBlocks(int i){
		System.out.println("one argument constructor");
	}
	
	
	
public static void staticM1(){
	
	System.out.println("staticM1");
	
}


{
	System.out.println("Instance Block2");
	 
}//Instance Block

public void m2(){
	
	System.out.println("Normal Methodm2" );
}
static {
	System.out.println("Static Block2");
}//static Block2



}
