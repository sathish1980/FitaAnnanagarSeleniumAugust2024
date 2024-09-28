package Inheritance;

public class FitaTamabaram extends FitaBaseBranch{

	String branchName = "FITA Tambaram";
	String[] CourseFees = {"Java-15000","Python-17000","C#-25000","SQL-5000","Testing-10000"};
	
	public void CourseEnquiry(String coursename)
	{
		if(GetCourse(coursename))
		{
			if(GetCourseFees(CourseFees,coursename)!=null)
			{
			int feestobePaid = Integer.parseInt(GetCourseFees(CourseFees,coursename));
			System.out.println(feestobePaid);
			}
			
		}
		else
		{
			System.out.println("The requested course "+coursename+" is not avaialble");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitaTamabaram F = new FitaTamabaram();
		F.CourseEnquiry("Testing");
	}
}
