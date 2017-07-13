package BB.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Notifications {
	private static WebElement element = null;

	public static WebElement notificationIcon(WebDriver driver){
		element=  driver.findElement(By.cssSelector("a.ant-popover-open.firepath-matching-node"));
		return element;
		
	}
	public static WebElement settingIcon(WebDriver driver){
		element=  driver.findElement(By.cssSelector("li:nth-of-type(5) > a"));
		return element;
		
	}
	public static WebElement logOutOption(WebDriver driver){
	//	element=driver.findElement(By.cssSelector("a:contains(Logout)"));
		element=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		return element;
		
	}
	
}
