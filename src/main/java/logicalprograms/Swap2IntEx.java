package logicalprograms;

public class Swap2IntEx {
	public static void main(String[] args) {
		Swap2IntEx swap2IntEx= new Swap2IntEx();
		
		swap2IntEx.swap2Int(0,5);
	}

	private void swap2Int(int a, int b) {
		System.out.println("before swapping  a = " + a + " b = " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping  a = " + a + " b = " + b);
	}

}
