package printtest;

public class Throw{ 
		// your code goes here
    public static void throwing(){
		try{
			int dbz = 1/0;
		} catch(NullPointerException nl){
			System.err.println("haha");
			System.err.println("hey" + nl.getMessage());
		} catch(ArithmeticException ar){
			System.err.println(ar.getMessage());
                        
		}
	}
}