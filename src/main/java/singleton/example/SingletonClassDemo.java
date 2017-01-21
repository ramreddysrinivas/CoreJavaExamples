package singleton.example;

public class SingletonClassDemo {
	public static void main(String[] args) {
		//SingletonClass singletonClass = new SingletonClass();//private constructor not visible out side.
		SingletonClass singletonClass1= SingletonClass.getInstance();
		SingletonClass singletonClass2= SingletonClass.getInstance();
		SingletonClass singletonClass3= SingletonClass.getInstance();
		SingletonClass singletonClass4= SingletonClass.getInstance();
		if (singletonClass1.equals(singletonClass2)&&singletonClass2.equals(singletonClass3)&&singletonClass3.equals(singletonClass4)){
			System.out.println("objects are same  " +  singletonClass1  + " " +  singletonClass2 );
		}
	}

}
