package Interfaceimplementation;

public class PersonalData {
	
	private int phonenumber =919191919;
	private int accoutnumber=130839789;
	public String name = "Sathish";
	
	public int GetPhonumber()
	{
		return phonenumber;
	}
	
	public int Getaccountnumber()
	{
		return accoutnumber;
	}
	
	public void Setaccountnumber(int newaccounnumber)
	{
		 accoutnumber=newaccounnumber;
	}
	
	private void GetMyPhonenumber()
	{
		System.out.println("My phone number is :"+phonenumber);
	}
	private void GetMyaccountnumber()
	{
		System.out.println("My account number is :"+accoutnumber);
	}
	private void GetMyName()
	{
		System.out.println("My name is :"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalData P = new PersonalData();
		P.GetMyPhonenumber();
		P.GetMyName();
		P.GetMyaccountnumber();
	}

}
