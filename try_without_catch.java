package arthematicoperations;

public class try_without_catch {
	public static void main(String args[]) {
	 try{  
		 int num=121/0;  
		 System.out.println(num);  
	      }  
	     catch(Exception e){
	         System.out.println(e);
	      }
	      finally{
		 System.out.println("This is finally block");
	      }  
	      System.out.println("Out of try-catch-finally");  
	   }
}

