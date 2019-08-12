package exercise12aug19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAOimplTest {

	public static void main(String[] args) throws SQLException {
		Scanner scan=new Scanner(System.in);
		StudentDAOimpl sd=new StudentDAOimpl();
		Student ss = new Student();
		Statement s=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/redingtondb", "root","");
			s=con.createStatement();
			
			boolean b=true;
			while(b)
			{
			System.out.println("1.Press 1 Insert Student Details");
			System.out.println("2.Press 2 Display Student Details");
			System.out.println("3.Press 3 Display particular Student Record");
			System.out.println("4.Press 4 Update particular Student Records");
			System.out.println("5.Press 5 Delete particular Student Records");
			System.out.println("Select choice");
			int choice=scan.nextInt();
			
			if(choice==1)
			{
				sd.insertDetails1();
				int status =sd.insertDetails(s, ss);
				if(status!=-1)
				{
					System.out.println("Inserted Successfully");
				}
				else
				{
					System.out.println("Not inserted");
				}
				System.out.println("~~~~~~~~~~~~~~~~~~~");
			}
			if(choice==2)
			{
				System.out.println("Display Student Details");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
				ArrayList al=sd.displayAllStudents(s);
				for(int i=0;i<al.size();i++)
				{
					Student s1=(Student) al.get(i);
					System.out.print(s1.getRegNo()+" ");
					System.out.print(s1.getName()+" ");
					System.out.print(s1.getAddress()+" ");
					System.out.print(s1.getGender()+" ");
					System.out.print(s1.getDob()+" ");
					System.out.print(s1.getMailId()+" ");
					System.out.print(s1.getQualifiUG()+" ");
					System.out.print(s1.getQualifiPG()+" ");
					System.out.print(s1.getCourseName()+" ");
					System.out.print(s1.getMobNo()+" ");
					System.out.print(s1.getYearOfPassing()+" ");
					System.out.println(s1.getDateOfJoining()+" ");
				}
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			}
			if(choice==3)
			{
				System.out.println("Display particular details");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
				int r=scan.nextInt();
				//Student s2=sd.displayStudentregNo(s, r);
				ResultSet rs=sd.displayStudentregNo(s, r);
				while(rs.next())
				{
				System.out.print(rs.getInt(1)+" ");
				System.out.print(rs.getString(2)+" ");
				System.out.print(rs.getString(3)+" ");
				System.out.print(rs.getString(4)+" ");
				System.out.print(rs.getString(5)+" ");
				System.out.print(rs.getString(6)+" ");
				System.out.print(rs.getString(7)+" ");
				System.out.print(rs.getString(8)+" ");
				System.out.print(rs.getString(9)+" ");
				System.out.print(rs.getLong(10)+" ");
				System.out.print(rs.getInt(11)+" ");
				System.out.println(rs.getString(12)+" ");
				}
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			if(choice==4)
			{
				System.out.println("Enter Date of birth");
				String dob=scan.next();
				System.out.println("Change student name");
				String name=scan.next();
				int result=sd.updateStudentregNo(s, name, dob);
				System.out.println(result);
			}
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
