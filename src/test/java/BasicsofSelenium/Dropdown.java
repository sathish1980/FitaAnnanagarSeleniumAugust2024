package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {

	@Test
	public void launch() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/select.xhtml");
		Select drop = new Select(browser.findElement(By.xpath("//*[@class='ui-selectonemenu']")));
		System.out.println(drop.isMultiple());
		drop.selectByIndex(2);
		Thread.sleep(1000);
		drop.selectByVisibleText("Cypress");
	}
}
