package Threadsconcepts;

public class Threadconcepts1 extends Thread{
	
	
	public void run()
	{
		
		add();
		reverse();
	}
	
	public void add()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
		}
	}
	
	public void reverse()
	{
		
		System.out.println("Reverse begin");
		for(int i=5;i>0;i--)
		{
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadconcepts1 T = new Threadconcepts1();
		T.start();
		System.out.println(T.getName());
		Threadconcepts1 T1 = new Threadconcepts1();
		T1.start();
		System.out.println(T1.getName());
	}

}
