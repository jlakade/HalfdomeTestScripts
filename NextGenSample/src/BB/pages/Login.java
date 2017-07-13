package BB.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	private static WebElement element = null;


	public static WebElement signUp(WebDriver driver){
		element= driver.findElement(By.className("ant-tabs-tab"));
		return element;
	}	
	public static WebElement emailText(WebDriver driver){
		element = driver.findElement(By.id("email"));
		return element;
	}
	public static WebElement passwdText(WebDriver driver){
		element = driver.findElement(By.id("password"));
		return element;
	}
	public static WebElement signIn(WebDriver driver){
		element = driver.findElement(By.cssSelector("button[type=submit]"));
		return element;
	}
//	public static WebElement emailIDText(WebDriver driver){
//		
//		return element;
//		
//	}
//	public static WebElement passwordText(WebDriver driver){
//		return element;
//		
//	}
	public static WebElement confirmPasswdText(WebDriver driver){
		element= driver.findElement(By.id("confirmPassword"));
		return element;
		
	}
	public static WebElement firstNameText(WebDriver driver){
		element= driver.findElement(By.id("firstName"));
		return element;
		
	}
	public static WebElement lastNameText(WebDriver driver){
		element= driver.findElement(By.id("lastName"));
		return element;
		
	}

}
