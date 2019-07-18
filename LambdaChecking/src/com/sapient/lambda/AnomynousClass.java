package com.sapient.lambda;

interface I
{
	public void abc();
}


public class AnomynousClass 
{
	public static void main (String [] args)
	{
		I i1 = new I()
		{
			public void abc()
			{
				System.out.println("From inner anomynous class");
			}
		};
		i1.abc();
	}

}