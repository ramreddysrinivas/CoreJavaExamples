package abstratclassinterface.examples;

public abstract class AbstractClass {

	// Constructor name should be equal to Classname
	// abstract class can contain constructor
	public AbstractClass() {
		System.out.println("AbstractSuper");
	}

	public abstract void abstractSuperM1();

	public void abstractSuperM2() {
		System.out.println("This is abstractSuperM2");
	}

	public void abstractSuperM3() {
		// it is null body method
	}

}
