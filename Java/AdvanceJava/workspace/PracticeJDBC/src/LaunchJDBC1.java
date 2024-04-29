
import java.sql.*;
public class LaunchJDBC1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		//load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish the connection
		String url="jdbc:mysql://localhost:3306/teluskodb";
		String userName="root";
		String password="root";
		Connection connect=DriverManager.getConnection(url,userName,password);
		
		//Create the statement
		Statement stmt=connect.createStatement();
		
		//Execute the query
		String query="SELECT * FROM studentdetail";
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
	
		rs.close();
		stmt.close();
		connect.close();
	}

}
