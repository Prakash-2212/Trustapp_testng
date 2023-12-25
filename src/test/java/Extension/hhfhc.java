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
import org.openqa.selenium.interactions.Actions;

public class hhfhc {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver.exe");

        String url = "https://www.google.com/";

        // Open Google Chrome and perform actions
        try {
            WebDriver driver = openChrome(url);

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

        // Use JavaScript to navigate to the specified URL in the new tab
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.location.href = '" + newTabUrl + "';");

        // Wait for the page to load (you can use WebDriverWait if needed)
        Thread.sleep(5000);

        // You can continue with additional code in the new tab if needed
    }

    private static WebDriver openChrome(String url) throws IOException {
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
            processBuilder.start();

            // Wait for Chrome to open (adjust this as needed)
            Thread.sleep(5000);

            // Create a new instance of ChromeDriver
            return new ChromeDriver();
        } catch (InterruptedException e) {
            throw new IOException("Failed to open Chrome", e);
        }
    }
}
