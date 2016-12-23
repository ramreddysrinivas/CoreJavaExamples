package constructor.executionflow;

public class Demo {
	public static void main(String[] args) {
		 Level4Class d = new Level4Class();// A B C D
		 System.out.println();
		// C c1= new B();//wrong
		 Level1Class a1= new Level3Class();//A B C
		 System.out.println();
		 Level2Class b1 = new Level3Class();
		 System.out.println();
		 Level1Class a2 = new Level2Class();
		 System.out.println();
		 Level3Class c2 = new Level3Class();
		 System.out.println();
		 Level1Class a3 = new Level3Class();
		 System.out.println();
		 Level2Class b2 = new Level4Class();
		 System.out.println();
		// D d2= new C();// wrong
		 Level3Class c3 = new Level4Class();
		
	}

}
