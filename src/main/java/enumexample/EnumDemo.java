package enumexample;

public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(Enum1.CONST1);
		for(Enum1 e: Enum1.values()){
			System.out.println(e);
		}
	}

}
