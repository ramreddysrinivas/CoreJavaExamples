package logicalprograms;

public class PrimeNumbers2 {
	
	public static void main(String args[])
	{
		for (int i=1; i <= 100; i++ ){
			int j;
			for (j=2; j<i; j++){
			int n = i%j;
			if (n==0){
			break;
			}
			}
			if(i == j){
			System.out.print(" "+i);
			}
			}
	}
	}


