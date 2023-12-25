package Extension;

import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class openingonetab {
   
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        options.addArguments("--proxy-server=http://your-proxy-server:port");
        options.addArguments("--headless"); // Add this line for headless mode

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

       
        //locate searchbar
     
     		WebElement searchbar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
     		Thread.sleep(8000);

     		// to highlight the searchbar
     		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
     		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", searchbar);
     		Thread.sleep(4000);

        
    }

    private static WebDriver openChrome(String url, ChromeOptions options) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder processBuilder;

        if (os.contains("win")) {
            // Windows
            processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "chrome", url);
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            // Unix/Linux/Mac
            processBuilder = new ProcessBuilder("google-chrome", url);
        } else {
            throw new UnsupportedOperationException("Unsupported operating system");
        }

        try {
            // Start Chrome with the provided options
            processBuilder.start();

            // Wait for Chrome to open (adjust this as needed)
            Thread.sleep(5000);

            // Create a new instance of ChromeDriver with options
            return new ChromeDriver(options);
        } catch (InterruptedException e) {
            throw new IOException("Failed to open Chrome", e);
        }
    }
}
