package Polymorphisam;

public class overloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println(c);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading O = new overloading();
		O.add(3.6,5);
	}

}
