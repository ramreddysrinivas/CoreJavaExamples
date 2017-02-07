package logicalprograms;

public class FactorialExample {
	public long fact(int input){

		long fact = 1;
		 while(input!=0){
			// fact = fact*input;
			// input = input-1;
			 //fact = fact*input; and  fact*=input; both are same
			 //input = input-1; and input--; both are same
			 fact*=input;
			 input--;
		 }
	 
		return fact;
	}
	public static void main(String[] args) {
		FactorialExample factorialExample = new FactorialExample();
		long result= factorialExample.fact(5);
		System.out.println(result);
	}

}
