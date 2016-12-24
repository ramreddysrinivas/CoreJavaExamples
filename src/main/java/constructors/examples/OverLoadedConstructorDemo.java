package constructors.examples;

public class OverLoadedConstructorDemo {
	public static void main(String[] args) {
		OverLoadedConstructor o1 = new OverLoadedConstructor();
		OverLoadedConstructor o2 = new OverLoadedConstructor(5);
		OverLoadedConstructor o3 = new OverLoadedConstructor("Naresh");
		OverLoadedConstructor o4 = new OverLoadedConstructor(25, "Eswar");
		OverLoadedConstructor o5 = new OverLoadedConstructor("Soumya", 50);

	}
}