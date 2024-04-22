package Parallel;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
	private static WebDriver driver;

	@BeforeSuite
	public static void setUp() {
		// Set up ChromeDriver executable using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create ChromeDriver instance with extensions
		driver = createChromeDriverWithExtensions("./Extension/TrustApp 1.2.3.0.crx");
	}

	@AfterSuite
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	private static WebDriver createChromeDriverWithExtensions(String extensionPath) {
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Add extension to ChromeOptions
		File extensionFile = new File(extensionPath);
		if (extensionFile.exists()) {
			options.addExtensions(extensionFile);
			try {
				// Introduce a delay
				Thread.sleep(12000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Extension file not found: " + extensionPath);
		}

		// Create a new ChromeDriver instance with the configured ChromeOptions
		return new ChromeDriver(options);
	}

	@BeforeMethod
	public void maximizeWindow() throws InterruptedException {
		if (driver != null) {
			driver.manage().window().maximize();

		}
	}

	// ------------------------------------------------------------------------------
	@Test(priority = 1)
	public void TheEconomist10001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TheEconomist");

		driver.manage().window().maximize();

		Thread.sleep(12000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);

		// locate The_Economist
		WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist'][1]"));
		Thread.sleep(3000);

		// to highlight the The_Economist
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				The_Economist);
		Thread.sleep(1000);

		jse1.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions = new Actions(driver);
		actions.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver
				.findElement(By.xpath("//div[@class='tag green'][normalize-space()='Trusted Source']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse100 = (JavascriptExecutor) driver;
		jse100.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// greengetText();
		System.out.print("\033[1m1. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[@href='https://www.economist.com/']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the text
		System.out.println("Publisher: " + Publisher1);
		

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse10001 = (JavascriptExecutor) driver;
		jse10001.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("Verified_Tweet: " + messageText1);

		// expected output
		String expectedOutput = "This post contains information from The Economist, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("Verified_Tweet test case PASSED");
		} else {
			System.out.println("Verified_Tweet test case FAILED");
			Assert.fail("Verified_Tweet test case FAILED"); // Fail the test case if the text does not match the
															// expected output
		}
	}
//----------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 2)
	public void testCase20001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764532013707546955");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath(
				"//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m2. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate official_account
		WebElement official_account = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the official account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				official_account);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String official_account1 = official_account.getText();

		// Print the Publisher1
		System.out.println("official_account: " + official_account1);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[@class='container-body']//div[@class='text']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.Also, this post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 3)
	public void testCase20002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764532662671155474");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath(
				"//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m2. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate official_account
		WebElement official_account = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the official account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				official_account);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String official_account1 = official_account.getText();

		// Print the Publisher1
		System.out.println("official_account: " + official_account1);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[@class='container-body']//div[@class='text']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.Also, this post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}

	// -------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 4)
	public void testCase20003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764532864975081931");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath(
				"//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m3. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate official_account
		WebElement official_account = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the official account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				official_account);
		Thread.sleep(1000);

		// Get the text of official_account
		String official_account1 = official_account.getText();

		// Print the Publisher1
		System.out.println("official_account: " + official_account1);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[@class='container-body']//div[@class='text']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.Also, this post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 5)
	public void testCase20004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764533090884489244");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath(
				"//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m4. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate official_account
		WebElement official_account = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the official account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				official_account);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String official_account1 = official_account.getText();

		// Print the Publisher1
		System.out.println("official_account: " + official_account1);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[@class='container-body']//div[@class='text']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.Also, this post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 6)
	public void testCase20005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764533281595302199");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m5. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate official_account
		WebElement official_account = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the official account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				official_account);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String official_account1 = official_account.getText();

		// Print the Publisher1
		System.out.println("official_account: " + official_account1);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[@class='container-body']//div[@class='text']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.Also, this post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 7)
	public void testCase40001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/Kushagra3837/status/1763125078634463343");

		driver.manage().window().maximize();

		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath(
				"//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m6. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate reference_publisher
		WebElement reference_publisher = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the reference_publisher
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_publisher);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String reference_publisher1 = reference_publisher.getText();

		// Print the Publisher1
		System.out.println("reference_publisher: " + reference_publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("TrustApp_message1: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------


}
