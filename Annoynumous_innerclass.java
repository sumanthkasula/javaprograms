package lambaexpressions;

interface abc{
	public void display();
}
class outerclass {
	public void outerdisplay(){
		abc a= new abc(){ //no class name is given, creating refrences of interface and calling as class
			public void display() {
				System.out.println("iam anonomous class");
			}
	};
	a.display();
	System.out.println("iam outer class");
}
}
public class Annoynumous_innerclass {

	public static void main(String[] args) {
	outerclass o = new outerclass();
	o.outerdisplay();

	}
}
