package BasicsofSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Checkbox {

	@Test
	public void launch()
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/checkbox.xhtml");
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		WebDriverWait wait =  new WebDriverWait(browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		String output = browser.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(output);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ui-growl-title']")));
		browser.findElement(By.xpath("//*[@id='j_idt87:j_idt91']//div[starts-with(@class,'ui-chkbox-box')]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		String output1 = browser.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(output1);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='ui-growl-title']")));
		browser.findElement(By.className("ui-toggleswitch-slider")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='ui-growl-title']")));
		String output2 = browser.findElement(By.xpath("//*[@class='ui-growl-title']")).getText();
		System.out.println(output2);
		
	}
}
