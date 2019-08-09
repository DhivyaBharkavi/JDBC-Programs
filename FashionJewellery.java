package redington.exercise.aug10.JDBC09;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class FashionJewellery {
public int insertFashionDetails(Statement s,FashionMart f) throws SQLException
{
	int status=s.executeUpdate("INSERT INTO fashion_jewellery VALUES ("+f.getBillno()+",'"+f.getEarrings()+"','"+f.getEarringsp()+"','"
	+f.getBangles()+"',"+f.getBanglesp()+",'"+f.getRings()+"',"+f.getRingsp()+",'"+f.getAnkelet()+"',"+f.getAnkeletp()+")");
	return status;
}
public ArrayList display(Statement s) throws SQLException
{
	ArrayList list = new ArrayList();
	ResultSet rs=s.executeQuery("SELECT * from fashion_jewellery");
	while(rs.next())
	{
		System.out.print(rs.getInt(1)+" ");
		System.out.print(rs.getString(2)+" ");
		System.out.print(rs.getInt(3)+" ");
		System.out.print(rs.getString(4)+" ");
		System.out.print(rs.getInt(5)+" ");
		System.out.print(rs.getString(6)+" ");
		System.out.print(rs.getInt(7)+" ");
		System.out.print(rs.getString(8)+" ");
		System.out.println(rs.getInt(9)+" ");
		
		int billno=rs.getInt(1);
		String earrings=rs.getString(2);
		int erp=rs.getInt(3);
		String bangles =rs.getString(4);
		int bp=rs.getInt(5);
		String rings =rs.getString(6);
		int rp=rs.getInt(7);
		String ankelet =rs.getString(8);
		int ap=rs.getInt(9);
		FashionMart fm=new FashionMart(billno,earrings,erp,bangles,bp,rings,rp,ankelet,ap);
		list.add(fm);
	}
	return list;
}
public ResultSet order(Statement s,String ss) throws SQLException
{
	//ArrayList list = new ArrayList();
	ResultSet rs=s.executeQuery("SELECT * from fashion_jewellery WHERE earrings='"+ss+"'");
	return rs;
}
}
