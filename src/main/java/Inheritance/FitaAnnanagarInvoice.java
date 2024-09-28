package Inheritance;

public class FitaAnnanagarInvoice extends FitaAnnanagar {
	
	double taxpercentage =0.17;
	
	public void invoice(String Coursename)
	{
		int courseAmount = CourseEnquiry(Coursename);
		double taxAmount = courseAmount*taxpercentage;
		System.out.println("Tax amotun is  : "+taxAmount);
		System.out.println(courseAmount+taxAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitaAnnanagarInvoice F = new FitaAnnanagarInvoice();
		F.invoice("Testing");
	}

}
