

package testPOM;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import BB.pages.*;



public class LoginUserPOM {

	public LoginUserPOM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString()+"@example.com";
	//	System.out.println(output + "  " +sb.toString());
		
		
		//init the explorer driver 
		
		System.setProperty("webdriver.chrome.driver", "E:\\Installation\\Selenium Java\\chrome driver\\2.30\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();


		//Hit the link
		driver.navigate().to("https://halfdome-testing.bloomboard.com/login");
		driver.manage().window().maximize();
		//	driver.navigate().to("http://halfdome/login");
		//Login to Next Gen successfully
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Click on Sign up page
		Login.signUp(driver).click();
		System.out.println("Clicked");
		Login.emailText(driver).clear();
		Login.emailText(driver).sendKeys(output);  
		Login.passwdText(driver).clear();
		Login.passwdText(driver).sendKeys("vdit@12345");
		Login.confirmPasswdText(driver).clear();
		Login.confirmPasswdText(driver).sendKeys("vdit@12345");
		Login.firstNameText(driver).sendKeys(sb.toString());
		Login.lastNameText(driver).sendKeys("BloomboardTest");
		Login.signIn(driver).click();

		//Assert the title of the page
		Assert.assertEquals(driver.findElement(By.cssSelector("h3.sc-hmzhuo.cmvKye")).getText(), "My Learning");
		
		//Logout
		Notifications.settingIcon(driver).click();
		try {
			Thread.sleep(2000);

			Notifications.logOutOption(driver).click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		//Login
		Login.emailText(driver).clear();
		Login.emailText(driver).sendKeys(output);  
		Login.passwdText(driver).clear();
		Login.passwdText(driver).sendKeys("vdit@12345");
		Login.signIn(driver).click();
		Notifications.settingIcon(driver).click();

		
			try {
				Thread.sleep(2000);

				Notifications.logOutOption(driver).click();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	

	
	}

}
