package exercise4aug19;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarket {
	Scanner scan = new Scanner(System.in);
	private String prod1,prod2;
	private double price1,price2;
	ArrayList list = new ArrayList();
	public int insertDetails(Connection con,Statement s) throws SQLException
	{
		boolean b=true;
		while(b)
		{
		System.out.println("Enter product name1");
		prod1=scan.next();
		System.out.println("Enter price1");
		price1=scan.nextDouble();
		System.out.println("Enter product name2");
		prod2=scan.next();
		System.out.println("Enter price2 ");
		price2=scan.nextDouble();
	//	list.add(prod1, prod2);
		System.out.println("Do uou want to continue (y/n)");
		char c=scan.next().charAt(0);
		if(c=='n')
		{
			b=false;
		}
		}
int status=s.executeUpdate("INSERT INTO super_market VALUES ('"+prod1+"',"+price1+",'"+prod2+"',"+price2+")"); 
		return status;
	}
	public ResultSet displayDetails(Connection con,Statement s) throws SQLException
	{
		ResultSet rs=s.executeQuery("SELECT * from super_market");
		return rs;
	}
	public ResultSet calculate(Connection con,Statement s)
	{
		
	}
	
}