package BasicsofSelenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class FirstClass {
	
	@Test
	public void launch()
	{
	//	System.setProperties("webrdriver.chrome.driver","");
		WebDriver browser = new EdgeDriver();
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		//browser.close();
		//browser.quit();
		browser.get("https://www.facebook.com/");
		/*browser.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();*/
		WebElement username = browser.findElement(By.id("email"));
		username.sendKeys("sathish");
		//or
		browser.findElement(By.name("email")).clear();
		//browser.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("test");
		//browser.findElement(By.linkText("Forgotten password?")).click();
		//browser.findElement(By.partialLinkText("gotten")).click();
		
		browser.findElement(By.cssSelector("input#email")).sendKeys("FITA");
		//browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("FITA");
		
		browser.findElement(By.cssSelector("[data-testid='royal_login_button']")).click();
		
		browser.findElement(By.cssSelector("button._42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy[data-testid='royal_login_button']")).click();
		 
	}

}
