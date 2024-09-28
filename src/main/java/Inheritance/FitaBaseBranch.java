package Inheritance;

public class FitaBaseBranch {
	
	String[] Course = {"Java","Python","C#","SQL","Testing"};
	
	public boolean GetCourse(String expectedCourse)
	{
		for(String eachCourse : Course)
		{
			if(expectedCourse.equalsIgnoreCase(eachCourse))
				return true;
		}
		return false;
	}
	
	public String GetCourseFees(String[] coursefeesArray,String expectedCourse)
	{
		for(String eachCoursefees : coursefeesArray)
		{
			String[] afterSplit = eachCoursefees.split("-");
			String actualCourse = afterSplit[0];
			String actualfees  =afterSplit[1];
			if(actualCourse.equalsIgnoreCase(expectedCourse))
				return actualfees;
		}
		return null;
	}

}
