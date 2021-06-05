package lambaexpressions;

interface mylamda1{
	public void display();
}
public class lamda_restrictions {
static int b=10;
	public static void main(String[] args) {
		int a=10;
			mylambda l=()->{
				System.out.println(++b);//b should incremnet as it out side lamda method
				//System.out.println(++a);//it should throw compliation error as it should be final or effectiely final
			};
			l.display();
			
		}
	}