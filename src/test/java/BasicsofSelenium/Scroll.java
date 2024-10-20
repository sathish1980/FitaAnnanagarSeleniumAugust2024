package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	
	@Test
	public void launch() throws InterruptedException
	{
		WebDriver browser = new ChromeDriver();
		browser.manage().window().maximize();// window maximize
		browser.get("https://www.leafground.com/dashboard.xhtml");
		
		JavascriptExecutor js= (JavascriptExecutor)browser;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		
		// verticalupward
		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(2000);
		
		// horizontal right
		js.executeScript("window.scrollBy(200,0)", "");
		Thread.sleep(2000);
		
		//horizontal left
		js.executeScript("window.scrollBy(-100,0)", "");
		Thread.sleep(2000);
		
		// vertically scroll down to the end
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
				
	// vertically scroll up to the end
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement calenderbutton=browser.findElement(By.xpath("(//*[@class='fc-button-group'])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();", calenderbutton);

	}

}
