import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class UICLONE {

    public static void main(String[] args) {
        // Set up ChromeDriver executable using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Example usage:
        List<String> extensionPaths = List.of("./Extension/TrustApp 1.1.16.0.crx");
        WebDriver driver = createChromeDriverWithExtensions(extensionPaths);

        // Navigate to Twitter homepage
        driver.get("https://twitter.com/home");

        WebDriverWait wait = new WebDriverWait(driver, 10); // Wait up to 10 seconds

        // locate Username
        WebElement username = driver.findElement(By.xpath("//input[@name='text']"));
        wait.until(ExpectedConditions.visibilityOf(username));

        // Highlight the username field
        highlightElement(driver, username);

        // Input username
        username.click();
        username.clear();
        username.sendKeys("TrustAppTesting");

        // locate Next button
        WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));

        // Highlight the Next button
        highlightElement(driver, nextButton);

        // Click Next
        nextButton.click();

        // locate Password field
        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(password));

        // Highlight the Password field
        highlightElement(driver, password);

        // Input password
        password.click();
        password.clear();
        password.sendKeys("TrustApp@4948");

        // locate Log in button
        WebElement loginButton = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));

        // Highlight the Log in button
        highlightElement(driver, loginButton);

        // Click Log in
        loginButton.click();

        // Wait for the home page to load
        wait.until(ExpectedConditions.urlContains("https://twitter.com/home"));

        // Rest of your code...
    }

    // Method to create a ChromeDriver with extensions
    private static WebDriver createChromeDriverWithExtensions(List<String> extensionPaths) {
        ChromeOptions options = new ChromeOptions();
        for (String path : extensionPaths) {
            options.addExtensions(new File(path));
        }
        return new ChromeDriver(options);
    }

    // Method to highlight an element using JavaScript
    private static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", element);
    }
}
