package BasicsofSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RadioButton {

	@Test
	public void launch()
	{
	
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		browser.get("https://www.leafground.com/radio.xhtml");
		browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).click();
		String classattribute = browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).getAttribute("class");
		System.out.println(classattribute);
		if(classattribute.contains("ui-state-active"))
		{
			browser.findElement(By.xpath("//*[text()='Hyderabad']//parent::div//div[starts-with(@class,'ui-radiobutton-box')]")).click();
			System.out.println("Unchecked sucessfully");
		}
	}
}
