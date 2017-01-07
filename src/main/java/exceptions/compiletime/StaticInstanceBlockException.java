package exceptions.compiletime;

public class StaticInstanceBlockException {
	static {
		System.out.println("in static block");
		if (true) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("static catch block");

			}
		}
	}

	{
		System.out.println("in instance block");
		if (true) {
			try {
				throw new Exception();
			} catch (Exception e) {
				System.out.println("instance catch block");
			}
		}
	}
	public static void main(String[] args) {
		StaticInstanceBlockException staticInstanceBlockException;
		System.out.println("object decleared");
		staticInstanceBlockException=new StaticInstanceBlockException();
		System.out.println("object initialized");
	}
}
