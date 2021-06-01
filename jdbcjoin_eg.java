package jdbcPrograms;
import java.sql.*;
public class jdbcjoin_eg {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/localdatabase","root","root"); 
		Statement st = con.createStatement();
		int  query1 = st.executeUpdate("insert into employee"+" values "+"(6,'neelima',3)");
		ResultSet rs1 = st.executeQuery("select * from department d, employee e where e.dno= d.deptno");
		while(rs1.next())  
			System.out.println(rs1.getInt("e.eid")+"  "+rs1.getString("e.sname")+" "+rs1.getInt("e.dno")+"  "+rs1.getString("d.dname"));  
			con.close(); 
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
