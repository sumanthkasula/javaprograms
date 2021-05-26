abstract class calcu{
	public abstract void operation();
}
class sum extends calcu{
	public void operation() {
		System.out.println("this methods uses abstract class for addition");
	}
}
public class arthematic_abstract {

	public static void main(String[] args) {
		calcu s =new sum();
		s.operation();
	}

}
