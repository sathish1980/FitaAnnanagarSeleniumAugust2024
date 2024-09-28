package Abstractionconcept;

public class FinalClass extends class1 {
	
	public void getAge(int dob)
	{
		int currentyear =2024;
		int age = currentyear-dob;
		System.out.println("your age is : "+age);
	}
	
	@Override
	public void DisplayName(String name) {
		System.out.println("My name is: "+name);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 F = new FinalClass();
		FinalClass F1 = new FinalClass();
		F1.getAge(1990);
		F.DisplayName("FITA annanagar");
	}



	

}
