package Extension;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Samewindow {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Replace this URL with the desired webpage
        String url = "https://twitter.com/TheEconomist";
        
        

        // Open Google Chrome and perform actions
        try {
            WebDriver driver = openChrome(url);

            // Locate For_You
            By TrustApp = By.xpath("TrustApp");
            WebElement forYou = driver.findElement(TrustApp);

            // Highlight and scroll to the For_You element
            highlightAndScrollToElement(driver, forYou);
            
            driver.navigate().to("https://twitter.com/TheEconomist");

            // Close the browser
            driver.quit();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    private static void highlightAndScrollToElement(WebDriver driver, WebElement TrustApp) {
        // Use Actions class to move to the element and highlight it
        Actions actions = new Actions(driver);

        // Move to the element
        actions.moveToElement(TrustApp).perform();

        // Highlight the element using JavaScript
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].style.border='2px solid red';", TrustApp);

        // Scroll to the element using Actions class
        actions.moveToElement(TrustApp).perform();
        actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();

        // Wait for a moment to see the scroll and hover effect (adjust this as needed)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Restore the original style
        jsExecutor.executeScript("arguments[0].style.border='';", TrustApp);
    }
}
