package exception_multithreading_collections;
import java.util.*;
class student{
	int rollno;
	String Sname;
	int age;
	  
	public student(int rollno, String Sname, int age) {
		this.rollno=rollno;
		this.Sname=Sname;
		this.age=age;
	}
}
class agecomparator implements Comparator<student>{
	public int compare(student s1, student s2) {
		if(s1.age>s2.age)
			return 1;
		else if(s1.age<s2.age)
			return -1;
		else
			return 0;
	}
}
class namecomparator implements Comparator<student>{
	public int compare(student s1, student s2) {
		return s1.Sname.compareTo(s2.Sname);
	}
}
public class comparator_eg {

	public static void main(String[] args) {
		ArrayList<student> ar = new ArrayList<>();
		ar.add(new student(1,"sumanth",39));
		ar.add(new student(2,"vikranth",25));
		ar.add(new student(3,"babu",29));
		
		//normal printing of data
		for(student st: ar){  
			System.out.println(st.rollno+" "+st.Sname+" "+st.age);  
			}
		//sort by name (namecomparator)
		Collections.sort(ar, new namecomparator());
		for(student st: ar){  
			System.out.println(st.rollno+" "+st.Sname+" "+st.age);  
			}
		//sort by name (agecomparator)
		Collections.sort(ar, new agecomparator());
		for(student st: ar){  
			System.out.println(st.rollno+" "+st.Sname+" "+st.age);  
			}
	}

}
