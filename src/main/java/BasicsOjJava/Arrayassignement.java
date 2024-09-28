package BasicsOjJava;

import java.util.Scanner;

public class Arrayassignement {
	
	String[] values = new String[5];
	
	public void GetData()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter your item: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		values[i]=input;
		}
		
		for(String eachvalue : values)
		{
			System.out.println(eachvalue);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrayassignement a= new Arrayassignement();
		a.GetData();
	}

}
