package BasicsOjJava;

public class loops {
	
	
	public void print10number()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}

	
	public void forloop()
	{
		for(int a=0;a<10;a++)
		{
			
			if(a==5 || a==9)
			{
				//break;
				continue;
			}
			System.out.println(a);
			a+=1;
		}
		
		
		for(int a=9;a>0;a--)
		{
			System.out.println(a);
		}
		
		int a=10;
		while(a<10)
		{
			System.out.println(a);
			a+=1;
		}
		
		do
		{
			System.out.println("do while");
			System.out.println(a);
		}
		while(a<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops L = new loops();
		L.forloop();
	}

}
