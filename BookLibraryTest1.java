package exercise7aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class BookLibraryTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		BookLibrary1 bl = new BookLibrary1();
		//Book b = new Book(101,"Java","Gosling","IT");
		//Book b1=new Book();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redington_db", "root","");
			Statement s=con.createStatement();
			Book b = new Book(book_id,book_name,author_name,branch);
			int status=bl.insertDetails(s,b);
			if(status!=-1)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Failes");
			}
			System.out.println("~~~~~~~~~~~~");
			ArrayList al=bl.displayDetails(s);
			System.out.print(al);
			/*for(int i=0;i<al.size();i++)
			{
				Book b1=(Book) al.get(i);
				System.out.println(b.getbId()+" ");
				System.out.print(b.getbName()+" ");
				System.out.print(b.getAuName()+" ");
				System.out.println(b.getBrName());
			}*/
			/*ResultSet rs=bl.displayDetails(s);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2) + " ");
				System.out.print(rs.getString(3) + " ");
				System.out.println(rs.getString(4) + " ");
			}*/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


