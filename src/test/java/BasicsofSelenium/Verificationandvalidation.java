package BasicsofSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Verificationandvalidation {
	
	/*\
	 * Verification
	 * 1.getTitle
	 * 2.getCurrentUrl
	 * 3.getPageSource
	 * 4.getText
	 * 5.getAttribute
	 * 6.getCssValue
	 * 7.getWindowHandle
	 * 8.getWindowHandels
	 * 
	 * Validation -boolean
	 * isDisplayed
	 * isSelected- checkbox,radiobox
	 * isEnabled
	 */
	
	@Test
	public void launch() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/checkbox.xhtml");
		String title = browser.getTitle();
		System.out.println(title);
		String url= browser.getCurrentUrl();
		System.out.println(url);
		String pagesource = browser.getPageSource();
		System.out.println(pagesource);
		
		String text = browser.findElement(By.xpath("(//*[@class='card']//h5)[1]")).getText();
		System.out.println(text);
		
		String beforetext = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).getAttribute("class");
		System.out.println(beforetext);
		
		browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).click();
		Thread.sleep(500);
		String aftertext = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).getAttribute("class");
		System.out.println(aftertext);
		
		Boolean value = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).isSelected();
		System.out.println(value);
		
		String parentwindow = browser.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> parentwindows = browser.getWindowHandles();
		System.out.println(parentwindows);
		
		String cssvalue = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).getCssValue("background-color");
		System.out.println(cssvalue);
		
		String cssvalue1 = browser.findElement(By.xpath("//*[@id='j_idt87:basic']//td[2]//div[2]")).getCssValue("height");
		System.out.println(cssvalue1);
		
			}

}
