package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	
	
	@Test
	public void launch() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.ebay.com/");
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//a[text()='Electronics']"))).perform();
		Thread.sleep(2000);
		mouse.moveToElement(browser.findElement(By.xpath("//*[text()='Computers and tablets']"))).click().perform();
	}
	
	@Test
	public void secondaction() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		
	}

	@Test
	public void dragandDrop() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("form:drag"))).dragAndDrop(browser.findElement(By.id("form:drag")), browser.findElement(By.id("form:drop_content"))).perform();
		
	}
	
	@Test
	public void dragandDropby() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/drag.xhtml");
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("form:conpnl"))).dragAndDropBy(browser.findElement(By.id("form:conpnl")), 50, 0).perform();
		
	}
	
	@Test
	public void keyboard() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.facebook.com/");
		Actions mouse = new Actions(browser);
		mouse.moveToElement(browser.findElement(By.id("email"))).sendKeys("sathish").keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		mouse.keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();
		
	}
	
}
