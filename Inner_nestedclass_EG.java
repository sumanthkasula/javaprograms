package lambaexpressions;

class outer{
	int x=10;
	class inner{
		int y =20;
		public void innerdisplay() {
			System.out.println("X:"+x+"Y:"+y);
		}
	}
	public void outerdisplay() {
		inner i =new inner();
		i.innerdisplay();
		System.out.println(i.y);
	}
}
public class Inner_nestedclass_EG {

	public static void main(String[] args) {
		outer o= new outer();
		o.outerdisplay();

	}

}
