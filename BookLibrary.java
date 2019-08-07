package exercise7aug19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookLibrary {
	public int insertDetails(Statement s,int bId,String bName,String aName,String brName) throws SQLException
	{
		int status =s.executeUpdate("INSERT INTO book_library VALUES(" + bId + ",'" + bName + "','"
					+ aName + "','" + brName+ "')");
		return status;			
	}
	public ResultSet displayDetails(Statement s) throws SQLException
	{
		ResultSet rs=s.executeQuery("SELECT * from book_library");
		return rs;
	}
} 
