package singleton.example;

public class SingletonClass {
    
    private static SingletonClass myObj;
    /**
     * Create private constructor
     */
    private SingletonClass(){
         
    }
    /**
     * Create a static method to get instance.
     */
    public static SingletonClass getInstance(){
        if(myObj == null){
            myObj = new SingletonClass();
        }
        return myObj;
    }
     
   
}