package string.examples;

public class StringImmutable {
	public static void main(String[] args) {
		String s1 ="String1";
		String s2 =s1;// assigning s1 value to s2. means s1 and s2 are pointing same memory.
		String s3 ="String1";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println((s1==s3) + "  "  + (s2== s3));
		System.out.println(s1.equals(s2));
		System.out.println((s1==s3) + "  "  + (s2== s3));
		System.out.println(s1 + " append s1");// it holds temporary memory.
		s1=s1.concat(" append s2" );// it will not override the value in s1 memory, it will create a new memory for s1.
		System.out.println(s1);
		System.out.println(s2);
	}

}
