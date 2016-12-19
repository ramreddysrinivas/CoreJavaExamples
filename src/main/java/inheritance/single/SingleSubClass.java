package inheritance.single;

public class SingleSubClass extends   SingleSuperClass{

	public void subM1(){
		System.out.println("SingleSubClass subM1");
	 s = "Kiran";
	 System.out.println("SingleSuperClass  OverRidden " + s);
	// i = 20; //It is private variable in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
	 }
	
	private void subM2(){
		//superM2();//It is private method in SingleSuperClass & So it cannot be Accessed in SubClass eventough subclass is extending to superclass
		System.out.println("SingleSubClass subM2");
	}

	

}
