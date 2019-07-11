package abc.com;

import java.io.RandomAccessFile;

public class IODemo2 {

	public static void main(String[] args) {
		
		try
		{
			RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");
			raf.seek(raf.length());
			raf.writeBytes("Greet");
			raf.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
