package com.sapient.thread;


class A extends Thread
{
	public void run()
	{
		System.out.println("Hahaha  "+Thread.currentThread());
		for(int i=0;i<20;i++)
		{
			System.out.println("i :"+i);
		
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("j :"+i);
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}

class C extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("k :"+i);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	}
}


public class ThreadDemo {
	
	public static void main(String args[]) throws Exception
	{
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.start();
		b.start();
		c.start();
		
		a.setName("Raju");
		a.setPriority(8);
		
		Thread m1 = Thread.currentThread();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m1);
		System.out.println("Main exit");
	}

}
