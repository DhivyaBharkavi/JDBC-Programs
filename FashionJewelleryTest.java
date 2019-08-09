package redington.exercise.aug10.JDBC09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class FashionJewelleryTest {
	
	public static void main(String[] args) {
		int billno,banglesp,ringsp,earringsp,ankeletp;
		String bangles,rings,ankelet,earrings;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a bill no");
		billno=scan.nextInt();
		System.out.println("Enter a types of earrings ");
		earrings=scan.next();
		System.out.println("Price of earrings ");
		earringsp=scan.nextInt();
		System.out.println("Enter a types of bangles ");
		bangles=scan.next();
		System.out.println("Price of bangles ");
		banglesp=scan.nextInt();
		System.out.println("Enter a types of rings ");
		rings=scan.next();
		System.out.println("Price of rings ");
		ringsp=scan.nextInt();
		System.out.println("Enter a types of ankelet ");
		ankelet=scan.next();
		System.out.println("Price of ankelet ");
		ankeletp=scan.nextInt();
		FashionJewellery fj=new FashionJewellery();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redington_db", "root","");
		Statement s=con.createStatement();
		FashionMart fm=new FashionMart(billno,earrings,earringsp,bangles,banglesp,rings,ringsp,ankelet,ankeletp);
		
		int status=fj.insertFashionDetails(s, fm);
		if(status!=-1)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Not inserted");
		}
			System.out.println("=========");
			
		System.out.println("List of purchase in Fashion Mart");
		System.out.println("================================");	
		ArrayList purchase=fj.display(s);
		/*for(int i=0;i<purchase.size();i++)
		{
			FashionMart f=(FashionMart) purchase.get(i);
			System.out.print(f.getBillno()+" ");
			System.out.print(f.getEarrings()+" ");
			System.out.print(f.getEarringsp()+" ");
			System.out.print(f.getBangles()+" ");
			System.out.print(f.getBanglesp()+" ");
			System.out.print(f.getRings()+" ");
			System.out.print(f.getRingsp()+" ");
			System.out.print(f.getAnkelet()+" ");
			System.out.println(f.getAnkeletp()+" ");
			}*/
		System.out.println(purchase);
		
		System.out.println("Find Earrings ");
		System.out.println("=============");
		String ss=scan.next();
		ResultSet rs=fj.order(s, ss);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" ");
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
