package test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class ChromeExtensionAutomation {
	public static void main(String[] args) throws InterruptedException {
		// Set the path to the ChromeDriver executable.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
		
		// "C:\Users\praka\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
		// Create an instance of ChromeOptions.
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/TrustApp 1.1.12.0.crx"));
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
		Thread.sleep(2000);
		// Don't forget to close the WebDriver when done.
		// driver.quit();
	}
}
