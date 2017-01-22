package string.examples;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("String1");
		System.out.println(sb);
		String s1=sb.toString();//it converts StringBuilder object to String. 
		System.out.println(s1);
		sb.append("  String2  ").append(true).append("  String3 ").append(s1);
		System.out.println(sb);
	}


}
