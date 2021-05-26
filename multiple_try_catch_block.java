package arthematicoperations;

public class multiple_try_catch_block {

	public static void main(String[] args) {
		int a=50;
		int b=0;
		try {
			if(b>a) {
				
			}
				try {
					if(a/b==0);
				}
				catch(ArithmeticException e) {
					System.out.println("Arthematic exception"+e);
					System.out.println("handled by second try block");
			}
		}
				catch(Exception e) {
					System.out.println("exception"+e);
					System.out.println("handled by first try block");
				}		
	}
}
