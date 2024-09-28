package Interfaceimplementation;

public class StudentInfo extends PersonalData{
	
	public void Getdsathishinfo()
	{
		System.out.println("My name is : "+name);
		System.out.println("My phone number is : "+GetPhonumber());
		Setaccountnumber(123123123);
		System.out.println("My acc number is: "+Getaccountnumber());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo S = new StudentInfo();
		S.Getdsathishinfo();
	}

}
