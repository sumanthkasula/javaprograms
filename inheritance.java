import java.util.Scanner;

class parent{
	int a, b;
	void sum(int a, int b) {
		this.a=a;
		this.b=b;
		int c = a+b;
		System.out.println("the sum of numbers "+c);
	}
}
class child extends parent{
	int a,b;
	void sub(int a, int b){
		this.a=a;
		this.b=b;
		int c = a-b;
		System.out.println("the diff of numbers "+c);
}
}
public  class inheritance {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			int x,y;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter");
			x=sc.nextInt();
			y=sc.nextInt();
			child c = new child();
			c.sub(x, y);
			c.sum(x, y);
	}

}
