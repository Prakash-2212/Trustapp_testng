package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;

public class ChromeExtensionAutomation_clone {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable.
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeOptions.
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./Extensions/TrustApp.crx"));

        // Create an instance of ChromeDriver with the options.
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website (replace with the desired URL).
        driver.get("https://twitter.com/home");

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // locate Username
        WebElement Username = driver.findElement(By.xpath("//input[@name='text']"));

        // to highlight the Chrome_Web_Store
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Username);
        Thread.sleep(2000);

        Username.click();
        Username.clear();
        Username.sendKeys("PRAKASH31226122");
        Thread.sleep(2000);

        // locate Next
        WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

        // to highlight the Next
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Next);
        Thread.sleep(2000);

        Next.click();

        Thread.sleep(2000);

        // locate Password
        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));

        // to highlight the Password
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Password);
        Thread.sleep(2000);

        Password.click();
        Password.clear();
        Password.sendKeys("Ankush@4948");
        Thread.sleep(2000);

        // locate Log_in
        WebElement Log_in = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));

        // to highlight the Log_in
        JavascriptExecutor jse4 = (JavascriptExecutor) driver;
        jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Log_in);
        Thread.sleep(2000);

        Log_in.click();

        Thread.sleep(15000);

        // driver.navigate().refresh();
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0,650)", "");
        Thread.sleep(3000);

        // locate Search_bar
        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));

        // to highlight the Log_in
        JavascriptExecutor jse5 = (JavascriptExecutor) driver;
        jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar);
        Thread.sleep(2000);

        Search_bar.click();
        Search_bar.clear();
        Thread.sleep(1000);

        Search_bar.sendKeys("The Economist");
        Thread.sleep(1000);

        Search_bar.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        // locate The_Economist
        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist']"));

        // to highlight the The_Economist
        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
        jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", The_Economist);
        Thread.sleep(2000);

        The_Economist.click();
        jse6.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);

        // locate TrustApp_mark
        WebElement TrustApp_mark = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

        // to highlight the TrustApp_mark
        JavascriptExecutor jse7 = (JavascriptExecutor) driver;
        jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark
        Actions actions = new Actions(driver);
        actions.moveToElement(TrustApp_mark).perform();


        
        // locate Search_bar
        WebElement Search_bar1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));

        // to highlight the Log_in
        JavascriptExecutor jse8 = (JavascriptExecutor) driver;
        jse8.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar1);
        Thread.sleep(2000);

        Search_bar1.click();
        Search_bar1.clear();
        Thread.sleep(1000);

        Search_bar1.sendKeys("CNN");
        Thread.sleep(2000);

        Search_bar1.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        
        
        // locate CNN
        WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));

        // to highlight the CNN
        JavascriptExecutor jse9 = (JavascriptExecutor) driver;
        jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", CNN);
        Thread.sleep(2000);
        
        CNN.click();
        jse9.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(3000);
        
        // locate TrustApp_mark1
        WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

        // to highlight the TrustApp_mark
        JavascriptExecutor jse10 = (JavascriptExecutor) driver;
        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark1);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark1).perform();
        
        
        
//        WebElement newsElement = driver.findElement(By.cssSelector("div[id='id__wagpq6ggja'] span[class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3']"));
//        String newsText = newsElement.getText();
//        System.out.println(newsText);
        
        
        
        // locate Post
        WebElement Post = driver.findElement(By.xpath("//a[@aria-label='Post']"));

        // to highlight the Post
        JavascriptExecutor jse11 = (JavascriptExecutor) driver;
        jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post);
        Thread.sleep(2000);
        
        Post.click();
        
        Thread.sleep(3000);
        
        
        // locate Post_text
        WebElement Post_text = driver.findElement(By.xpath("//div[@aria-label='Post text']"));

        // to highlight the Post_text
        JavascriptExecutor jse12 = (JavascriptExecutor) driver;
        jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text);
        Thread.sleep(2000);
        
        Post_text.click();
        Post_text.clear();
        
        Post_text.sendKeys("For the first time since Vladimir Putin invaded Ukraine, it "
        		+ "looks as if he could win. His biggest asset is Europe’s fatalism, "
        		+ "complacency and shocking lack of strategic vision https://econ.st/47DL80U");
        
        Thread.sleep(2000);
        
        
        // locate Post1
        WebElement Post1 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));

        // to highlight the Post
        JavascriptExecutor jse13 = (JavascriptExecutor) driver;
        jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post1);
        Thread.sleep(2000);
        
      
        Post1.click();
        
        Thread.sleep(2000);

        
        // locate Profile
        WebElement Profile = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));

        // to highlight the Profile
        JavascriptExecutor jse14 = (JavascriptExecutor) driver;
        jse14.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile);
        Thread.sleep(2000);
        
      
        Profile.click();
        
        Thread.sleep(2000);
        
         jse14.executeScript("window.scrollBy(0,650)", "");
        // Scroll down
       // js.executeScript("window.scrollBy(0,850)", "");

        // Don't forget to close the WebDriver when done.
        //driver.quit();
    }
}
