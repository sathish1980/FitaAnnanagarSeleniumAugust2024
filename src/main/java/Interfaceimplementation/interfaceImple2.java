package Interfaceimplementation;

import Inheritance.FitaTamabaram;

public class interfaceImple2 extends FitaTamabaram implements interface1,Interface2 {

	@Override
	public void amount() {
		// TODO Auto-generated method stub
		int baseamount=100;
		int spentamount=50;
		int balancemoaunt=baseamount-spentamount;
		System.out.println("amount is :"+balancemoaunt);
	}

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		
		int amount=1000;
		double discountper=0.10;
		double totalmoaunt = amount*discountper;
		System.out.println("totalamount: "+totalmoaunt);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 C = new interfaceImple2();
		C.amount();
		C.discount();
		Interface2 C1 = new interfaceImple2();
		C1.discount();
	}

	

}
