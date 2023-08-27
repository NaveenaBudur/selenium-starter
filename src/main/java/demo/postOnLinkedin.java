package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class postOnLinkedin {
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
    public void post() throws InterruptedException {
    	driver.get("https://in.linkedin.com/");
    //Navigate to the LinkedIn landing page  https://in.linkedin.com/
    WebElement userName = driver.findElement(By.id("session_key"));	
	//Identifying the username textbox Using Locator "ID"  'session_key'
    userName.sendKeys("NaveenaSree");
	//enter the user name  sendkeys("naveena.budur@gmail.com")
    WebElement password = driver.findElement(By.id("session_password"));
    password.sendKeys("NaveenaBudur");
	//Identify the Password textbox Using Locator "ID" sendkeys("naveena.budur@gmail.com")
    WebElement signin_btn = driver.findElement(By.xpath("//*[data-id = 'sign-in-form_submit-btn']"));
    signin_btn.click();
    Thread.sleep(2000);
	//Enter the password  sendKeys("nav@123")
    WebElement viewProfile = driver.findElement(By.xpath("//li/a/div/div[2]/span/strong)[1]"));
    
    System.out.println(viewProfile.getText());
    Thread.sleep(2000);
	//Identifying the signin button Using Locator "XPath" //*[@data-id='sign-in-form__submit-btn']
	//click on the signin button  .click()
	//Get the count of 'Who viewed your profile' Using Locator "XPath" (//li/a/div/div[2]/span/strong)[1]
    WebElement imagepreview = driver.findElement(By.xpath("https://in.linkedin.com/"));
    System.out.println(imagepreview.getText());
    Thread.sleep(2000);
	//Get the count of 'Impressions of your post' Using Locator "XPath" (https://in.linkedin.com//

}
}
