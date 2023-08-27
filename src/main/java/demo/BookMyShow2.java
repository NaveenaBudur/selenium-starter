package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow2 {

	ChromeDriver driver;
	public void BookMyShow() throws InterruptedException {
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
	public void countOfAllImageURLs() {
		//Navigate to ' https://in.bookmyshow.com/explore/home/chennai'   https://in.bookmyshow.com/explore/home/chennai
		driver.get(" https://in.bookmyshow.com/explore/home/chennai");
		//Locate the Recommended movies. Using Locator "XPath" List<WebElements> movies = //div[@class = 'style__WidgetContainerBody-sc-lnhrs7-4 YeNog']//img']
		List<WebElement> recommendedMovies = driver.findElements(By.xpath("//div[@class = 'style__WidgetContainerBody-sc-lnhrs7-4 YeNog']//img"));
		System.out.println("No of images:" + recommendedMovies.size());
		//Iterate recommended movies.  for(WebElement movie : movies){
		for(int images=0;images<recommendedMovies.size();images++) {
		if(!(recommendedMovies.get(images).getAttribute("src").equals("")) && !(recommendedMovies.get(images).getAttribute("src") == null)) {
			System.out.println(recommendedMovies.get(images).getAttribute("src"));
		}
		}
		//Getting current  for(WebElement movie : movies){
		//if(movie.equals(movies(2))
		//driver.getText()
		
	}

}
