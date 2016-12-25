package defaultvariablesmethods;

import privatevariablesmethods.PrivateSuperClass;

public class Class1 {
	 void m1(){
			
			System.out.println("subclassm1");
			DefaultSuperClass s = new DefaultSuperClass();
			s.a=30;//default variable is   accessible with out creating object because of inheritance
			s.s="s1";
		}
	 
	 

}
