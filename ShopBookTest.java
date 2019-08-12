package exercise12aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class ShopBookTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter book no");
		int bNo=scan.nextInt();
		System.out.println("Enter book name");
		String bName=scan.next();
		System.out.println("Enter author name");
		String aName=scan.next();
		System.out.println("Enter branch");
		String branch=scan.next();
		System.out.println("Enter status");
		String status=scan.next();
		System.out.println("Enter book price");
		int price=scan.nextInt();
		try {
			ShopBook sb=new ShopBook();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redington_db", "root","");
			Statement s=con.createStatement();
			Book b=new Book(bNo,bName,aName,branch,status,price);	
			int statu=sb.insertBook(s, b); 
			if(statu!=-1)
			{
				System.out.println("Inserted");
			}
			else
			{
				System.out.println("Not inserted");	
			}
			System.out.println("~~~~~~~~~~~~~~");
			System.out.println("Book Shop");
			System.out.println("~~~~~~~~~~~~~~~~~");
			ArrayList list=sb.displayBook(s);
			for(int i=0;i<list.size();i++)
			{
				Book b1=(Book) list.get(i);
				System.out.print(b1.getBookNo()+" ");
				System.out.print(b1.getBookName()+" ");
				System.out.print(b1.getAuthorName()+" ");
				System.out.print(b1.getBranch()+" ");
				System.out.print(b1.getStatus()+" ");
				System.out.println(b1.getPrice()+" ");
			}
			
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.println("Find Book Status");
			System.out.println("~~~~~~~~~~~~~~~~");
			String ss=scan.next();
			ResultSet rs=sb.findstatus(s, ss);
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.println(rs.getString(4)+" ");
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
