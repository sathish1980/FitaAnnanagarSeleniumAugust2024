package Testcase;

import java.io.IOException;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import BrowserDriver.Browsers;
import Commons.Elements;
import Utils.PropertyFileRead;

public class MakeMyTripFlightSearch extends Browsers {
	
	
	@BeforeSuite
	public void Launch() throws IOException
	{
		LaunchTheBrowser();
	}
	
	
	@BeforeTest
	public void LauchtheApplication() throws IOException
	{
		String url = PropertyFileRead.GetDataFromPropFile().getProperty("url");
		driver.get(url);
	}
	
	@Test(priority=0)
	public void ValidSeach()
	{
		
		String title= Elements.GetTitle(driver);
		System.out.println(title);
	}

	@AfterSuite
	public void tearDown()
	{
		CloseTheBrowser();
	}
}
