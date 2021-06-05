package lambaexpressions;

interface mylamda{
	public void display();
}

class uselamda{
	public void callamda(mylamda l) {
		l.display();
	}
}
class demo{
	public void method1() {
		uselamda ul=new uselamda();
		ul.callamda(()->{
		System.out.println("Hello World!!!");
		});
	}
}
public class lamdamethod_as_parameter {
	
	public static void main(String[] args) {
		demo d= new demo();
		d.method1();
	}
}
