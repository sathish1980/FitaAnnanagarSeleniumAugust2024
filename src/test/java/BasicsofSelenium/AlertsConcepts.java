package BasicsofSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AlertsConcepts {
	
	@Test
	public void launch() throws InterruptedException
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/alert.xhtml;");
		browser.findElement(By.id("j_idt88:j_idt91")).click();
		browser.switchTo().alert().accept();
		browser.findElement(By.id("j_idt88:j_idt93")).click();
		browser.switchTo().alert().dismiss();
		browser.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alt = browser.switchTo().alert();
		/*browser.switchTo().alert().sendKeys("sathish");
		browser.switchTo().alert().getText();
		browser.switchTo().alert().accept();*/
		
		alt.sendKeys("sathish");
		alt.getText();
		alt.accept();
		
		browser.findElement(By.id("j_idt88:j_idt95")).click();
		browser.findElement(By.id("j_idt88:j_idt98")).click();
	}

}
