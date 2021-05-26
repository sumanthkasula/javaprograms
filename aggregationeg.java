class address{
	int sno;
	String sname;
	String city;
	String country;
	address(int sno,String sname,String city,String country){
		this.sno=sno;
		this.sname=sname;
		this.city=city;
		this.country=country;
	}
}

class student{
	int rno;
	String stname;
	address add;
	student(int rno, String stname, address add){
		this.rno=rno;
		this.stname=stname;
		this.add=add;
	}
}
public class aggregationeg {
	public static void main(String[] args) {
		address a =new address(55,"bhagathnager","cherial","india");
		student s= new student(12345,"sumanth",a);	
		System.out.println(s.rno);
		System.out.println(s.stname);
		System.out.println(s.add.sno);
		System.out.println(s.add.sname);
		System.out.println(s.add.city);
		System.out.println(s.add.country);
		
	}

}
