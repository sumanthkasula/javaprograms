package exception_multithreading_collections;
import java.util.*;
class point implements Comparable{
	int x;
	int y;
	public point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "X:"+x+"Y:"+y;
	}
	@Override
	public int compareTo(Object o) {
		point p=(point)o;
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x)
			return 1;
		else {
			if(this.y<p.y) 
			return -1;
			else if(this.y > p.y)
			return 1;
			else 
			return 0;
			}
	}
}
public class ComparableInterface_Eg {
	public static void main(String[] args) {
		TreeSet<point> ts = new TreeSet<>();
		ts.add(new point(1,1));
		ts.add(new point(5,5));
		ts.add(new point(5,1));
		System.out.println(ts);
		}

}
