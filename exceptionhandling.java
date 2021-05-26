package arthematicoperations;

public class exceptionhandling {
public static void main(String args[]) {
	int a=10;
	int b=0;
	try {
		if (a/b==0) {
			System.out.println("Execption not worked");
		}
	}
	
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
	catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception");
     }
	 
   System.out.println("Out of try-catch block...");
}
}
