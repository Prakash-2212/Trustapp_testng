package Extension;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class openingonetab {

    public static void main(String[] args) throws InterruptedException {
//        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\praka\\\\Downloads\\\\chromedriver_win32 (17)\\\\chromedriver.exe");
        
    	
       ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
//        options.addArguments("--proxy-server=http://your-proxy-server:port");
//        options.addArguments("--headless"); // Add this line for headless mode

        String url = "https://twitter.com/";

        // Open Google Chrome and perform actions
        try {
            WebDriver driver = openChrome(url, options);

            Thread.sleep(6000);

            // Open a new tab and switch to "twitter.com"
            openNewTab(driver, "https://twitter.com/");

            // Close the browser
            driver.quit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void openNewTab(WebDriver driver, String newTabUrl) throws InterruptedException {
        // Use Actions class to simulate keyboard shortcut for opening a new tab (Ctrl + t)
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();

        // Wait for the new tab to open
        Thread.sleep(2000);

        // Switch to the new tab using window handles
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        handles.remove(currentHandle);

        // Assume there is only one new window
        String newTabHandle = handles.iterator().next();
        driver.switchTo().window(newTabHandle);

        // Wait for the page to load (you can use WebDriverWait if needed)
        Thread.sleep(5000);

      
    }

    private static WebDriver openChrome(String url, ChromeOptions options) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver(options);

        // Wait for Chrome to open (you may need to adjust this as needed)
        Thread.sleep(5000);

//        // Locate Search_bar
//        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//
//        // to highlight the Log_in
//        JavascriptExecutor jse5 = (JavascriptExecutor) driver;
//        jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar);
//        Thread.sleep(2000);
//
//        Search_bar.click();
//        Search_bar.clear();
//        Thread.sleep(1000);
//
//        Search_bar.sendKeys("The Economist");
//        Thread.sleep(5000);

        return driver;
    }
}
