package lambaexpressions;

class Outer2{
	static int a=10;
	int b=20;
	static class Inner{
		public void display() {
			System.out.println("iam static inner class");
		}
		
	}
}
public class staticinnerclass {

	public static void main(String[] args) {
	Outer2.Inner o = new Outer2.Inner();
	o.display();
	}

}
