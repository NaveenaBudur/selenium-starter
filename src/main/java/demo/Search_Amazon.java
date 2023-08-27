package demo;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Amazon {
	WebDriver driver;
	public Search_Amazon() throws InterruptedException {
		System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);
}
	public void endTest() {
		System.out.println("End Test:TestCases");
		driver.close();
		driver.quit();
	}
	public void searchAmazon() {
	//Navigate to google  www.google.com
	driver.get("https://www.google.com");
	//Search for 'amazon' in search box. Using Locator "ID" sendKeys("amazon") | APjFqb
	driver.findElement(By.id("APjFqb")).sendKeys("amazon");
	//Hit enter.  sendKeys("Keys.RETURN")
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
	//Validate the search result . Using Locator "XPath" sendKeys("Keys.RETURN")
	boolean result = driver.findElement(By.id("//span[@data-dtld='Amazon.in or @data-dtld='Amazon.in]")).isDisplayed();
	//printing the result
	System.out.println("Is Amazon present:" + result);
}
}
 