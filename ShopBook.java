package exercise12aug19;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ShopBook implements BookIn{


	public int insertBook(Statement s, Book b) throws SQLException {
		int status=s.executeUpdate("INSERT INTO shop_books VALUES ("+b.getBookNo()+",'"+b.getBookName()+"','"+b.getAuthorName()+"','"+b.getBranch()+"','"
				+b.getStatus()+"','"+b.getPrice()+"')");
		return status;
		
	}


	public ArrayList displayBook(Statement s) throws SQLException {
		ArrayList al=new ArrayList();
		ResultSet rs=s.executeQuery("SELECT * from shop_books");
		while(rs.next())
		{
			int bno=rs.getInt(1);
			String bname=rs.getString(2);
			String aname=rs.getString(3);
			String branch=rs.getString(4);
			String status=rs.getString(5);
			int price=rs.getInt(6);
			
			Book b=new Book(bno,bname,aname,branch,status,price);
			al.add(b); 
		}
		return al;
	}


	
	public ResultSet findstatus(Statement s,String ss) {
		ResultSet rs=null;
		try {
			rs = s.executeQuery("SELECT * from shop_books WHERE status ='"+ss+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return rs;
		
		
	}

}
