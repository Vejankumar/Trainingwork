package com.sapient;

import java.io.*;

public class IODemo {

	public static void main(String[] args) {
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter file name :");
			String fname = br.readLine();
			
			File f = new File(fname);
			if(f.exists())
			{
				
			}
			else
				System.out.println("File not exists");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
