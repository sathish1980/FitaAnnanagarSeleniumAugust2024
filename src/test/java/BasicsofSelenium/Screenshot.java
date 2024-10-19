package BasicsofSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public void launch() throws IOException, InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml");
		browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).click();
		Thread.sleep(1000);
		captureScreenshot(browser,"before");
		String classattribute = browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).getAttribute("class");
		System.out.println(classattribute);
		if(classattribute.contains("ui-state-active"))
		{
			browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).click();
			System.out.println("Unchecked sucessfully");
			captureScreenshot(browser,"after");
			
		}
	}

	public void captureScreenshot(WebDriver browser,String filename) throws IOException
	{
		TakesScreenshot scr = (TakesScreenshot)browser;
		File sourcefile =scr.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\kumar\\eclipse-workspace\\FitaAnnanagarSeleniumAugust2024\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(sourcefile, destinationFile);
	}
}
