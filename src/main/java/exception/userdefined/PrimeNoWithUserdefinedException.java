package exception.userdefined;

import exception.common.InvalidInputException;


public class PrimeNoWithUserdefinedException {
	
		public boolean isPrime(int input)throws InvalidInputException{
			if (input<2){
			throw new InvalidInputException("please enter valid input >=2"); 
			}else{
			int m=input/2;
			for(int i=2;i<=m;i++){
				if (input%i==0){
					return false;
				}
			}
			}
				
			return true;
		}
		
		
		public static void main(String[] args) {
			
			
			PrimeNoWithUserdefinedException primeNoWithUserdefinedException = new PrimeNoWithUserdefinedException();
		boolean output = false;
		try {
			output = primeNoWithUserdefinedException.isPrime(2);
			if(output==true){
				System.out.println("prime number");
			}else{
				System.out.println("not a prime number");
				
			}
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}

	}

