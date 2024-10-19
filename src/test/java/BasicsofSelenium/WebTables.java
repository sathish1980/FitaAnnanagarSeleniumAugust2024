package BasicsofSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebTables {
	
	@Test
	public void launch() throws InterruptedException
	{
		String expectedCountry = "India";
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/table.xhtml");
		
		List<WebElement> allPages =browser.findElements(By.xpath("//*[@class='ui-paginator-pages']//a"));
		
		for(int j=1;j<=allPages.size();j++)
		{
			
			browser.findElement(By.xpath("//*[@class='ui-paginator-pages']//a["+j+"]")).click();
			
			Thread.sleep(2000);
		List<WebElement> allRows = browser.findElements(By.xpath("//*[@id='form:j_idt89_data']//tr"));
		for (int i=1;i<=allRows.size();i++)
		{
			String actualCountry = browser.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[starts-with(@style,'vertical')]")).getText();
			if(actualCountry.equalsIgnoreCase(expectedCountry))
			{
				String name = browser.findElement(By.xpath("//*[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText();
				System.out.println(name);
				
			}
		}
		}
	}

}
