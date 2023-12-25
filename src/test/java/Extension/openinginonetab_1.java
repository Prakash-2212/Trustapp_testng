package Extension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class openinginonetab_1 {

	 public static void main(String[] args) throws InterruptedException {
	        // Set the path to the ChromeDriver executable.
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        options.addArguments("--proxy-server=http://your-proxy-server:port");
        options.addArguments("--headless"); // Add this line for headless mode

        // Open Google Chrome and perform actions
        try {
            WebDriver driver = new ChromeDriver(options);

            // Open a new tab and switch to "twitter.com"
            openNewTab(driver, "https://twitter.com/");

            // Close the browser
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void openNewTab(WebDriver driver, String newTabUrl) {
        // Use Actions class to simulate keyboard shortcut for opening a new tab (Ctrl + t)
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).perform();

        // Wait for the new tab to open
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        // Switch to the new tab using window handles
        Set<String> handles = driver.getWindowHandles();
        String currentHandle = driver.getWindowHandle();
        handles.remove(currentHandle);

        // Assume there is only one new window
        String newTabHandle = handles.iterator().next();
        driver.switchTo().window(newTabHandle);

        // Wait for the page to load (you can use WebDriverWait if needed)
        wait.until(ExpectedConditions.urlToBe(newTabUrl));

        // Locate search bar
        WebElement searchbar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Search']")));

        // Highlight the search bar
        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
        jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", searchbar);
    }
}
