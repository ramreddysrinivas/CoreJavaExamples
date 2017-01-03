package exceptions.runtime;

public class NullPointerExceptionExample {
	public static void main(String args[])
	{
		try{
			String str=null;
			System.out.println (str.length());
		}catch(NullPointerException ne){
			System.out.println("NullPointerException.." + ne);
		}
	}

}
