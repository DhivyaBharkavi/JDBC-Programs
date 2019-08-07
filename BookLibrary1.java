package exercise7aug19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookLibrary1 {
		public int insertDetails(Statement s,Book b) throws SQLException
		{
			int status =s.executeUpdate("INSERT INTO book_library_new VALUES(" + b.getbId() + ",'" + b.getbName() + "','"
						+ b.getAuName() + "','" + b.getBrName()+ "')");
			return status;			
		}	
		public ArrayList displayDetails(Statement s) throws SQLException
		{
			ArrayList list=new ArrayList();
			ResultSet rs=s.executeQuery("SELECT * from book_library_new");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				
				int bNo=rs.getInt(1);
				String bName=rs.getString(2);
				String aName=rs.getString(3);
				String branchName=rs.getString(4);
				Book b=new Book(bNo,bName,aName,branchName);
				list.add(b);
			}
			return list;
		}
		/*public ResultSet displayDetails(Statement s) throws SQLException
		{
			ResultSet rs=s.executeQuery("SELECT * from book_library_new");
			return rs;
		}	*/	
}
