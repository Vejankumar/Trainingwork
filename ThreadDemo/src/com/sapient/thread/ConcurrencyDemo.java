package com.sapient.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class Abc implements Runnable
{
	ReentrantLock rl = new ReentrantLock();
	public void run()
	{
		try {
			if(rl.tryLock(15,TimeUnit.SECONDS))
			{
				//rl.lock();
				for(int i=1;i<=20;i++)
				{
					System.out.println(Thread.currentThread().getName() +" :"+i);
					Thread.sleep(100);
				}
				rl.unlock();
			}
			else {
				System.out.println(Thread.currentThread().getName()+" is not gonna wait");
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

public class ConcurrencyDemo {
	
	public static void main(String [] args)
	{
		Abc a1 = new Abc();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);
		Thread t3 = new Thread(a1);
		
		t1.setName("a");
		t2.setName("b");
		t3.setName("c");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
