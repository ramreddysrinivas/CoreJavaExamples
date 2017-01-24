package exception.userdefined;

import exception.common.InvalidInputException;



public class ArmstrongWithUserdefinedException {


	public long armstrongNumber(long input) throws InvalidInputException {
		
		long result = 0;
		if(input<1){
			throw new InvalidInputException("please enter valid input >=1"); 
		}else{
			long Armstrong = input ;
		
		//long result = 0;
		while (Armstrong != 0) {
			
			long reminder = Armstrong % 10;
			result = result+(reminder*reminder*reminder) ;
			Armstrong = Armstrong / 10;
			
		}
		}
		
		return result;
	}
	public static void main(String[] args) {
		long input = 153;
		ArmstrongWithUserdefinedException armstrongWithUserdefinedException = new ArmstrongWithUserdefinedException();
		long output = 0;
		try {
			output = armstrongWithUserdefinedException.armstrongNumber(input);
			if (input == output) {
				System.out.println("Armstrong");
			} else {
				System.out.println("not Armstrong");
			}
		} catch (InvalidInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}



}
