package com.redington.java.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Library {

	public int insertBookDetails(Connection con, Statement sts) throws SQLException {
		Scanner scan = new Scanner(System.in);
		  System.out.print("Enter the Book No      \t: "); 
		  int bNo = scan.nextInt();
		  
		  System.out.print("Enter Book Name        \t: "); 
		  String bkName = scan.next();
		 
		  System.out.print("Enter BookAuthor Name  \t: "); 
		  String arName =scan.next();
		  
		  System.out.print("Enter Publication Name \t: "); 
		  String pubName =scan.next();
		  
		  System.out.print("Enter Price of the book\t: "); 
		  float price = scan.nextFloat();

		int status = sts.executeUpdate("INSERT INTO student_library VALUES ("+bNo+",'"+bkName+"','"+arName+"','"+pubName+"',"+price+")");
		return status;	
	}

	public ResultSet displayBookDetails(Connection con, Statement sts) throws SQLException {
		ResultSet rs = sts.executeQuery("SELECT bookname,authorName FROM student_library");
		return rs;
		
	}
	public ResultSet displayDetails1(Connection con, Statement sts,String s) throws SQLException {
		ResultSet res = sts.executeQuery("SELECT authorName FROM student_library WHERE bookname='"+s+"'");
		return res;
	}

	public ResultSet displayDetails2(Connection con, Statement sts, String ss) throws SQLException {
		ResultSet rss = sts.executeQuery("SELECT bookname FROM student_library WHERE authorname='"+ss+"'");

		return rss;
	}

}
