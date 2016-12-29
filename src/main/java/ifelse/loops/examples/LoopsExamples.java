package ifelse.loops.examples;

public class LoopsExamples {
	
	private  String s1 = "    ";
	public void whilemethod() {
		System.out.println("whilemethod is started");
		int i = 1;
		while (i <= 50) {
			if (i >= 35) {
				System.out.println("i rached 35, i = " + i);
				break;
			}
			if (i % 2 == 0) {
				System.out.print(i + s1);
			}
			i++;
		}
		System.out.println("whilemethod is ended");
	}
	
	public void dowhileMethod() {
		System.out.println("dowhileMethod is started");
		int i = 1;
		do {
			if (i >= 35) {
				System.out.println("i rached 35, i = " + i);
				break;
			}
			if (i % 2 == 1) {
				System.out.print(i + s1);
			}
			i++;
		} while (i <= 50);
		System.out.println("dowhileMethod is ended");
	}

	public void formalForMethod() {
		System.out.println("formalForMethod is started");
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.print(i + s1);
			}
		}
		System.out.println("formalForMethod is ended");
	}
public void forEachMethod(){
	
	System.out.println("forEachMethod is started");
		int a[]={1,2,3,4};
		for(int i:a){
			System.out.print(i +s1);
		}

	System.out.println("forEachMethod is ended");
	
}
	public static void main(String[] args) {
		LoopsExamples l= new LoopsExamples();
		l.whilemethod();
		l.dowhileMethod();
		l.formalForMethod();
		l.forEachMethod();
		
	}

}
