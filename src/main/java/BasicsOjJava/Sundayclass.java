package BasicsOjJava;

public class Sundayclass {
	
	/*
	 * four types of methods
	 * 1.Method with out parameter /arguments
	 * 2.Methos with parameter /arguments
	 * 3.Method with out return type
	 * 4.Method with return type
	 */
	
	/*
	 * its kind of a method
	 * constructor name should be same as your class name
	 * constructor should not have any return type
	 * 2 type
	 * 1.constructor with out parameter /arguments
	 * 2.constructor with parameter /arguments
	 */
	
	public Sundayclass()
	{
		System.out.println("Hi sathish welcome to Sunday class");
	}
	
	
	public Sundayclass(String name, int age)
	{
		System.out.println("Hi "+name+ "welcome to Sunday class");
		System.out.println("You age is "+age);
	}
	
	// with out parameter and with out return type
	public void displayName()
	{
	System.out.println("Sathsih");
	}
	
	public void Invoice()
	{
		int amount =5000;
		System.out.println("You purchased amount is " +amount);
		//System.out.println("amount "+TaxCalculation());
		double actualTax= TaxCalculation(amount);
		System.out.println("Your tax amount is : "+actualTax);
		double discountcalc =DiscountCalculation(amount,Discountper());
		System.out.println("Your discount amount is : "+discountcalc);
	}
	
	// method with return type and method with out paramter
	// public double TaxCalculation()
	// method with return type and method with paramter
	public double TaxCalculation(int amount)
	{
		// int amount =1000;
		double taxpercentage = 0.13;
		double taxamount = amount*taxpercentage;
		//System.out.println(taxamount);
		return taxamount;
		
	}
	
	
	public double Discountper()
	{
		return 0.10;
	}
	
	public double DiscountCalculation(int amount, double discountpercen)
	{
		double totaldiscount = amount*discountpercen;
		return totaldiscount;
	}
	public static void main(String[] args)
	{
		Sundayclass sc = new Sundayclass("Fita",89); 
		Sundayclass s = new Sundayclass(); 
		sc.displayName();
		sc.Invoice();
	}

}
 