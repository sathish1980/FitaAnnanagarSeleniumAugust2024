package Testcase;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;

import BrowserDriver.Browsers;
import Commons.Elements;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.ExcelfileRead;
import Utils.PropertyFileRead;
import junit.framework.Assert;

public class MakeMyTripFlightSearch extends Browsers {
	
	SearchPage sp;
	SearchResultPage srp ;
	String url;
	
	@BeforeSuite
	public void Launch() throws IOException
	{
		LaunchTheBrowser();
	}
	
	
	@BeforeTest
	public void LauchtheApplication() throws IOException
	{
		url = PropertyFileRead.GetDataFromPropFile().getProperty("url");
		driver.get(url);
	}
	
	@BeforeClass
	public void SetValues()
	{
		sp = new SearchPage(driver);
		srp= new SearchResultPage(driver);
		sp.CloseThePopupIfExist();
	//	test.log(Status.INFO, "Clicked on Popup");
	}
	
	/*
	 * TD : Search the flight functionality with valid values
	 * created by: Sathish Kumar
	 * Date: 27/10/2024
	 *
	 */
	@Test(priority=0,dataProvider="GetValidSearchTestdata",dataProviderClass=DataProviderAnnotaions.class)
	public void ValidSeach(String from, String to, String date)
	{
		
		/*
		 * Open the browser and enter the url
		 * close the popup if exist
		 * Select from location
		 * Select To location
		 * Select date
		 * click search button
		 * Valdiate the search result
		 */
	
		driver.get(url);
		test = extent.createTest("SearchWithValidValues Testcase");
		String title= Elements.GetTitle(driver);
		System.out.println(title);
		test.log(Status.INFO, "Validated the Title is : "+title);
		sp.SelectFromLocation(from);
		test.log(Status.INFO, "Selected from location as: "+from);
		sp.SelectToLocation(to);
		test.log(Status.INFO, "Selected to location as: "+to);
		sp.SelectDate(date);
		test.log(Status.INFO, "Selected date as : "+date);
		sp.clickOnSearchbutton();
		test.log(Status.INFO, "Search button is clicked");
		
		String actualText = srp.GetsearchResult();
		test.log(Status.INFO, "output retreived");
		String expectedText = "NETWORK PROBLEM";
		Assert.assertEquals(actualText, expectedText);
		
	}
	

	
	@Test(priority=1)
	public void SameCitySearch()
	{
		
		/*Open the browser and enter the url
		 * close the popup if exist
		 * Select from location
		 * Select To location same as from location
		 * 
		 */
		Elements.ClickBackButton(driver);
		test = extent.createTest("SearchWithINValidValues Testcase");
		String title= Elements.GetTitle(driver);
		System.out.println(title);
		test.log(Status.INFO, "Validated the Title is : "+title);
		//sp.CloseThePopupIfExist();
		test.log(Status.INFO, "Clicked on Popup if exist");		
		sp.SelectFromLocation("MAA");
		test.log(Status.INFO, "Selected from location");
		sp.SelectToLocation("MAA");
		test.log(Status.INFO, "Selected to location");
		String expectedSameCityError= "From & To airports cannot be the same";
		String actualSameCityError =sp.GetSameCityError();
		Assert.assertEquals(actualSameCityError, expectedSameCityError);

	}
	
	
	@AfterMethod
	public void WriteInReport(ITestResult result) throws IOException
	{
		if (result.getStatus()==ITestResult.SUCCESS) {
			String filePath = Elements.GetScreenshot(driver,result.getName());
		     test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is passed");

        }else if(result.getStatus()==ITestResult.FAILURE) {
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is FAILED");
            String filePath = Elements.GetScreenshot(driver,result.getName());
            test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.FAIL,"Test failure : "+ result.getThrowable());
        }
        else if(result.getStatus()==ITestResult.SKIP) {
            test.log(Status.SKIP,"Test Method named as : "+ result.getName()+" is skipped");
        }
	}
	
	@AfterSuite
	public void tearDown()
	{
		CloseTheBrowser();
	}
	
	
	
}
