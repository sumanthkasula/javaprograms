package exception_multithreading_collections;

class SumanthException extends Exception{
	public SumanthException(String s) {
		super(s);
	}
}
class abc {
	void salary(int sal) throws SumanthException{
		if(sal>5000) 
		{
			throw new SumanthException("invalid salary");
		}
	}
}
public class custom_exception {
public static void main(String args[]) {
	abc a =new abc();
	try {
		a.salary(6000);
		}
	catch(Exception Ex) 
	{
		System.out.println("Exception caught");
		System.out.println(Ex.getMessage());
	}
}
}
