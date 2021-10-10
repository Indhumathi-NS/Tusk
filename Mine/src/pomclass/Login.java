package pomclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Loginpage;

public class Login {

	@Test
	public void verifyvalidlogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\767461\\workspace\\Indhu_EX1\\Mine\\resource\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com");
		Thread.sleep(3000);
		WebElement we = driver.findElement(By.xpath("//a[@class='x-nav-link x-nav-link--primary x-link']"));
	we.click();
	
	
	Loginpage login=new Loginpage(driver);
	login.typemailadd();
	login.typeusername();
	}
	
	
}
