package exercise5aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BooksLibrary {
	int book_id;
	String book_name,author_name,branch;
	Scanner scan=new Scanner(System.in);
	ResultSet rs,rt;
	Statement s;
	public void connection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","");
			s=con.createStatement();
			rs=s.executeQuery("SELECT * from book_library");
			System.out.println("Display the records");
			System.out.println("====================");
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.println(rs.getString(4)+" ");
				
				book_id=rs.getInt(1);
				book_name=rs.getString(2);
				author_name=rs.getString(3);
				branch=rs.getString(4);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insert() throws SQLException
	{
		//connection();	
		boolean b =true;
		while(b)
		{
		System.out.println("Enter book id");
		book_id=scan.nextInt();
		System.out.println("Enter book name");
		book_name=scan.next();
		System.out.println("Enter author name");
		author_name=scan.next();
		System.out.println("Enter branch name");
		branch=scan.next();
		System.out.println("Do uou want to continue (y/n)");
		char c=scan.next().charAt(0);
		if(c=='n')
		{
			b=false;
			//System.out.println("Inserted");
		}
		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","");
			s=con.createStatement();
int status=s.executeUpdate("INSERT INTO book_library VALUES("+book_id+",'"+book_name+"','"+author_name+"','"+branch+"')");
		if(status!=-1)
		{
			System.out.println("Inserted Successfully");
		}
		else
		{
			System.out.println("Failed");
		}
	
		
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void select() throws SQLException
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","");
			s=con.createStatement();
		System.out.println("Find book name and author name ");
		System.out.println("==============================");
		//System.out.println("Book name "+book_name);
			rt=s.executeQuery("SELECT author_name from book_library WHERE book_name='"+book_name+"'");
			while(rt.next())
			{
				System.out.print(rt.getString(1)+" ");
				//System.out.println(rt.getString(2)+" ");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
