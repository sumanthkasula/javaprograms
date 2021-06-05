package lambaexpressions;
@FunctionalInterface
interface mylambda{
	public void display();
}
public class lambdaexpression_EG {

	public static void main(String[] args) {
		mylambda m=()->{
			System.out.println("lamba expression executed successfully with addition");
			};
		m.display();
	}

}
