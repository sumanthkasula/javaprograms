package lambaexpressions;
interface lambda{
	public int add(int a, int b);
}
public class parameter_lamda_expression {
		public static void main(String args[]) {
			lambda l=(a,b)->{
				return a+b;
			};
			System.out.println("the sum of two numbers"+l.add(20, 30));
		}
}
