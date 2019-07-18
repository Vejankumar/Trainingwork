package com.sapient.lambda;

interface I1
{
	public void abc();
}

interface J
{
	public void xyz(String msg);
}

public class LambdaDemo {
	
	public static void main (String [] args)
	{
		I1 i1 = ()->System.out.println("From Lambda Function");
		i1.abc();
		
		String msg1="Hello";
		J j = (msg)->System.out.println("Got "+msg);
		j.xyz(msg1);
	}
}
