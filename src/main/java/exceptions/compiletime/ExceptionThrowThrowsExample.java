package exceptions.compiletime;

public class ExceptionThrowThrowsExample {
	public void m1() throws Exception {
		throw new Exception();
	}
	public int m2() throws Exception {
		m1();
		return 0;
	}
	public String m3() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("in catch block");
		}
		return null;
	}
	public static void main(String[] args) {
		
		ExceptionThrowThrowsExample exceptionThrowThrowsExample = new ExceptionThrowThrowsExample();
		exceptionThrowThrowsExample.m3();
		
	}
}
