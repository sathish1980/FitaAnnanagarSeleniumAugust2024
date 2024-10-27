package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.Elements;

public class SearchResultPage {

	WebDriver driver;
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String GetsearchResult()
	{
		Elements.WaitForVisible(driver, By.xpath("//*[@class='error-title']"));
		return Elements.GetText(driver.findElement(By.xpath("//*[@class='error-title']")));

	}
	
}
