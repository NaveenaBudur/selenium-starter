package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BookMyShow {


	WebDriver driver;
	public BookMyShow() throws InterruptedException {
		System.out.println( "Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(2000);

	}
	public void endTest() {
		System.out.println("End Test:TestCases");
		driver.close();
		driver.quit();
	}
	public void countOfAllHyperlinks() {
	
		//Navigate to the BookMyShow.com  https://in.bookmyshow.com/explore/home/chennai
		driver.get("https://in.bookmyshow.com/explore/home/chennai");
	    //identifying all the links on the page Using Locator "Tag Name" tagName("a")
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//Count the number of links on the page  driver.findElement(By.tagName('a')).size()
		
	  int countOflinks = links.size(); 
		// driver.findElement(By.tagName('a')).size()
		System.out.println("count of all Image hyperlinks:" + countOflinks);
	}

}
