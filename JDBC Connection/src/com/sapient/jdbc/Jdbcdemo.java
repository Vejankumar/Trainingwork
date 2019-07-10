package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbcdemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","Sapient123");
			/*//Statement stmt = con.createStatement();
			//stmt.executeUpdate("insert into EMP values('Jitendra',21)");
			//stmt.executeUpdate("delete from emp where Age<30");
			//stmt.executeUpdate("insert into EMP values ('Rahul' , 35)");
			//stmt.executeUpdate(" insert into EMP values ('Ramesh' , 45)");
			ResultSet rs = stmt.executeQuery("Select * from emp");
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(1));
				System.out.println("Age: "+rs.getInt(2));
				System.out.println();
			}
			rs.close();
			stmt.close();*/
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
