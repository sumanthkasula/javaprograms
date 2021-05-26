import java.util.Scanner;
interface eg{
	void add(int x, int y);
	void sub();
}
 class abc implements eg{
	int a;
	int b;
	public void sub() {};
	public void add(int a, int b) {
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println(c);
	}
}
public class interfaceeg {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int a=sc.nextInt();
		int b=sc.nextInt();
		abc z = new abc();
		z.add(a, b);	

	}

}
