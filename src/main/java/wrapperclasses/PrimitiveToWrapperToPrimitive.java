package wrapperclasses;

public class PrimitiveToWrapperToPrimitive {
	public void autoboxing(){  //from primitives to wrapper
	 int a=50;  
     Integer a2=new Integer(a);//Boxing  

     Integer a3=5;//Boxing  
	 
     System.out.println(a2+" "+a3);  
	}
	public void unboxing(){  //from wrapper to primitive
		 Integer i=new Integer(50);  
	        int a=i;  
	          
	        System.out.println(a);  
		}
	
	public static void main(String[] args) {
		
		PrimitiveToWrapperToPrimitive p1 = new PrimitiveToWrapperToPrimitive();
		p1.autoboxing();
		p1.unboxing();
	}

}
