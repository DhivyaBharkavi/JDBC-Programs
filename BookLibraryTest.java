package exercise7aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BookLibraryTest {

	public static void main(String[] args) {
		int book_id;
		String book_name, author_name, branch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter book id");
		book_id = scan.nextInt();
		System.out.println("Enter book name");
		book_name = scan.next();
		System.out.println("Enter author name");
		author_name = scan.next();
		System.out.println("Enter branch name");
		branch = scan.next();
		BookLibrary bl = new BookLibrary();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root","");
			Statement s=con.createStatement();
			int status=bl.insertDetails(s, book_id, book_name, author_name, branch);
			if(status!=-1)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Failes");
			}
			System.out.println("~~~~~~~~~~~~");
			
			ResultSet rs=bl.displayDetails(s);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getString(3) + " ");
				System.out.println(rs.getString(4) + " ");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
