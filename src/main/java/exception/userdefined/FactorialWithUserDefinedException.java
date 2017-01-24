package exception.userdefined;

import java.util.Scanner;

import exception.common.InvalidInputException;



public class FactorialWithUserDefinedException {
	 public int returnInputInt(){
		 Scanner scanner = new Scanner (System.in);
		 System.out.println("enter integer value");
		 int input = scanner.nextInt();
		 return input;
	 }
	 public long calculateFactorial(int input)throws InvalidInputException{
		 long fact = 0;
		 if(input<=0){
			throw new InvalidInputException("please enter valid input >=1"); 
			
		 }else{
			 fact = 1;
			 while(input!=0){
				// fact = fact*input;
				// input = input-1;
				 //fact = fact*input; and  fact*=input; both are same
				 //input = input-1; and input--; both are same
				 fact*=input;
				 input--;
			 }
		 }
			
		 return fact;
	 }
	
	
	
	public static void main(String[] args) {
		FactorialWithUserDefinedException factorialWithUserDefinedException = new FactorialWithUserDefinedException();
		int input =factorialWithUserDefinedException.returnInputInt();
		long fact = 0;
		try{
		 fact=factorialWithUserDefinedException.calculateFactorial(input);
		 System.out.println("factorial is  " + fact);
	}catch(Exception e){
		System.out.println(e.getMessage());
		
	}

}
}
