package BasicsOjJava;

public class variableconcepts {
	
	/*
	 * accessmodifier datatype variablename = value;
	 */
	
	public static int age=50;
	public void GetAge()
	{
		int age=30;// local variable
		System.out.println("My age is : "+age);
	}
	
	public void GetAge1()
	{
		//int age=35;// local variable
		System.out.println("My age is : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variableconcepts V = new variableconcepts();
		V.GetAge();
		V.GetAge1();
	}

}
