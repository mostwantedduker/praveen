package org.sample7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO PC\\eclipse-workspace\\sample7\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtbtn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		txtbtn.click();
		WebElement txtbtn1 = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		txtbtn1.click();
		Thread.sleep(30000);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("userName"));
		element.sendKeys("Vignesh");

	}
}
