package exercise13aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class FashionDAOimplTest {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redingtondb", "root","");
		PreparedStatement ps=con.prepareStatement("INSERT INTO fashion_mart VALUES(?,?,?,?)");
		ps.setString(1, "Earring");
		ps.setInt(2, 35);
		ps.setString(3, "Ring");
		ps.setInt(4, 20);
		int rs=ps.executeUpdate();
		if(rs!=-1)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Failed");
		}
		
		PreparedStatement ps1=con.prepareStatement("SELECT * FROM fashion_mart ");
		ResultSet r=ps1.executeQuery();
		while(r.next())
		{
			System.out.print(r.getString(1)+" ");
			System.out.print(r.getInt(2)+" ");
			System.out.print(r.getString(3)+" ");
			System.out.println(r.getInt(4)+" ");
		}
		//ArrayList list=new ArrayList();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
