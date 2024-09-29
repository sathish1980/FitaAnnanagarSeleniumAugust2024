package Threadsconcepts;

public class Threadconcepts2 implements Runnable{
	
	
	public void run()
	{
		
		add();
		reverse();
	}
	
	 void add()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		System.out.println(i);
		}
	}
	
	 void reverse()
	{
		
		System.out.println("Reverse begin");
		for(int i=5;i>0;i--)
		{
		System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadconcepts2 T = new Threadconcepts2();
		Thread Tr = new Thread(T);
		Tr.start();
		System.out.println(Tr.getName());
		Tr.setName("First Thread");
		Threadconcepts2 T1 = new Threadconcepts2();
		Thread Tr1 = new Thread(T1);
		Tr1.start();
		System.out.println(Tr1.getName());
	}

}
