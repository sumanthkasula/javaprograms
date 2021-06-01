package jdbcPrograms;
import java.sql.*;
import java.util.*;
public class preparedstatment_Eg 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/localdatabase","root","root");
	PreparedStatement stm = con.prepareStatement("select * from employee where dno=?");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter dept no");
	int a= sc.nextInt();
	stm.setInt(1, a);
	ResultSet rs1= stm.executeQuery();
	while(rs1.next())  {
		System.out.println(rs1.getInt("eid")+"  "+rs1.getString("sname")+" "+rs1.getInt("dno")); 
	}
	con.close(); 
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
