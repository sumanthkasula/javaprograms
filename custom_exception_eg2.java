package exception_multithreading_collections;
class invalidageexception extends Exception{
	public invalidageexception(String s) {
		super(s);
	}
}
class ageform{
	public void ages(int age) throws invalidageexception // failed of write "throws" leads to misshandled exception error
	{
		if (age < 18) {
			throw new invalidageexception("age should be atleast 18");
		}
	}
}
public class custom_exception_eg2 {
	public static void main(String args[]) {
		ageform a =new ageform();
		try {
			a.ages(16);
		}
		catch(Exception ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
	}

}
