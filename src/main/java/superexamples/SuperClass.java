package superexamples;

import thisexamples.ThisExample;

public class SuperClass {

	
	 int a;
	public SuperClass(){
		
		System.out.println("SuperClass default constructor");
	}
	
	public SuperClass(int a){
		
		
		System.out.println("SuperClass one argument constructoe");
	}

	public void printA(int a) {
		System.out.println("SuperClass.printA stated");
		this.a = 20;
		System.out.println("a   " + a);
		System.out.println("SuperClass.printA ended");

	}

	
	}

