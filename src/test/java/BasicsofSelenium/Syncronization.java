package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Syncronization {

	@Test
	public void launch()
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		browser.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		browser.findElement(By.name("firstname")).sendKeys("sathish");
	}
}
