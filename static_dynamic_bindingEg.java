//static binding 
class parent1{
	public  static void sound() {
		System.out.println("iam a static method");
	}
}
class child1 extends parent1{
	public static void sound() {
		System.out.println("iam a static method and cannot be overridden");
	}
}
public class static_dynamic_bindingEg {
	public static void main(String[] args) {
		parent1 p = new parent1();
		parent1 q = new child1();
		p.sound();
		q.sound();
	}
}
//method overloading is perfect eg for dynamic binding 