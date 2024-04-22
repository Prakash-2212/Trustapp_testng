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
import java.io.File;


public class username_match {

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

		Thread.sleep(12000);

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
			// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 3)
	public void testCase20002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764532662671155474");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		Thread.sleep(12000);

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

		Thread.sleep(12000);

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
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 6)
	public void testCase20005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764533281595302199");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m6. STATUS\033[0m: ");
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
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 7)
	public void testCase40001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/Kushagra3837/status/1763125078634463343");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m7. STATUS\033[0m: ");
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
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 8)
	public void testCase40002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763460686426902906");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m8. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

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
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 9)
	public void testCase40003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763461161905725821");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m9. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

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
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 10)
	public void testCase40004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763462133981806730");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m10. STATUS\033[0m: ");
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
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 11)
	public void testCase40005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763462602829545887");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m11. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

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
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 12)
	public void testCase50001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764535028443160755");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m12. STATUS\033[0m: ");
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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 13)
	public void testCase50002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764535654690472177");

		driver.manage().window().maximize();

		Thread.sleep(13000);

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

		System.out.print("\033[1m13. STATUS\033[0m: ");
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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 14)
	public void testCase50003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764536169214218585");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m14. STATUS\033[0m: ");
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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 15)
	public void testCase50004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764536484952936836");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m15. STATUS\033[0m: ");
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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 16)
	public void testCase50005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764536783356805536");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m16. STATUS\033[0m: ");
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

		// Print the official_account
		System.out.println("official_account: " + official_account1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 17)
	public void testCase60001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/AJEnglish/status/1765170015622357427");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m17. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[contains(text(),'Al Jazeera English')]"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post contains information from Al Jazeera English, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 18)
	public void testCase60002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TheEconomist/status/1763186888498626767");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m18. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[contains(text(),'The Economist')]"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post contains information from The Economist, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 19)
	public void testCase60003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/NPR/status/1646138100035272704");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m19. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[contains(text(),'NPR')]"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post contains information from NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 20)
	public void testCase60004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/FoxNews/status/1765268598866493941");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m20. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[contains(text(),'Fox News')]"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post contains information from Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 21)
	public void testCase60005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/CNBC/status/1765262230612828186");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m21. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[contains(text(),'CNBC')]"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post contains information from CNBC, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 22)
	public void testCase70001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/RoberDavis15576/status/1765279128129822931");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m22. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post references Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 23)
	public void testCase70002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/RoberDavis15576/status/1765278726512635952");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m23. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post references CBC News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 24)
	public void testCase70003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/RoberDavis15576/status/1765279128129822931");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m24. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post references Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 25)
	public void testCase70004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/RoberDavis15576/status/1765279374603911395");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m25. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post references The Economist, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 26)
	public void testCase70005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/RoberDavis15576/status/1765279791689638029");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m26. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_item_publisher
		WebElement News_item_publisher = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_item_publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = News_item_publisher.getText();

		// Print the Publisher1
		System.out.println("News_item_publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post references Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 27)
	public void testCase80001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764537320164765743");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m25. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 28)
	public void testCase80002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764537687476674873");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m26. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 29)
	public void testCase80003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764538108287062231");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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

		System.out.print("\033[1m27. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 30)
	public void testCase80004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764538493781315744");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m28. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 31)
	public void testCase80005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764538667865882910");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m29. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 32)
	public void testCase10001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/Kushagra3837/status/1763125746334077001");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m30. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
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
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 33)
	public void testCase10002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763502679630758159");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m31. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
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
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 34)
	public void testCase10003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763503133353754866");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m32. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
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
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------
	@Test(priority = 35)
	public void testCase10004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763504374435742010");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m33. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
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
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 36)
	public void testCase10005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763504680229871646");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m34. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
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
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 37)
	public void testCase11001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764542808067576245");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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

		System.out.print("\033[1m35. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 38)
	public void testCase11002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764544573479456967");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m36. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 39)
	public void testCase11003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764544763003371991");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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

		System.out.print("\033[1m37. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 40)
	public void testCase11004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764545017987596379");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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

		System.out.print("\033[1m38. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 41)
	public void testCase11005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/cnn1188251/status/1764545399879094571");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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

		System.out.print("\033[1m39. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate Official_Publisher
		WebElement Official_Publisher = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				Official_Publisher);
		Thread.sleep(1000);

		// Get the text of News_item_publisher
		String News_item_publisher1 = Official_Publisher.getText();

		// Print the Publisher1
		System.out.println("Official_Publisher: " + News_item_publisher1);

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
		String expectedOutput = "This post is from '@cnn1188251', but shows the name of 'CNN' with the profile image of 'CNN'. Note that the official account of 'CNN' is 'CNN'. Please be conscious this might be a fake account.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 42)
	public void testCase13001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/Kushagra3837/status/1752696933611945996");

		driver.manage().window().maximize();

		Thread.sleep(14000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m40. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate reference_Publisher
		WebElement reference_Publisher = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_item_publisher account
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				reference_Publisher);
		Thread.sleep(1000);

		// Get the text of reference_Publisher
		String reference_Publisher1 = reference_Publisher.getText();

		// Print the Publisher1
		System.out.println("reference_Publisher: " + reference_Publisher);

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
		String expectedOutput = "This post references BBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 43)
	public void testCase13002() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763508611890696210");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m41. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

//		// locate reference_Publisher
//		WebElement reference_Publisher = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
//		Thread.sleep(1000);
//
//		// to highlight the News_item_publisher account
//		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
//		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				reference_Publisher);
//		Thread.sleep(1000);
//
//		// Get the text of reference_Publisher
//		String reference_Publisher1 = reference_Publisher.getText();
//
//		// Print the Publisher1
//		System.out.println("reference_Publisher: " + reference_Publisher);

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
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 44)
	public void testCase13003() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763509824296247318");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m42. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

//		// locate reference_Publisher
//		WebElement reference_Publisher = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
//		Thread.sleep(1000);
//
//		// to highlight the News_item_publisher account
//		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
//		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				reference_Publisher);
//		Thread.sleep(1000);
//
//		// Get the text of reference_Publisher
//		String reference_Publisher1 = reference_Publisher.getText();
//
//		// Print the Publisher1
//		System.out.println("reference_Publisher: " + reference_Publisher);

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
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	} // --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 45)
	public void testCase13004() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763510229520593060");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m43. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

//		// locate reference_Publisher
//		WebElement reference_Publisher = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
//		Thread.sleep(1000);
//
//		// to highlight the News_item_publisher account
//		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
//		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				reference_Publisher);
//		Thread.sleep(1000);
//
//		// Get the text of reference_Publisher
//		String reference_Publisher1 = reference_Publisher.getText();
//
//		// Print the Publisher1
//		System.out.println("reference_Publisher: " + reference_Publisher);

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
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

	@Test(priority = 46)
	public void testCase13005() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TrustAppTesting/status/1763510622543577475");

		driver.manage().window().maximize();

		Thread.sleep(12000);

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
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse11 = (JavascriptExecutor) driver;
		jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus3 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		// Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match
		// expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m44. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

//		// locate reference_Publisher
//		WebElement reference_Publisher = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
//		Thread.sleep(1000);
//
//		// to highlight the News_item_publisher account
//		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
//		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				reference_Publisher);
//		Thread.sleep(1000);
//
//		// Get the text of reference_Publisher
//		String reference_Publisher1 = reference_Publisher.getText();
//
//		// Print the Publisher1
//		System.out.println("reference_Publisher: " + reference_Publisher);

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
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println(" test case PASSED");
		} else {
			System.out.println(" test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
