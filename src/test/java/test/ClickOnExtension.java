package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class ClickOnExtension {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeOptions.
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./Extensions/TrustApp 1.1.12.0.crx"));

        // Create an instance of ChromeDriver with the options.
        WebDriver driver = new ChromeDriver(options);

        // Navigate to a website (replace with the desired URL).
        driver.get("https://twitter.com/home");

        // ... (Your existing code before interacting with the extension) ...

        // Switch to the new tab and interact with the extension
        openNewTab(driver);

        // Continue with the existing code...

        // Close the browser
        driver.quit();
    }

    private static void openNewTab(WebDriver driver) throws InterruptedException, IOException {
        // Your existing code...

        // Open a new tab
        driver.switchTo().newWindow(WindowType.TAB);

        // Navigate to the desired webpage in the new tab
        driver.get("https://twitter.com/home");

        // Perform additional actions in the new tab as needed
        // ...

        // Example: Execute JavaScript to click on the extension icon in the new tab
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("document.getElementById('your-extension-icon-id').click();");

        // Continue with any other actions in the new tab...

        // Close the new tab (if needed)
        driver.close();
    }

    // ... (Continue with the rest of your existing code) ...
}
