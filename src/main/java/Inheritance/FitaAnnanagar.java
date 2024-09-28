package Inheritance;

public class FitaAnnanagar extends FitaBaseBranch{
	
	String branchName = "FITA Anananagar";
	String[] CourseFees = {"Java-10000","Python-15000","C#-20000","SQL-7000","Testing-13000"};
	
	public int CourseEnquiry(String coursename)
	{
		if(GetCourse(coursename))
		{
			if(GetCourseFees(CourseFees,coursename)!=null)
			{
			int feestobePaid = Integer.parseInt(GetCourseFees(CourseFees,coursename));
			System.out.println(feestobePaid);
			return feestobePaid;
			}
			
		}
		else
		{
			System.out.println("The requested course "+coursename+" is not avaialble");
		}
		return 0;
	}

}
