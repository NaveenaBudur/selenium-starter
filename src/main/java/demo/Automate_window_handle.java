
package demo;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Automate_window_handle {
ChromeDriver driver;
public void BookMyShow() throws InterruptedException {
System.out.println( "Constructor: TestCases");
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
    public void getWindowHandle() {
  driver.get(" https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
  //Navigate to 'https://www.w3schools.com/jsref/tryit.aspfilename=tryjsref_win_open'  https://www.w3schools.com/jsref/tryit.aspfilename=tryjsref_win_open
//Getting current Window.  String parantWindow = driver.getWindowHandle()
  String parentWindow = driver.getWindowHandle();
  // Print current window.  String parantWindow = driver.getWindowHandle()
  System.out.println(parentWindow);
	 //Locating Try it button.  //button[contains(text(),'Try it')]
  driver.findElement(By.xpath("//button[text() = 'Try it']")).click();
	//Clicking on the 'Try it' button.  //button[contains(text(),'Try it')].click()
  Set<String> currentWindow = driver.getWindowHandles();
	 // Switch to another window.  Set<String> handles = driver.getWindowHandles().
  System.out.println(currentWindow);
	 // print the new window.  System.out.println(handles).
	 // Iterate that new window  for(String handle : handles){
  for(String handles : currentWindow) {
	 //If parentwindow not equal to new window then  if(!parantWindow.equals(handle){
  if(!parentWindow.equals(currentWindow)) {
	// Switch to that new window  driver.switchTo().window(handle)
  }
	  driver.switchTo().window(handles);
  }
  driver.getCurrentUrl();
	 //Getting Url  driver.getCurrentUrl()
  driver.getTitle();
	 //Getting Tittle of the page.  driver.getTitle()
  TakesScreenshot ts = (TakesScreenshot)driver;
  File file = ts.getScreenshotAs(OutputType.FILE);
  FileUtills.copyFile(file, new File("./Screenshots/Image1.png"));
  driver.close();
  
	 // Taking screenshot of new window.  TakeScreenshot ts =(TakeScreenshot)driver
	 //Store that the screen shot as file.  File file = ts.getScreenshotAS(OutputType.FILE)
	 //Making one folder and screen shot can be stored in that.  FileUtills.copyFile(file,new File("./Screenshots/Image1.png"))
	 //Closing the new window .  driver.close()
  driver.switchTo().window(parentWindow);
	// Switching to the parantWindow.   driver.switchTo().window(parantWindow) 	
    }
}
