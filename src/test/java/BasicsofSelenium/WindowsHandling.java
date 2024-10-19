package BasicsofSelenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WindowsHandling {

	
	@Test
	public void launch()
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/window.xhtml");
		String parentwindow = browser.getWindowHandle();
		System.out.println(parentwindow);
		
		browser.findElement(By.id("j_idt88:new")).click();
		
		Set<String> allWindows = browser.getWindowHandles();
		
		for(String eachwindow : allWindows)
		{
			if(!parentwindow.equalsIgnoreCase(eachwindow))
			{
			browser.switchTo().window(eachwindow);
			
			List<WebElement> elementExist = browser.findElements(By.id("menuform:j_idt40"));
			if(elementExist.size()>0)
			{
				browser.findElement(By.id("menuform:j_idt40")).click();
				browser.findElement(By.id("menuform:m_input")).click();
				browser.findElement(By.id("j_idt88:name")).sendKeys("FITA");
					
			}
			browser.switchTo().window(parentwindow);
			}
		}
		
	}
}
