
import java.sql.*;
public class LaunchJDBC2 {

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
		String query1="INSERT INTO studentdetail(id,name,age,gender)"
				+ "VALUES(2,'Tamim',16,'Male') ";
		String query3="DELETE FROM studentdetail where id=2";
		String query4="UPDATE studentdetail set name='Nargis' where id=1";
		String query2="SELECT * FROM studentdetail";
		
		int rowAffected=stmt.executeUpdate(query4);
		if(rowAffected!=0)
			//System.out.println("successfully inserted!! row affected: "+rowAffected);
			//System.out.println("successfully deleted!! row affected: "+rowAffected);
			System.out.println("successfully updated!! row affected: "+rowAffected);
		else
			//System.out.println("failed to insert!! row affected: "+rowAffected);
			//System.out.println("failed to delete!! row affected: "+rowAffected);
			System.out.println("failed to update!! row affected: "+rowAffected);
		
		ResultSet rs=stmt.executeQuery(query2);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
		}
		rs.close();
		stmt.close();
		connect.close();
	}

}
