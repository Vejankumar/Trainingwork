package com.sapient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

		
	public boolean loginCheck(String name,String password)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Sapient123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from login");
			while(rs.next())
			{
				String dname = rs.getString(1);
				String dpass = rs.getString(2);
				if(dname.equals(name) && dpass.equals(password))
					return true;
			}
			return false;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	public boolean RegisterCheck(String id,String password,int age,String occupation)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Sapient123");
			PreparedStatement pstmt= con.prepareStatement("Insert into login values(?,?,?,?)");
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			pstmt.setInt(3,age);
			pstmt.setString(4,occupation);
			pstmt.execute();
			pstmt.close();
			return true;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		return false;
		
	}

}
