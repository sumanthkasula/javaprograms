package jdbcPrograms;
import java.sql.*;
import java.util.*;
public class FstJDBCprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/localdatabase","root","root");  
			//here localdatabase is database name, root is username and password 
			ArrayList<String> Al = new ArrayList<>();
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from sumanth"); 
			while(rs.next()) 
			System.out.println(rs.getInt("emp_id")+"  "+rs.getString("emp_name"));  
			con.close();  
			}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		} 		
	}



