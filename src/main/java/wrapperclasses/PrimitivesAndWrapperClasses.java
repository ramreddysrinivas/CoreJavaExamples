package wrapperclasses;

public class PrimitivesAndWrapperClasses {
	private int i1;
	private double d1;
	private boolean b1;
	private char c1;
	
	private Integer i2;
	private Double d2;
	private Boolean b2;
	private Character c2;
	
	public void printprimitives(){
		System.out.println("before initializing i1="+i1 + "  d1="+ d1 + "  b1=" +b1 + "  c1= " + c1);
		
		i1=10;
		d1=5.32;
		b1=true;
		//System.exit(0);// control will come out of jvm.
		c1='a';
		System.out.println("after initializing i1="+i1 + "  d1="+ d1 + "  b1=" +b1+ "  c1=" +c1);
	}
	public void printwrappers(){
		System.out.println("before initializing i2="+i2 + "  d2="+ d2 + "  b2=" +b2 + "  c2=" +c2);
		
		i2=20;
		d2=6.32;
		b2=true;
		//System.exit(0);// control will come out of jvm.
		c2='s';
		System.out.println("after initializing i2="+i2 + "  d2="+ d2 + "  b2=" +b2+ "  c2=" +c2);
	}
public static void main(String[] args) {
	PrimitivesAndWrapperClasses p = new PrimitivesAndWrapperClasses();
	p.printprimitives();
	p.printwrappers();
}
}
