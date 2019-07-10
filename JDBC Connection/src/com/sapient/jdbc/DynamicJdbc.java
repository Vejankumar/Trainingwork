package com.sapient.jdbc;

import java.sql.*;

import java.util.Scanner;




public class DynamicJdbc {

public static void main(String[] args) {
		
		try
		{
			Scanner kb = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Sapient123");
			PreparedStatement pstmt= con.prepareStatement("Insert into emp values(?,?)");
			System.out.println("Enter Name : ");
			String name = kb.next();
			System.out.println("Enter Age : ");
			int age = kb.nextInt();
			pstmt.setString(1,name);
			pstmt.setInt(2,age);
			pstmt.execute();
			pstmt.close();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
