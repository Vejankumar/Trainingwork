
import java.io.*;

class CheckException
{
	public void abc() throws IOException, ArithmeticException, UserException
	{
		int a=50;
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
			int res = a/(a-i);
			if(i==120)
				throw new IOException();
			if(i==15)
				throw new NullPointerException();
			if(i==100)
				return;
			if(i==8)
				throw new UserException("when i is 8");
			if(i==6)
				throw new UserException("when i is 6");
		}
	}

	public void xyz() throws IOException, ArithmeticException, UserException
	{
		abc();
	}
	public void atoz() throws IOException, ArithmeticException, UserException
	{
		xyz();
	}
}







public class ExceptionDemo
{
        public static void main(String arg[])
	{
		try
		{
			CheckException a1= new CheckException();
			a1.atoz();
		}
		catch(IOException e)
		{
			System.out.println("IO Exception handler....");
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception handler....");
		}
		catch(UserException e)
		{
			System.out.println("Custom Exception handler....");
			e.printStackTrace();
			e.display();
			System.out.println("Reason: "+ e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Default Exception handler....");
		}
		finally
		{
			System.out.println("THANKS");
		}
		System.out.println("Program continues....");
	}
}



class UserException extends Exception
{
	public UserException()
	{
	}
	public UserException(String s)
	{
		super(s);
	}
	public void display()
	{
		System.out.println("In user exception ");
	}
}