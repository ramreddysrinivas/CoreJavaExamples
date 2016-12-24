package finalvariables;

public class FinalVariable {
	
	private String s;
	
	
	private final String t  = "t1";
	
	public void m1(){
		 final String u;//  = "u1";
		 final String v = "v1";
		s = "s1";
		u="u1";
		//t = "t2";//Cannot reinitialize final variable. It throws a complile time Error.
		System.out.println();
		//u = "u2";// can not reassign final variable, it is already assigned with "u1"
		
		
	}
	public void m2(){
		s = "s2";
		//t = "t3";
	}
	
	
	

}
