
package exception_multithreading_collections;
import java.util.InputMismatchException;
import java.util.Scanner;
public class hakerrank_eg1{
	public static void main(String args[]) {
	 int x,y;
     int z;
     Scanner sc = new Scanner(System.in);
    
     try{
    	 x=sc.nextInt();
         y=sc.nextInt();
         z=x/y;
         System.out.println(z);
     }
     
     catch(ArithmeticException ex){
         System.out.println(ex);
     }
     catch(InputMismatchException ex1){
         System.out.println(ex1);
     }
}
}


