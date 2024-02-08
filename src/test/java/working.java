import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.List;

public class working {

    public static void main(String[] args) throws InterruptedException {
        // Set up ChromeDriver executable using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Example usage:
        List<String> extensionPaths = List.of("./Extension/TrustApp 1.1.16.0.crx");
        WebDriver driver = createChromeDriverWithExtensions(extensionPaths);

        // Navigate to a website (replace with the desired URL).
        driver.get("https://twitter.com/home");

        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);

        // locate Username
        WebElement Username = driver.findElement(By.xpath("//input[@name='text']"));

        // to highlight the Chrome_Web_Store
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Username);
        Thread.sleep(2000);

        Username.click();
        Username.clear();
        Username.sendKeys("TrustAppTesting");
        Thread.sleep(3000);

        // locate Next
        WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

        // to highlight the Next
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Next);
        Thread.sleep(2000);

        Next.click();

        Thread.sleep(2000);

        // locate Password
        WebElement Password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
                                                           //input[@name='password']
        // to highlight the Password
        JavascriptExecutor jse3 = (JavascriptExecutor) driver;
        jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Password);
        Thread.sleep(2000);

        Password.click();
        Password.clear();
        Password.sendKeys("TrustApp@4948");
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

     
        
        driver.get("https://twitter.com/TheEconomist");
        Thread.sleep(3000);
        
        
        // locate The_Economist
        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist'][1]"));

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
        Thread.sleep(4000);

    //--------------------------------------------------------------------------------------------------------------------------------------

        driver.get("https://twitter.com/CNN");
        
        Thread.sleep(3000);

        // locate CNN
        WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));
        Thread.sleep(2000);

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
        Thread.sleep(3000);

        // locate Profile
        WebElement Profile = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));

        // to highlight the Profile
        JavascriptExecutor jse11 = (JavascriptExecutor) driver;
        jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile);
        Thread.sleep(2000);

        Profile.click();

//        Thread.sleep(3000);

        // locate Post
        WebElement Post = driver.findElement(By.xpath("//a[@aria-label='Post']"));

        // to highlight the Post
        JavascriptExecutor jse111 = (JavascriptExecutor) driver;
        jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post);
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

        Post_text.sendKeys("https://www.theguardian.com/business/2024/feb/05/boeing-may-delay-more-737-max-deliveries-after-new-production-glitch-found");

        Thread.sleep(3000);

        // locate Post1
        WebElement Post1 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));

        // to highlight the Post1
        JavascriptExecutor jse13 = (JavascriptExecutor) driver;
        jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post1);
        Thread.sleep(2000);

        Post1.click();

        Thread.sleep(2000);

        // locate Profile1
        WebElement Profile1 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));

        // to highlight the Profile1
        JavascriptExecutor jse14 = (JavascriptExecutor) driver;
        jse14.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile1);
        Thread.sleep(2000);

        Profile1.click();

        Thread.sleep(2000);

        jse14.executeScript("window.scrollBy(0,350)", "");

        // locate TrustApp_mark3
        WebElement TrustApp_mark3 = driver.findElement(By.xpath("//div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']"));

        // to highlight the TrustApp_mark
        JavascriptExecutor jse15 = (JavascriptExecutor) driver;
        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark3);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark
        Actions actions2 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark3).perform();
        Thread.sleep(3000);
        
       //-----------------------------------------------------------------------------------------------------------------------------------------------
        
        driver.get("https://twitter.com/TrustApp_Tsting/status/1742067234799821185");
        Thread.sleep(5000);
        
