package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Loginpage {
	WebDriver driver;

By mailadd=By.xpath("//input[@name='email']");
By username= By.xpath("//input[@name='username']");
public Loginpage(WebDriver driver) {
	this.driver=driver;
	
}
public void typemailadd()
{
	driver.findElement(mailadd).sendKeys("indhu@gmail.com");
}

public void typeusername()
{
	driver.findElement(username).sendKeys("Indhu");
}





}
