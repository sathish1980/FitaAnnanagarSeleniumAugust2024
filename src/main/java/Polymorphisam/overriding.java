package Polymorphisam;

public class overriding extends overloading{
	
	@Override
	public void add(int z, int x)
	{
		System.out.println("overriding");
		int c=z-x;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding op = new overriding();
		op.add(2, 3);
		
	}

}
