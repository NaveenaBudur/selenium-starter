
package demo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IMDB_ratings {
	    ChromeDriver driver;
	    public void TestCases() throws InterruptedException 
	    {
	        System.out.println("Constructor: TestCases");
	        WebDriverManager.chromedriver().timeout(30).setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        Thread.sleep(2000);

	    }

	    public void endTest()
	    {
	        System.out.println("End Test: TestCases");
	        driver.close();
	        driver.quit();

	    }
	    public void imdb_ratings() throws InterruptedException {
//Navigate to 'https://www.imdb.com/chart/top/'  https://www.imdb.com/chart/top/
	driver.get(" https://www.imdb.com/chart/top");    	
//Locating the IMDB dropdown. Using Locator "XPath" //select[@id = 'sort-by-selector']
    WebElement imdb_rating =  driver.findElement(By.xpath("//select[@id = 'sort-by-selector']"));
//	   Selecting the IMDB dropdown by using the select class. Using Locator "XPath" Select IMDBdropdown = new Select(dropdown)
    Select IMDBdropdown = new Select(imdb_rating);
    IMDBdropdown.selectByVisibleText("IMDB rating");
    Thread.sleep(2000);
//	   Select the IMDB rating dropdown.  Select IMDBdropdown = new Select(dropdown)
//	   Getting thehighest rated movie on IMDb by using xpath. Using Locator "XPath" //ul[role='presentation']/li[1]/a[@class="ipc-title-link-wrapper"]
    WebElement high_rated_movie = driver.findElement(By.xpath("//ul[@role='presentation']/li[1]//div/a[@class='ipc-title-link-wrapper']"));
      Thread.sleep(2000);
      System.out.println("high_rated_movie:" + high_rated_movie.getText());
//	   Getting thehighest rated movie on IMDb by using getText method.  //ul[role='presentation']/li[1]/a[@class="ipc-title-link-wrapper"].click()
//	   Finding how many movies are included in the table byusing xpath. Using Locator "XPath" //div[@class='ipc-page-grid ipc-page-grid--bias-left']//ul/li
    List<WebElement> numberOfMovies = driver.findElements(By.xpath("//div[@data-testid='chart-layout-main-column']/ul/li"));
    Thread.sleep(2000);
    int count = numberOfMovies.size();
    System.out.println("Total_no_movies:" + count);
//	   Getting all the movies.  .getSize().
//	   Finding the oldest movie on the list by locating the releasedate dropdown.  //div[@data-testid='chart-layout-main-column']/ul/li[1]/span[1]
    WebElement oldestMovie = driver.findElement(By.xpath("//ul[@role = 'presentation']//li[last()]//h3[@class = 'ipc-title__text']"));
    Thread.sleep(2000);
    System.out.println("The oldest movie on the list:" + oldestMovie.getText());
   List<WebElement> recent_movie = driver.findElements(By.xpath("//ul[@role = 'presentation']//li//h3"));
   Thread.sleep(2000);
   System.out.println("Recent Movie in the list:" + recent_movie.getText());
//	   To select the Release date by using select class.  Select  relealsedropdown = new Select(dropdown)
//	   select by visible text.  releasedropdown.selectBy.visibleText(Release date)
   imdb_rating.click();
   IMDBdropdown.selectByVisibleText("Number of ratings");
   Thread.sleep(2000);
   WebElement highest_rating = driver.findElement(By.xpath("//ul[@role = 'presentation']//li//h3[1]"));
   System.out.println(highest_rating.getText());
   
//	   gettting size.  //div[@data-testid='chart-layout-main-column']/ul/li[1]/span[1].size().
//	   count of the oldest movie.  count(1).
//	   Finding the most recent movie.  //div[@class='ipc-page-grid ipc-page-grid--bias-left']//ul/li[1]	    	
	    }

}
