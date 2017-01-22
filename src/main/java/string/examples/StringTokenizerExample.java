package string.examples;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String args[]) {
		String s1 = "this , is , my, name";
		StringTokenizer st = new StringTokenizer(s1,",");//it breaks String s1 to tokens based on "," delimeter.
		while (st.hasMoreTokens()) {// it executes until all tokens are complete
			System.out.println(st.nextToken());//it saves each token in to String.
		}
	}

}