//        
//        //second tweet
//        
//        // locate Post2
//        WebElement Post2 = driver.findElement(By.xpath("//a[@aria-label='Post']"));
//
//        // to highlight the Post
//        JavascriptExecutor jse1112 = (JavascriptExecutor) driver;
//        jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post2);
//        Thread.sleep(2000);
//
//        Post2.click();
//
//        Thread.sleep(3000);
//
//        // locate Post_text2
//        WebElement Post_text2 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
//
//        // to highlight the Post_text2
//        JavascriptExecutor jse122 = (JavascriptExecutor) driver;
//        jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text2);
//        Thread.sleep(2000);
//
//        Post_text2.click();
//        Post_text2.clear();
//
//        Post_text2.sendKeys("https://www.politico.com/news/2024/02/04/fed-powell-debt-sustainability-00139528");
//
//        Thread.sleep(3000);
//
//        // locate Post3
//        WebElement Post3 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
//
//        // to highlight the Post3
//        JavascriptExecutor jse132 = (JavascriptExecutor) driver;
//        jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post3);
//        Thread.sleep(2000);
//
//        Post3.click();
//
//        Thread.sleep(2000);
//
//        // locate Profile2
//        WebElement Profile2 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
//
//        // to highlight the Profile2
//        JavascriptExecutor jse142 = (JavascriptExecutor) driver;
//        jse14.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile2);
//        Thread.sleep(2000);
//
//        Profile2.click();
//
//        Thread.sleep(2000);
//
//        jse14.executeScript("window.scrollBy(0,350)", "");
//
        // locate TrustApp_mark2      //div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']
        WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
        Thread.sleep(3000); 
        
        
        // to highlight the TrustApp_mark2
        JavascriptExecutor jse152= (JavascriptExecutor) driver;
        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark2);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark2
        Actions actions22 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark2).perform();
        Thread.sleep(3000);
//
//       //--------------------------------------------------------------------------------------------------------------------------------------- 
//        
//        //third tweet
//        
//        // locate Post4
//        WebElement Post4 = driver.findElement(By.xpath("//a[@aria-label='Post']"));
//
//        // to highlight the Post4
//        JavascriptExecutor jse1113 = (JavascriptExecutor) driver;
//        jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post4);
//        Thread.sleep(2000);
//
//        Post4.click();
//
//        Thread.sleep(3000);
//
//        // locate Post_text4
//        WebElement Post_text4 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
//
//        // to highlight the Post_text4
//        JavascriptExecutor jse1223 = (JavascriptExecutor) driver;
//        jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text4);
//        Thread.sleep(2000);
//
//        Post_text4.click();
//        Post_text4.clear();
//
//        Post_text4.sendKeys("https://www.economist.com/business/2024/02/04/the-three-threats-to-american-business");
//
//        Thread.sleep(3000);
//
//        // locate Post5
//        WebElement Post5 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
//
//        // to highlight the Post5
//        JavascriptExecutor jse1324 = (JavascriptExecutor) driver;
//        jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post5);
//        Thread.sleep(2000);
//
//        Post5.click();
//
//        Thread.sleep(2000);
//
//        // locate Profile4
//        WebElement Profile4 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
//
//        // to highlight the Profile4
//        JavascriptExecutor jse1424 = (JavascriptExecutor) driver;
//        jse14.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile4);
//        Thread.sleep(2000);
//
//        Profile4.click();
//
//        Thread.sleep(2000);
//
//        jse14.executeScript("window.scrollBy(0,350)", "");
//
//        // locate TrustApp_mark24
//        WebElement TrustApp_mark24 = driver.findElement(By.xpath("//div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']"));
//
//        // to highlight the TrustApp_mark24
//        JavascriptExecutor jse1524= (JavascriptExecutor) driver;
//        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark24);
//        Thread.sleep(2000);
//
//        // Perform a hover action on TrustApp_mark24
//        Actions actions224 = new Actions(driver);
//        actions1.moveToElement(TrustApp_mark24).perform();
//        Thread.sleep(3000);
//
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
//        
        
        
        
        
        
        
        
        
        
        

        // Scroll down
        // js.executeScript("window.scrollBy(0,850)", "");

        // Don't forget to close the WebDriver when done.
//         driver.quit();
    }

    private static WebDriver createChromeDriverWithExtensions(List<String> extensionPaths) {
        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Add extensions to ChromeOptions
        for (String extensionPath : extensionPaths) {
            File extensionFile = new File(extensionPath);
            if (extensionFile.exists()) {
                options.addExtensions(extensionFile);
            } else {
                System.err.println("Extension file not found: " + extensionPath);
            }
        }

        // Create a new ChromeDriver instance with the configured ChromeOptions
        return new ChromeDriver(options);
    }
}
