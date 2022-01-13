package Excercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\767461\\workspace\\Indhu_EX1\\Mine\\resource\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://amazon.in");
WebDriverWait wai=new WebDriverWait(driver, 9);
driver.manage().window().maximize();

WebElement we=driver.findElement(By.id("twotabsearchtextbox"));
we.sendKeys("phone");
Thread.sleep(3000);
we.sendKeys(Keys.ENTER);
Thread.sleep(3000);

Actions act=new Actions(driver);
//act.doubleClick(driver.findElement(By.id("ji"))).perform();
//act.moveByOffset(xOffset, yOffset)

//String ps=driver.getPageSource();
//System.out.println(ps);



	}

}
