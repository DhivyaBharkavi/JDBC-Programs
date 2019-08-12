package exercise12aug19;

import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAOimpl implements StudentDAO {
	Scanner scan=new Scanner(System.in);
	int rNo,yop;
	long mNo;
	String sname,add,gender,dob,ug,pg,mailId,doj,cname;
	public void connection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redingtondb", "root","");
			Statement s=con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertDetails1()  {
		System.out.println("Enter student number");
		rNo=scan.nextInt();
		System.out.println("Enter student name");
		sname=scan.next();
		System.out.println("Enter address");
		add=scan.next();
		System.out.println("Enter gender");
		gender=scan.next();
		System.out.println("Enter date of birth");
		dob=scan.next();
		System.out.println("Enter mail id");
		mailId=scan.next();
		System.out.println("Enter qualification U.G");
		ug=scan.next();
		System.out.println("Enter qualification P.G");
		pg=scan.next();
		System.out.println("Enter course name");
		cname=scan.next();
		System.out.println("Enter year of passing");
		yop=scan.nextInt();
		System.out.println("Enter date of joining");
		doj=scan.next();
		System.out.println("Enter mobile number");
		mNo =scan.nextLong();
	}
		public int insertDetails(Statement s,Student ss)throws SQLException{
			 ss=new Student(rNo,sname,add,gender,dob,mailId,ug,pg,cname,mNo,yop,doj);
		int status=s.executeUpdate("INSERT INTO redington_students VALUES ("+ss.getRegNo()+",'"
				+ss.getName()+"','"+ss.getAddress()+"','"+ss.getGender()+"','"+ss.getDob()+"','"
				+ss.getMailId()+"','"+ss.getQualifiUG()+"','"+ss.getQualifiPG()+"','"+ss.getCourseName()+"',"+ss.getMobNo()+","
				+ss.getYearOfPassing()+",'"+ss.getDateOfJoining()+"')");
		return status;
		
	}


	public ArrayList displayAllStudents(Statement s) {
		
		ResultSet rs=null;
		ArrayList list=new ArrayList();
		try {
			rs=s.executeQuery("SELECT * from redington_students" );
			while(rs.next())
			{
				int sno=rs.getInt(1);
				String sname=rs.getString(2);
				String add=rs.getString(3);
				String gender=rs.getString(4);
				String dob=rs.getString(5);
				String mid=rs.getString(6);
				String qug=rs.getString(7);
				String qpg=rs.getString(8);
				String cname=rs.getString(9);
				Long mNo=rs.getLong(10);
				int yop=rs.getInt(11);
				String doj=rs.getString(12);
				Student ss =new Student(sno,sname,add,gender,dob,mid,qug,qpg,cname,mNo,yop,doj);
				list.add(ss);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	
	public ResultSet displayStudentregNo(Statement s, int r) throws SQLException {
		ResultSet rs=s.executeQuery("SELECT * from redington_students WHERE reg_no='"+r+"'");
		return rs;
	}


	public int updateStudentregNo(Statement s, String name,String dob) throws SQLException {
		int rs=s.executeUpdate("UPDATE redington_students SET name='"+name+"'WHERE dob ='"+dob+"'");
		return rs;
	}

	
	public int deleteStudentregNo(Statement s, int r) throws SQLException {
		int rs=s.executeUpdate("DELETE from redington_students WHERE regno='"+r+"'") ;
		return rs;
	}

	
	/*public Student displayStudentregNo(Statement s,int r) throws SQLException {
		ResultSet rs=s.executeQuery("SELECT * from redington_students WHERE reg_no='"+r+"'");
		return null;*/
		
	
	
	

}
