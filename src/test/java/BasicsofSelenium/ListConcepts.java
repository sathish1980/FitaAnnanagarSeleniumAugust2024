package BasicsofSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ListConcepts {

	@Test
	public void launch() throws InterruptedException
	{
	
		String expectedCountry = "USA";
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/select.xhtml");
		browser.findElement(By.xpath("//*[@id='j_idt87:country']//*[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
		List<WebElement> allcountry =  browser.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
		WebDriverWait wait =  new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
		
		for(WebElement eachcountry:allcountry)
		{
			String actualCountry = eachcountry.getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				eachcountry.click();
				break;
			}
			
		}
		
	}

}
