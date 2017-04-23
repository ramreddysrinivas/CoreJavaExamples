 package logicalprograms;

public class ArmstrongExample { //examples 0, 1, 153, 370, 371, 407 etc.
	/*eg 1: 153 = (1*1*1)+(5*5*5)+(3*3*3)  
			where:  
			(1*1*1)=1  
			(5*5*5)=125  
			(3*3*3)=27  
			So:  
			1+125+27=153  
	
					eg 2: 371 = (3*3*3)+(7*7*7)+(1*1*1)  
					where:  
					(3*3*3)=27  
					(7*7*7)=343  
					(1*1*1)=1  
					So:  
					27+343+1=371 */
	public long armstrong(long input) {

		long armstrong = input;
		long result = 0;
		while (armstrong != 0) {
			long reminder = armstrong % 10;
			result = result+(reminder*reminder*reminder) ;
			armstrong = armstrong / 10;
		}
		return result;
	}
	public static void main(String[] args) {
		long input = 153;
		ArmstrongExample armstrongExample = new ArmstrongExample();
		long output = armstrongExample.armstrong(input);
		if (input == output) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
