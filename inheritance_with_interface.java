import java.util.Scanner;

interface a{
	void add(int a, int b);
}
interface b{
	void sub(int a, int b);
}

class inher implements a,b{
	int a;
	int b;
	@Override
	public void sub(int a, int b) {
		this.a=a;
		this.b=b;
		int c = a-b;
		System.out.println("the diff of numbers "+c);
	}

	@Override
	public void add(int a, int b) {
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println("the sum of numbers"+c);
	}
	
}
public class inheritance_with_interface {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		x=sc.nextInt();
		y=sc.nextInt();
		inher i = new inher();
		i.add(x, y);
		i.sub(x, y);		
	}

}
