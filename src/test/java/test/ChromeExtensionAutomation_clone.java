package test;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ChromeExtensionAutomation_clone {

    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions option = new ChromeOptions();
        // Set the path to the ChromeDriver executable.
        option.setBinary("C:\\Users\\praka\\Downloads\\chromedriver_win32 (17)\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver(option);

        String url = "https://twitter.com/TheEconomist";
        String extensionId = "gbjgcjcomfhmleglhdfgibgnmplodedb"; // Replace with your extension ID

        WebDriver driver = openChromeWithExtension(url, extensionId);

        driver.get("https://twitter.com/home");

        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Username = driver.findElement(By.xpath("//input[@name='text']"));
        highlightElement(driver, Username);
        Thread.sleep(2000);
        Username.click();
        Username.clear();
        Username.sendKeys("TrustAppTesting");
        Thread.sleep(3000);

        WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        highlightElement(driver, Next);
        Thread.sleep(2000);
        Next.click();

        Thread.sleep(2000);

        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        highlightElement(driver, Password);
        Thread.sleep(2000);
        Password.click();
        Password.clear();
        Password.sendKeys("TrustApp@4948");
        Thread.sleep(2000);

        WebElement Log_in = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        highlightElement(driver, Log_in);
        Thread.sleep(2000);
        Log_in.click();

        Thread.sleep(15000);

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

        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        highlightElement(driver, Search_bar);
        Thread.sleep(2000);
        Search_bar.click();
        Search_bar.clear();
        Thread.sleep(1000);
        Search_bar.sendKeys("The Economist");
        Thread.sleep(1000);
        Search_bar.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist']"));
        highlightElement(driver, The_Economist);
        Thread.sleep(2000);
        The_Economist.click();
        Thread.sleep(3000);

        WebElement TrustApp_mark = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));
        highlightElement(driver, TrustApp_mark);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(TrustApp_mark).perform();

        WebElement Search_bar1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        highlightElement(driver, Search_bar1);
        Thread.sleep(2000);
        Search_bar1.click();
        Search_bar1.clear();
        Thread.sleep(1000);
        Search_bar1.sendKeys("CNN");
        Thread.sleep(2000);
        Search_bar1.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));
        highlightElement(driver, CNN);
        Thread.sleep(2000);
        CNN.click();
        Thread.sleep(3000);

        WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));
        highlightElement(driver, TrustApp_mark1);
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark1).perform();

        WebElement Profile = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
        highlightElement(driver, Profile);
        Thread.sleep(2000);
        Profile.click();

        Thread.sleep(3000);

        WebElement Post = driver.findElement(By.xpath("//a[@aria-label='Post']"));
        highlightElement(driver, Post);
        Thread.sleep(2000);
        Post.click();

        Thread.sleep(3000);

        WebElement Post_text = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
        highlightElement(driver, Post_text);
        Thread.sleep(2000);
        Post_text.click();
        Post_text.clear();
        Post_text.sendKeys("https://www.economist.com/interactive/international/2023/08/03/western-values-are-steadily-diverging-from-the-rest-of-the-world");

        Thread.sleep(4000);

        WebElement Post1 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
        highlightElement(driver, Post1);
        Thread.sleep(2000);
        Post1.click();

        Thread.sleep(2000);

        WebElement Profile1 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
        highlightElement(driver, Profile1);
        Thread.sleep(2000);
        Profile1.click();

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,350)", "");

        WebElement TrustApp_mark3 = driver.findElement(By.xpath("//div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']"));
        highlightElement(driver, TrustApp_mark3);
        Thread.sleep(2000);
        Actions actions2 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark3).perform();
    }

    private static WebDriver openChromeWithExtension(String url, String extensionId) {
        ChromeOptions options = new ChromeOptions();
     options.addExtensions(new File("./Extensions/TrustApp 1.1.14.0.crx"));
//      options.addArguments("--load-extension=" + extensionId);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        return driver;
    }

    private static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", element);
    }
}

  //C:\Users\praka\AppData\Local\Google\Chrome\User Data\Default\Extensions
