package BasicsOjJava;

public class Switchcondition {

	public void Gender(String gendercode)
	{
		switch(gendercode)
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("Not a valid code");
			break;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Switchcondition S = new Switchcondition();
		S.Gender("z");
	}

}
