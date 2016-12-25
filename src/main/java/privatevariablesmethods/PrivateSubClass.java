package privatevariablesmethods;

import defaultvariablesmethods.DefaultSuperClass;

public class PrivateSubClass extends PrivateSuperClass {
	
	private void m1(){
		//super.a=30;//private variable is  not accessible
		//s="s1";//private variable is  not accessible
		System.out.println("subclassm1");
	}
public void m2(){
	//super.m1();//private method is not accessible
	System.out.println("m2");
}

public void m3(){
	DefaultSuperClass s = new DefaultSuperClass();
	//s.a=30;//defauit variable not accessible outside of the package
	//s.defaultmethiod();//defauit method not accessible outside of the package
	PrivateSuperClass a= new PrivateSuperClass();
	
	
}

}
