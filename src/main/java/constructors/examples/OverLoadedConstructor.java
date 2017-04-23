package constructors.examples;

public class OverLoadedConstructor {
 private int a;
 private int b;
 private int c;
 private String s;
 private String s2;
 private String s3;
	public  OverLoadedConstructor() {
		a = 10;
		s = "Arun";

		System.out.println("OverLoadedDefaultConstructor   a = " + a + "s =  " + s);
	}

	public  OverLoadedConstructor(int a,int b,int c,String s,String s2,String s3){
		System.out.println("OverLoadedAll ArgumentConstructor   a = " + a + "  b = " + b +"    c = " + c + 
				"s =  " + s + "  s2 = " + s2 + " s3 = "+  s3 );
		
	}
	
	public OverLoadedConstructor(int a) {

		s = "Kiran";

		System.out.println("OverLoadedConstructor(int a)   a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(String s) {

		a = 30;

		System.out.println("OverLoadedConstructor(String s)   a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(int a, String s) {

		System.out.println("OverLoadedConstructor(int a, String s)  a = " + a + "s =  " + s);
	}

	public OverLoadedConstructor(String s, int a) {

		System.out.println("OverLoadedConstructor( String s, int a)   a = " + a + "s =  " + s);
	}

	

}
