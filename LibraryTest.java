package com.redington.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		System.out.println("\tWelcome to TamilNadu Library");
		System.out.println("==============================");
		Library lb=new Library();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gridb", "root", "");
			Statement sts = con.createStatement();
			System.out.println("\tBOOK DETAILS");
			int status=lb.insertBookDetails(con,sts);
			if (status != -1) {
				System.out.println("Book Details Inserted Successful");
			} else {
				System.out.println("Insertion Failed");
			}
			
			ResultSet rs=lb.displayBookDetails(con,sts);
			System.out.println("\tAVAILABLE BOOKS");
			System.out.println("BOOK NAME\t AUTHOR NAME");
			while (rs.next()) {
				System.out.print(rs.getString(1) + " ");
				System.out.println(rs.getString(2)+ " ");
			}
			System.out.print("Enter Book Name to Find\t:");
			Scanner scan=new Scanner(System.in);
			String s=scan.next();
			ResultSet re=lb.displayDetails1(con, sts, s);
			while (re.next()) {
				System.out.println(re.getString(1) + " ");
				//System.out.println(re.getString(2)+ " ");
			}
			System.out.print("Enter Author Name to Find\t:");
			String ss=scan.next();
			ResultSet rss=lb.displayDetails2(con, sts, ss);
			while (rss.next()) {
				System.out.println(rss.getString(1) + " ");
				//System.out.println(rss.getString(2)+ " ");
			}
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	
	}

}
