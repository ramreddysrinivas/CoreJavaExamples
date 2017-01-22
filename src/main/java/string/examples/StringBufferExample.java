package string.examples;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("String1");
		System.out.println(sb);
		String s1=sb.toString();//it converts StringBuffer object to String. 
		System.out.println(s1);
		sb.append("  String2  ").append(true).append("  String3 ").append(s1);
		System.out.println(sb);
	}

}
