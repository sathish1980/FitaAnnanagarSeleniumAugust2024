package TestNGAnnotation;

import org.testng.annotations.*;

public class TestNGFirstClass {

	
	@Test(priority=1,timeOut=1,dependsOnMethods="Testcase2",groups="Sanity")
	public void Testcase1()
	{
		System.out.println("Testcase 1");
	}

	@Test(priority=2,timeOut=1,dependsOnMethods="Testcase2",groups= {"Sanity","SIT"})
	public void Testcase4()
	{
		System.out.println("Testcase 4");
	}

	@Test(priority=3,timeOut=1,dependsOnMethods="Testcase2",groups="SIT")
	public void Testcase3()
	{
		System.out.println("Testcase 3");
	}

	
	@BeforeSuite(alwaysRun=true)
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
	
	
	@Test(priority=0,enabled=true,invocationCount=3,invocationTimeOut=6000,groups= {"Sanity","SIT"})
	public void Testcase2() throws InterruptedException
	{
		System.out.println("Testcase 2");
		//Thread.sleep(500);
	}
}
