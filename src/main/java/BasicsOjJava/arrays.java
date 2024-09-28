package BasicsOjJava;

public class arrays {
	
	int[] amount = {100,200,300,400,500,600,700,800,900}; // static array
	
	int[] age = new int[5];
	public void printAmounts()
	{
		System.out.println(amount.length);
		System.out.println(amount[amount.length-1]);
		for(int i=0;i<amount.length;i++)
		{
		System.out.println(amount[i]);
		}
		
		
		
		age[0]=3;
		age[1]=5;
		age[2]=7;
		age[6]=10;
		for(int eachvaalu : age)
		{
			System.out.println(eachvaalu);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrays a= new arrays();
		a.printAmounts();
	}
}
