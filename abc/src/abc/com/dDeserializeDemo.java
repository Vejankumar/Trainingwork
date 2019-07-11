package abc.com;

import java.io.*;


public class dDeserializeDemo {
	
	public static void main(String args[])
	{
		try
		{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"));
			Person p = (Person)ois.readObject();
			ois.close();
			
			System.out.println("Name : "+p.name);
			System.out.println("Age : "+p.age);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
