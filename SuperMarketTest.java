package exercise4aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SuperMarketTest {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		SuperMarket sm = new SuperMarket();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redington_db","root","");
			Statement s=con.createStatement();
			int check=sm.insertDetails(con, s);
			if(check!=-1)
			{
				System.out.println("Product Details inserted");
			}
			else
			{
				System.out.println("Not inserted");
			}
			ResultSet rs=sm.displayDetails(con,s);
			System.out.println("Product and price details");
			System.out.println("=========================");
			int total = 0;
			while(rs.next())
			{
				System.out.print(rs.getString(1)+" ");
				System.out.print(rs.getInt(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.println(rs.getInt(4)+" ");
				total=rs.getInt(2)+rs.getInt(4);
			}
			System.out.println("Bill payment");
			System.out.println("============");
			System.out.println("Bill is "+total);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
