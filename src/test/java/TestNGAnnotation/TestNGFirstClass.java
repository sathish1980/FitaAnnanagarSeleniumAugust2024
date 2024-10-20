package TestNGAnnotation;

import org.testng.annotations.*;

public class TestNGFirstClass {

	
	@Test
	public void Testcase1()
	{
		System.out.println("Testcase 1");
	}

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("afterSuite");
	}
	
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterClass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	
	@Test
	public void Testcase2()
	{
		System.out.println("Testcase 2");
	}
}
