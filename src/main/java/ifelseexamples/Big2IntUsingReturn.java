package ifelseexamples;

public class Big2IntUsingReturn {
	public static void big2int(int a,int b){
		if(a>b){
		System.out.println("A is big  a="  +a);
		return;
		}
		if(b>a){
			System.out.println("B is Big  b="  +b);
			return;
			
		}
		
		if (a==b){
			System.out.println("A and B are same  a= " +a + "  b = " +b);
			
		}
		
	}
	public static void main(String[] args) {
		
		big2int(20,10);
		big2int(5,10);
		big2int(15,15);
	}



}
