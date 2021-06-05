package static_and_final;
class eg{
	final int c;
	public eg() {
		c=10;// 3rd way of declaring
	}
	 final void display() {
		System.out.println("i should not be printed");
	}
}
public class final_eg {
public static void main(String args[]) {
	final int a=10; //fst way of declaring
	final int b;
	{
		b=10;//second way of declaring
	}//normal blocks
	System.out.println(++a);// should be throw an error
	eg e =new eg();
	eg.display();// should be throw an error
}
}
