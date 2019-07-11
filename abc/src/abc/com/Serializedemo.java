package abc.com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializedemo {

	public static void main(String[] args) {
		try
		{
			Person p1 = new Person();
			p1.name = "Subhash";
			p1.age = 25;
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			oos.writeObject(p1);
			oos.close();
			
			System.out.println("Serialized Done......");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
