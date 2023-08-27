package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Nested_frames {
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
    public void nestedFrames() {
    	driver.get(" https://the-internet.herokuapp.com/nested_frames");
    	    //Navigate to : https://the-internet.herokuapp.com/nested_frames  : https://the-internet.herokuapp.com/nested_frames
//    		Switch from main frame to 'frame-top'.  driver.switchTo().frame('frame-top')
    	 driver.switchTo().frame("frame-top");
//    		Switch from parant frame 'frame-top' to 'frameset-middle'.  driver.switchTo().frame('frameset-middle')
    	driver.switchTo().frame("frameset-middle");	 
//    		Switch from parant frame 'frameset-middle' to '/frame_left'.  driver.switchTo().frame('frameset-middle')
//    		Get text of /'frame_left'  String string1 = leftFrame.getText()
//    		Print '/frame_left'  System.out.println(string1)
//    		Switch to parantFrame 'frameset-middle'.  driver.switchTo().ParantFrame()
//    		Switch from parantFrame to 'frame_middle'  String middleFrame = driver.switchTo().frame(frame_middle')
//    		Get text of 'middleFrame'  String string2 = middleFrame.getText()
//    		Print 'middleFrame'.  System.out.println(string2)
//    		Switch to parantFrame 'frameset-middle'.  driver.switchTo().ParantFrame()
//    		Switch from parantFrame to 'frame_right'  String rightFrame = driver.switchTo().frame('frame_right')
//    		Get text of 'rightFrame'  String string3 = rightFrame.getText()
//    		Print 'rightFrame'.  System.out.println(string3)
//    		Switch to parantFrame 'frameset-middle'.  driver.switchTo().ParantFrame().
//    		Switch to default frame 'frame-top'.  driver.switchTo().defaultContent().
//    		Switch to '/frame_bottom'  String buttomFrame =driver.switchTo().frame('/frame_bottom')
//    		get text of 'frame_bottom'  String string4 = buttomFrame.getText().
//    		print 'frame_bottom'  System.out.println(string4)
    WebDriver leftFrame = driver.switchTo().frame("/frame_left");
    String string1 = leftFrame.getTitle();
    System.out.println(string1);
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    WebDriver middleFrame = driver.switchTo().frame("frame_middle");
    String string2 = middleFrame.getText();
    System.out.println(string2);
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    WebDriver rightFrame = driver.switchTo().frame("frame_right");
    String string3 = rightFrame.getText();
    System.out.println(string3);
    Thread.sleep(2000);
    driver.switchTo().parentFrame();
    Thread.sleep(2000);
    driver.switchTo().defaultContent();
    Thread.sleep(2000);
    WebDriver buttonFrame = driver.switchTo().frame("/frame_button");
    String string4 = buttonFrame.getText();
    System.out.println(string4);
    	
    }
}