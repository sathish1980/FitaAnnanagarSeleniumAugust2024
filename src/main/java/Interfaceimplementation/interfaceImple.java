package Interfaceimplementation;

import Inheritance.FitaTamabaram;

public class interfaceImple extends FitaTamabaram implements interface1,Interface2 {

	@Override
	public void amount() {
		// TODO Auto-generated method stub
		int baseamount=1000;
		int spentamount=500;
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
		interface1 C = new interfaceImple();
		C.amount();
		C.discount();
		Interface2 C1 = new interfaceImple();
		C1.discount();
	}

	

}
