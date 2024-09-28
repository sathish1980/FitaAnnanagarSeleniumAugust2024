package BasicsOjJava;

import java.util.Scanner;

public class Firstclass1 {

 public void sub()
 {
	 int total = 10-10;
	 System.out.println(total);
 }
 
 public void mul()
 {
	 int total = 10*10;
	 System.out.println(total);
 }
 
	public static void main(String[] args)
	{
		System.out.println("Sathish");
		/*System.out.println("FITA");
		System.out.println("FITA");
		System.out.println("FITA");
		System.out.println("FITA");*/
		System.out.println("chennai");
		
		System.out.println("Enter your name : ");
		Scanner S = new Scanner(System.in);
		System.out.println(S.nextLine());
		S.close();
		SecondClass s = new SecondClass();
		s.add();
		Firstclass1 f = new Firstclass1();
		f.sub();
		f.mul();
	}
	
}
