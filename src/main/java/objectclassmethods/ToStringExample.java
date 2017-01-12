package objectclassmethods;

public class ToStringExample {
	public String  toString(){
		return "this is ToStringExample  ";
	}
	public static void main(String[] args) {
		ToStringExample toStringExample = new ToStringExample();
		System.out.println(toStringExample);//objectclassmethods.ToStringExample@5058431c
// observe the out put by commenting toString()
	
	}

}
