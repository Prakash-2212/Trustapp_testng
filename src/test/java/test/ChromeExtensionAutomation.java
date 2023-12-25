package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeExtensionAutomation {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the ChromeDriver executable.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		// "C:\Users\praka\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
		
		// Create an instance of ChromeOptions.
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("./Extensions/TrustApp.crx"));

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

		Thread.sleep(15000);

		
		// driver.navigate().refresh();
		 Thread.sleep(1000);
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(3000);
		 
		 
		 
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,450)", "");
		 Thread.sleep(3000);
		 
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,550)", "");
		 Thread.sleep(3000);
		 
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,650)", "");
		 Thread.sleep(3000);
		 
		 
		// locate Search_bar
			WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));

			// to highlight the Log_in
			JavascriptExecutor jse5 = (JavascriptExecutor) driver;
			jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar);
			Thread.sleep(2000);

			Search_bar.click();
			Search_bar.clear();
			Thread.sleep(1000);
			
			Search_bar.sendKeys("The Economist");
			Thread.sleep(1000);
			
			Search_bar.sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			
			
			// locate The_Economist
			WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='The Economist']"));

			// to highlight the The_Economist
			JavascriptExecutor jse6 = (JavascriptExecutor) driver;
			jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", The_Economist);
			Thread.sleep(2000);

			The_Economist.click();
			 js.executeScript("window.scrollBy(0,550)", "");
			 Thread.sleep(3000);
		 
		 
				// locate TrustApp_mark
				WebElement TrustApp_mark = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

				// to highlight the TrustApp_mark
				JavascriptExecutor jse7 = (JavascriptExecutor) driver;
				jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark);
				Thread.sleep(2000);
				
				
		 
				
				
				
				js.executeScript("window.scrollBy(0,850)", "");
		// Don't forget to close the WebDriver when done.
		// driver.quit();
	}
}
