package ifelse.loops.examples;

public class Big2IntUsingIfelse {
	public  void big2int(int a, int b) {
		if (a > b)// { } is optional
			System.out.println("A is big  a=" + a);
		else if (b > a) {
			System.out.println("B is Big  b=" + b);
		}
		else {
			System.out.println("A and B are same  a= " + a + "  b = " + b);
		}
	}
	public static void main(String[] args) {
		Big2IntUsingIfelse b = new Big2IntUsingIfelse();
		b.big2int(20, 10);
		b.big2int(5, 10);
		b.big2int(15, 15);
	}

}
