package static_and_final;
class test{
	static int price=10; //static members
	int a,b; //non static members
	static void display()
	{
	 System.out.println(price);
	}
}
public class StaticExample {

	public static void main(String[] args) {
		test.display();//without object just class name
		test t1=new test();
		t1.display();// with object
	}

}