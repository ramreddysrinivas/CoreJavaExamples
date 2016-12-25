package thisexamples;

public  class ThisExample {
	
	private int a;
	public ThisExample(){
		
		this(10);
		System.out.println("default constructor");
		//this(10);//we should add this statement as first statement in constructor 
	}
	
	//this();// this should not be used anywhere other than constructor
	public ThisExample(int a){
		//this();//this will give recursive execution exception.
		//because we are calling this one arg constructor from default constructor 
		
		this.printA(32);
		
		System.out.println("one argument constructoe");
	}

	public void printA(int a) {
		//this();//we should use this() in constructor only.
		this.a = 20;
		System.out.println("a   " + a);

	}

	public static void main(String[] args) {
		

		ThisExample o1 = new ThisExample();
		System.out.println(o1.a);
		o1.printA(10);

		System.out.println(o1.a);
	}

}
