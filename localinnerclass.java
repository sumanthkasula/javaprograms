package lambaexpressions;
class outer1{
	public void display() {
		class inner{
			public void innerdispaly() {
				System.out.println("hello iam inner class")	;
				}
		}
		inner i= new inner();
		i.innerdispaly();
		System.out.println("hello iam outer class")	;
	}
}
public class localinnerclass {

	public static void main(String[] args) {
		outer1 o =new outer1();
		o.display();
		
	}
}
