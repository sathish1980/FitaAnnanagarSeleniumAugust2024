package BasicsofSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Syncronization {

	@Test
	public void launch()
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		browser.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
		
		WebDriverWait wait =  new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("firstname")));
		browser.findElement(By.name("firstname")).sendKeys("sathish");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
		
		browser.findElement(By.name("lastname")).sendKeys("sathish");
	}
	
}
