package abc.com;

import java.io.*;

public class IODemo3 {

	public static void main(String[] args) {
		try
		{
			/*PrintWriter pw = new PrintWriter(new FileOutputStream("abc.txt",true));
			pw.print("Hello Everybody");
			pw.flush();
			pw.close();*/
			
			File dir1 = new File("abc");
			dir1.mkdir();
			File dir2 = new File(dir1,"xyz");
			dir2.mkdir();
			File f = new File(dir2,"atoz");
			f.createNewFile();
			
			PrintWriter pw = new PrintWriter(new FileOutputStream(f,true));
			pw.print("Created using program...");
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
