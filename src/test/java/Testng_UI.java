import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.util.List;

public class Testng_UI {

	private static WebDriver driver;

	@BeforeSuite
	public static void setUp() {
		// Set up ChromeDriver executable using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Create ChromeDriver instance with extensions
		driver = createChromeDriverWithExtensions("./Extension/TrustApp 1.1.17.0.crx");
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
				// Introduce a delay of 7 seconds
				Thread.sleep(7000);
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
	public void maximizeWindow() {
		if (driver != null) {
			driver.manage().window().maximize();
		}
	}

	// added total 190 test cases

	// ---------------------------------------------------------------------
	// Verified_Tweet
	@Test(priority = 0)
	public void TheEconomist0001() throws InterruptedException {
		// Navigate to a website).
		driver.get("https://twitter.com/TheEconomist");

		driver.manage().window().maximize();

		Thread.sleep(7000);

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

	// ------------------------------------------------------------------------------------------------------------------------------------------
//Verified_Tweet
	@Test(priority = 1)
	public void CNN0002() throws InterruptedException {
		driver.get("https://twitter.com/CNN");

		Thread.sleep(7000);

		// locate CNN
		WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));
		Thread.sleep(5000);

		// to highlight the CNN
		JavascriptExecutor jse9 = (JavascriptExecutor) driver;
		jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", CNN);
		Thread.sleep(2000);

		jse9.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse10 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse1001 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m2. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus2 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("(//a[normalize-space()='CNN'])[5]"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse10222 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse10002 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("Verified_Tweet: " + messageText2);

		// expected output
		String expectedOutput = "This post contains information from CNN, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("Verified_Tweet test case PASSED");
		} else {
			System.out.println("Verified_Tweet test case FAILED");
			Assert.fail("Verified_Tweet test case FAILED"); // Fail the test case if the text does not match the
															// expected output
		}
	}
	// -----------------------------------------------------------------------------

	// NO_URL_TO_VERIFY

	@Test(priority = 2)
	public void NO_URL_TO_VERIFY30001() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742067234799821185");
		Thread.sleep(7000);

		//
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
		Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m3. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse12 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

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
		System.out.println("NO_URL_TO_VERIFY: " + messageText1);

		// Define the expected output
		String expectedOutput = "This post contains information from CNN, one of your trusted sources. However, there is no reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case PASSED");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case FAILED");
			Assert.fail("NO_URL_TO_VERIFY test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY
	@Test(priority = 3)
	public void NO_URL_TO_VERIFY30002() throws InterruptedException {
		driver.get("https://twitter.com/Kushagra3837/status/1737838697738129837");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse21 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus4 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m4. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus4 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse22 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText2);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case PASSED");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case FAILED");
			Assert.fail("NO_URL_TO_VERIFY test case FAILED");
		}
	}

	// ------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY
	@Test(priority = 4)
	public void NO_URL_TO_VERIFY30003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742127483397267594");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse13 = (JavascriptExecutor) driver;
		jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions13 = new Actions(driver);
		actions13.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1003 = (JavascriptExecutor) driver;
		jse1003.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus5 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m5. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus5 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse103 = (JavascriptExecutor) driver;
		jse103.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText3);

		// expected output
		String expectedOutput = "This post contains information from CNN, one of your trusted sources. However, there is no reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case PASSED");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case FAILED");
			Assert.fail("NO_URL_TO_VERIFY test case FAILED");
		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY

	@Test(priority = 4)
	public void NO_URL_TO_VERIFY30004() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742140306458317169");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse104 = (JavascriptExecutor) driver;
		jse104.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions22 = new Actions(driver);
		actions22.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1004 = (JavascriptExecutor) driver;
		jse1004.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus6 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus6, expectedStatus, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m6. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus6 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1034 = (JavascriptExecutor) driver;
		jse1004.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText4);

		// Define the expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case PASSED");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case FAILED");
			Assert.fail("NO_URL_TO_VERIFY test case FAILED");
		}
	}
	// ---------------------------------------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY
	@Test(priority = 5)
	public void NO_URL_TO_VERIFY30005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742140892645863512");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse15 = (JavascriptExecutor) driver;
		jse15.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions15 = new Actions(driver);
		actions15.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1005 = (JavascriptExecutor) driver;
		jse1005.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus7 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus = "Unreferenced";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus7, expectedStatus, "Status does not match expected");

		System.out.print("\033[1m7. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus7 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse105 = (JavascriptExecutor) driver;
		jse105.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText5);

		// expected output
		String expectedOutput = "This post contains information from NPR, one of your trusted sources. However, there is no reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case PASSED");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case FAILED");
			Assert.fail("NO_URL_TO_VERIFY test case FAILED");
		}
	}

//	// ------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 6)
	public void NO_URL_TO_VERIFY_Negative30006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745701310853247198");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse16 = (JavascriptExecutor) driver;
		jse16.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions16 = new Actions(driver);
		actions16.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus8 = Widget_Status6.getText();

		// Define an unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m8. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus8 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText6);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}
//
	// ----------------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 7)
	public void NO_URL_TO_VERIFY_Negative30007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747501678343966806");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions17 = new Actions(driver);
		actions17.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(7000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1007 = (JavascriptExecutor) driver;
		jse1007.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus9 = Widget_Status7.getText();

		// Define an unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m9. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus9 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse107 = (JavascriptExecutor) driver;
		jse107.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText7);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}

	// -----------------------------------------------------------------------------------------------------------------
	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 8)
	public void NO_URL_TO_VERIFY_Negative30008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747501678343966806");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions17 = new Actions(driver);
		actions17.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(7000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1007 = (JavascriptExecutor) driver;
		jse1007.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus9 = Widget_Status7.getText();

		// Define an unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m10. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus9 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse107 = (JavascriptExecutor) driver;
		jse107.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText7);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}

//	// ---------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 9)
	public void NO_URL_TO_VERIFY_Negative30009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1750407127330373798");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse19 = (JavascriptExecutor) driver;
		jse19.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions19 = new Actions(driver);
		actions19.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(9000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(900);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse1009.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus11 = Widget_Status9.getText();

		// Define the unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m11. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus11 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText9);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}

	// -------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 10)
	public void NO_URL_TO_VERIFY30010_Negative30010() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750407992170750125");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse110 = (JavascriptExecutor) driver;
		jse110.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions110 = new Actions(driver);
		actions110.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(10000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10010 = (JavascriptExecutor) driver;
		jse10010.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus12 = Widget_Status10.getText();

		// Define the unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m12. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus12 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1010 = (JavascriptExecutor) driver;
		jse1010.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText10);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}

//	// -----------------------------------------------------------------------------------------------------------

	// NO_URL_TO_VERIFY (Negative Test Case)
	@Test(priority = 11)
	public void NO_URL_TO_VERIFY_Negative30011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760189492990714317");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(10000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse11011 = (JavascriptExecutor) driver;
		jse11011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus13 = Widget_Status11.getText();

		// Define the unexpected status text
		String unexpectedStatus = "Referenced";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status unexpectedly matches");

		System.out.print("\033[1m13. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1111 = (JavascriptExecutor) driver;
		jse1111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText11);

		// expected output
		String expectedOutput = "This post does not have any reference for us to verify.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("NO_URL_TO_VERIFY test case FAILED (Unexpected outcome)");
		} else {
			System.out.println("NO_URL_TO_VERIFY test case PASSED (As expected)");
		}
	}

	// --------------------------------------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 12)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT40001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775226836971778?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse401 = (JavascriptExecutor) driver;
		jse401.executeScript("arguments[0].setAttribute('style','background: pink; border: 1px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions action401 = new Actions(driver);
		action401.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse4001 = (JavascriptExecutor) driver;
		jse4001.executeScript("arguments[0].setAttribute('style','background: pink; border: 1px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus14 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus1 = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus1, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m14. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus14 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse40011 = (JavascriptExecutor) driver;
		jse40011.executeScript("arguments[0].setAttribute('style','background: pink; border: 1px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText1);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 13)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT40002() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760893756947988747");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(2000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse402 = (JavascriptExecutor) driver;
		jse402.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				TrustApp_mark2);
		Thread.sleep(2000);

		// Perform a hover action on TrustApp_mark2
		Actions action202 = new Actions(driver);
		action202.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse4022 = (JavascriptExecutor) driver;
		jse4022.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus15 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus2 = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus2, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m15. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse2032 = (JavascriptExecutor) driver;
		jse2032.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText2);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------

	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 14)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT40003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760893756947988747");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(2000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse402 = (JavascriptExecutor) driver;
		jse402.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				TrustApp_mark2);
		Thread.sleep(2000);

		// Perform a hover action on TrustApp_mark2
		Actions action202 = new Actions(driver);
		action202.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse4022 = (JavascriptExecutor) driver;
		jse4022.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus16 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus2 = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus2, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m16. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse2032 = (JavascriptExecutor) driver;
		jse2032.executeScript("arguments[0].setAttribute('style','background: pink; border: 2px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText2);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
		}
	}

//--------------------------------------------------------------------------------------------

	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 15)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT40004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742418602819498016");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse403 = (JavascriptExecutor) driver;
		jse403.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);
		// Perform a hover action on TrustApp_mark4
		Actions action403 = new Actions(driver);
		action403.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus17 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus3 = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus3, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m17. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 16)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT40005() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760980728429621298");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus18 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus3 = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus3, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m18. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus18 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 17)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745709777345495045");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus19 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m19. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------

	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 18)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747525349917839833");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus20 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus20, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m20. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus20 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 19)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750408383713177954");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus21 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus21, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m21. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus21 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 20)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40009() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750408767336837239");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus22 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus22, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m22. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus22 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 21)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40010() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750409234393477217");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus23 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus23, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m23. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus23 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_IMAGE_ATTACHMENT
	@Test(priority = 22)
	public void CANNOT_VERIFY_IMAGE_ATTACHMENT_Negative40011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1762035333611302950");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse303 = (JavascriptExecutor) driver;
		jse303.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions action303 = new Actions(driver);
		action303.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(3000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse3003 = (JavascriptExecutor) driver;
		jse3003.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus24 = Widget_Status3.getText();

		// Define the expected status text
		String unexpectedStatus3 = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus24, unexpectedStatus3, "Status unexpectedly matches");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m24. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus24 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse3033 = (JavascriptExecutor) driver;
		jse3033.executeScript("arguments[0].setAttribute('style','background: pink; border: 3px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is an image, and TrustApp does not support verification of image attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// ------------------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 23)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT5001() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754388754658218354");
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
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(1000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status1
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m25. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus1 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText1);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
		}
	}

	// -------------------------------------------------------------------------------------------------------------------------------------
	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 24)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT5002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775350585696281?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(1000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status2
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m26. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus2 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText2);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 25)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT5003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757359834570121700");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status3
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m27. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText3);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
		}
	}
//-------------------------------------------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 26)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT5004() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757361308205199685");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(1000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status4
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m28. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus4 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText4);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 27)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT5005() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757361626909409518");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark22
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(1000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status5
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m29. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus5 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText5);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
			Assert.fail("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED");
		}
	}

	// --------------------------------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 28)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5006() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757362102535082154");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(1000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status6
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus6, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m30. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus6 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText6);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// -----------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 29)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5007() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757362453728407610");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse17 = (JavascriptExecutor) driver;
		jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(1000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status7
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse10022.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus7, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m31. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus7 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse10022.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse1022.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText7);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}
	// -----------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 30)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757362972727365918");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(1000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status8
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m32. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus8 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText8);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}
	// -----------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 31)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757363541277905012");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(1000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status9
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m33. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus9 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher22
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher22
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText9);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 32)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757364073396658575");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(1000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus10, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m34. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus10 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText10);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}
	// ----------------------------------------------------

	// CANNOT_VERIFY_VIDEO_ATTACHMENT
	@Test(priority = 33)
	public void CANNOT_VERIFY_VIDEO_ATTACHMENT_Negative5011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760190053072961889");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse122 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions122 = new Actions(driver);
		actions122.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(1000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2200);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m35. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus11 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver
				.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
		jse122.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message22
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText11);

		// expected output
		String expectedOutput = "The attachment for this post is a video, and TrustApp does not support verification of video attachments yet. Coming soon!";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT test case PASSED (As expected)");

		}
	}
	// ---------------------------------------------------------------------------------------

	// PUBLISHER_MATCH
	@Test(priority = 34)
	public void PUBLISHER_MATCH60001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus1 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus1, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m36. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText1);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 35)
	public void PUBLISHER_MATCH60002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus2 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus2, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m37. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus2 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText2);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 36)
	public void PUBLISHER_MATCH60003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757366259140755898");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus3 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus3, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m38. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText3);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 37)
	public void PUBLISHER_MATCH60004() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1762712226270482496");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus4 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus4, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m39. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus4 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText4);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 38)
	public void PUBLISHER_MATCH60005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742145170143875334");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus5 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus5, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m40. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus5 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText5);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 39)
	public void PUBLISHER_MATCH_Negative60006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745714400252834137");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus6 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus6, unexpectedStatus6, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m41. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus6 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText6);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 40)
	public void PUBLISHER_MATCH_Negative60007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747526586780241978");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus7 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus7, unexpectedStatus7, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m42. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus7 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText7);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 41)
	public void PUBLISHER_MATCH_Negative60008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750411546398777377");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus8 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus8, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m43. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus8 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText8);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 42)
	public void PUBLISHER_MATCH_Negative60009() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750415170042515729");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus9 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus9, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m44. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus9 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver
				.findElement(By.xpath("//a[normalize-space()='The Wall Street Journal']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText9);

		// expected output
		String expectedOutput = "This post references The Wall Street Journal, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 43)
	public void PUBLISHER_MATCH_Negative60010() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750416027060441464");
		Thread.sleep(12000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus10 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus10, unexpectedStatus10, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m45. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus10 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='The Washington Post']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText10);

		// expected output
		String expectedOutput = "This post references The Washington Post, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 44)
	public void PUBLISHER_MATCH_Negative60011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760191282268209498");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus11 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus11, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m46. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus11 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText11);

		// expected output
		String expectedOutput = "This post references BBC, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 45)
	public void EXACT_HEADLINE_MATCH70001() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737777541266469017?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m47. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText1);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED");
			Assert.fail("EXACT_HEADLINE_MATCH test case FAILED");
		}
	}

	// ---------------------------------------------------------------------

	// EXACT_HEADLINE_MATCH
	@Test(priority = 46)
	public void EXACT_HEADLINE_MATCH70002() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737777541266469017?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m48. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus2 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText2);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED");
			Assert.fail("EXACT_HEADLINE_MATCH test case FAILED");
		}
	}

	// ---------------------------------------------------------------------

	// EXACT_HEADLINE_MATCH
	@Test(priority = 47)
	public void EXACT_HEADLINE_MATCH70003() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742151531737088311");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m49. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText3);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED");
			Assert.fail("EXACT_HEADLINE_MATCH test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 48)
	public void EXACT_HEADLINE_MATCH70004() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742151531737088311");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m50. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus4 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText4);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED");
			Assert.fail("EXACT_HEADLINE_MATCH test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 49)
	public void EXACT_HEADLINE_MATCH70005() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742424525470331200");
		Thread.sleep(12000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m51. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus5 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText5);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED");
			Assert.fail("EXACT_HEADLINE_MATCH test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 50)
	public void EXACT_HEADLINE_MATCH_Negative70006() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745719134577648082");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus6 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus6, unexpectedStatus6, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m52. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus6 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText6);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 51)
	public void EXACT_HEADLINE_MATCH_Negative70007() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1747548373643673758");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus7 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus7, unexpectedStatus7, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m53. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus7 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText7);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 53)
	public void EXACT_HEADLINE_MATCH_Negative70008() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1750418327342661759");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus8 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus8, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m54. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus8 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText8);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 53)
	public void EXACT_HEADLINE_MATCH_Negative70009() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1750419538502418478");
		Thread.sleep(7000);

		// locate TrustApp_mark
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus9 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus9, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m55. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus9 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText9);

		// expected output
		String expectedOutput = "This post references CBC News, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 54)
	public void EXACT_HEADLINE_MATCH_Negative70010() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1750420491607613947");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus10 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus10, unexpectedStatus10, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m56. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus10 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText10);

		// expected output
		String expectedOutput = "This post references CBC News, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------------------------------------------------------------------
	// EXACT_HEADLINE_MATCH
	@Test(priority = 55)
	public void EXACT_HEADLINE_MATCH_Negative70011() throws InterruptedException {

		driver.get("https://twitter.com/TrustAppTesting/status/1760196005922783563");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse124 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions124 = new Actions(driver);
		actions124.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus11 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus11, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m57. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus11 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
		jse124.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText11);

		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post matches the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("EXACT_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("EXACT_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH

	@Test(priority = 56)
	public void SEMANTIC_HEADLINE_MATCH80001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742062790829826348");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse108 = (JavascriptExecutor) driver;
		jse108.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions108 = new Actions(driver);
		actions108.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse1008 = (JavascriptExecutor) driver;
		jse108.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus1 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus1, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m58. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse10228 = (JavascriptExecutor) driver;
		jse108.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1038 = (JavascriptExecutor) driver;
		jse108.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText1);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_MATCH test case FAILED");
		}
	}

	// -------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 57)
	public void SEMANTIC_HEADLINE_MATCH8002() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752985276467609694");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse125 = (JavascriptExecutor) driver;
		jse125.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions125 = new Actions(driver);
		actions125.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse10025 = (JavascriptExecutor) driver;
		jse125.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m59. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus2 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver
				.findElement(By.xpath("//a[normalize-space()='The Wall Street Journal']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse102525 = (JavascriptExecutor) driver;
		jse125.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1025 = (JavascriptExecutor) driver;
		jse125.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText2);

		// expected output
		String expectedOutput = "This post references The Wall Street Journal, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_MATCH test case FAILED");
		}
	}

//-------------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 58)
	public void SEMANTIC_HEADLINE_MATCH8003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752952096771465711");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(2000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m60. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("(//a[normalize-space()='The Economist'])[1]"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText3);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_MATCH test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 59)
	public void SEMANTIC_HEADLINE_MATCH8004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742426944644276366");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(2000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m61. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus4 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText4);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_MATCH test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 60)
	public void SEMANTIC_HEADLINE_MATCH8005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742427654567960635");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(2000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m62. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus5 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText5);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_MATCH test case FAILED");
		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 61)
	public void SEMANTIC_HEADLINE_MATCH_Negative8006() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752990329098178953");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(2000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus6 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus6, unexpectedStatus6, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m63. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus6 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText6);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 62)
	public void SEMANTIC_HEADLINE_MATCH_Negative80007() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752990329098178953");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(2000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus7 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus7, unexpectedStatus7, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m64. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus7 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText7);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}

	// --------------------------------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 63)
	public void SEMANTIC_HEADLINE_MATCH_Negative80008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1751918544177021150");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(2000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus8 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus8, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m65. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus8 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText8);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 64)
	public void SEMANTIC_HEADLINE_MATCH_Negative80009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752991259365441578");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(2000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus9 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus9, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m66. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus9 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText9);

		// expected output
		String expectedOutput = "This post references CBC News, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 65)
	public void SEMANTIC_HEADLINE_MATCH_Negative80010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752986891769524479");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(2000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus10 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus10, unexpectedStatus10, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m67. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus10 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText10);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_MATCH
	@Test(priority = 66)
	public void SEMANTIC_HEADLINE_MATCH_Negative8011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760197752691032488");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions142 = new Actions(driver);
		actions142.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(2000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus11 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus11, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m68. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus11 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
		jse142.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText11);

		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post agrees with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_MATCH test case PASSED (As expected)");

		}
	}
	// --------------------------------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 67)
	public void SEMANTIC_HEADLINE_CONTRADICTION90001() throws InterruptedException {
		driver.get("https://twitter.com/Kushagra3837/status/1735733278332821781?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse126 = (JavascriptExecutor) driver;
		jse126.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions126 = new Actions(driver);
		actions126.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2600);

		// to highlight the Widget_Status1
		JavascriptExecutor jse10026 = (JavascriptExecutor) driver;
		jse126.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m69. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse102626 = (JavascriptExecutor) driver;
		jse126.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1026 = (JavascriptExecutor) driver;
		jse126.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText1);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");

		}
	}

//-------------------------------------------------------------
	// // SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 68)
	public void SEMANTIC_HEADLINE_CONTRADICTION90002() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1763087854664556724");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus2 = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus2, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m70. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus2 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText2);
		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
		}
	}

//	//----------------------------------------------------------------------------------------------------------
	// // SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 69)
	public void SEMANTIC_HEADLINE_CONTRADICTION90003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1758353463187046477");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus3 = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus3, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m71. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText3);
		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
		}
	}

//		//----------------------------------------------------------------------------------------------------------
	// // SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 70)
	public void SEMANTIC_HEADLINE_CONTRADICTION90004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742497632688210049");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus4 = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus4, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m72. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus4 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text4
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText4);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
		}
	}
//		//----------------------------------------------------------------------------------------------------------

	// // SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 71)
	public void SEMANTIC_HEADLINE_CONTRADICTION90005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742498835996225661");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus5 = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus5, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m73. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus5 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText5);
		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
			Assert.fail("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED");
		}
	}

//		//----------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 72)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90006() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753332136222876144");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String expectedStatus6 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus6, expectedStatus6, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m74. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus6 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText6);
		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}

//----------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 73)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90007() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753334847261557247");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String expectedStatus7 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus7, expectedStatus7, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m75. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus7 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText7);
		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}
//----------------------------------------------------------------------------------------------------------

	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 74)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753335875885306344");
		Thread.sleep(9000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String expectedStatus8 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus8, expectedStatus8, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m76. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus8 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText8);
		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}

//----------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 75)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754390674886033652");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String expectedStatus9 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus9, expectedStatus9, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m77. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus9 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText9);
		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}

//----------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 76)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754393065928688093");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String expectedStatus10 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus10, expectedStatus10, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m78. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus10 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText10);
		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}

//----------------------------------------------------------------------------------------------------------
	// SEMANTIC_HEADLINE_CONTRADICTION
	@Test(priority = 77)
	public void SEMANTIC_HEADLINE_CONTRADICTION_Negative90011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760199432241385977");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions109 = new Actions(driver);
		actions109.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String expectedStatus11 = "Trustful";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus11, expectedStatus11, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m79. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus11 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='The Guardian']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1039 = (JavascriptExecutor) driver;
		jse109.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText11);
		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We have verified that the post does not agree with the headline of the referenced link.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("SEMANTIC_HEADLINE_CONTRADICTION test case PASSED (As expected)");

		}
	}
//----------------------------------------------------------------------------------------------------------

	// PUBLISHER_MATCH
	@Test(priority = 78)
	public void PUBLISHER_MATCH10001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus1 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus1, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m80. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText1);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 79)
	public void PUBLISHER_MATCH10002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus2 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus2, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m81. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus2 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText2);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 80)
	public void PUBLISHER_MATCH10003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1757366259140755898");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus3 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus3, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m82. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus3 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText3);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 81)
	public void PUBLISHER_MATCH10004() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1762712226270482496");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus4 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus4, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m83. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus4 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText4);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 82)
	public void PUBLISHER_MATCH10005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742145170143875334");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus5 = "Trusted Source";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus5, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m84. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus5 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText5);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case PASSED");
		} else {
			System.out.println("PUBLISHER_MATCH test case FAILED");
			Assert.fail("PUBLISHER_MATCH test case FAILED"); // Fail the test case if the text does not match the
																// expected output
		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 83)
	public void PUBLISHER_MATCH_Negative10006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745714400252834137");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus6 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus6, unexpectedStatus6, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m85. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus6 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText6);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 84)
	public void PUBLISHER_MATCH_Negative10007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747526586780241978");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus7 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus7, unexpectedStatus7, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m86. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus7 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText7);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	

	// PUBLISHER_MATCH
	@Test(priority = 85)
	public void PUBLISHER_MATCH_Negative10008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750411546398777377");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus8 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus8, unexpectedStatus8, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m87. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus8 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText8);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 86)
	public void PUBLISHER_MATCH_Negative10009() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750415170042515729");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus9 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus9, unexpectedStatus9, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m88. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus9 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver
				.findElement(By.xpath("//a[normalize-space()='The Wall Street Journal']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText9);

		// expected output
		String expectedOutput = "This post references The Wall Street Journal, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 87)
	public void PUBLISHER_MATCH_Negative10010() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1750416027060441464");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus10 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus10, unexpectedStatus10, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m89. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus10 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='The Washington Post']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText10);

		// expected output
		String expectedOutput = "This post references The Washington Post, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

//------------------------------------------------------------------------------------------------------------------------------------------------------------	
	// PUBLISHER_MATCH
	@Test(priority = 88)
	public void PUBLISHER_MATCH_Negative10011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760191282268209498");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse106.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions106 = new Actions(driver);
		actions106.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1006.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus11 = "Untrusted Source";

		// Compare the actual status text with the unexpected status
		Assert.assertNotEquals(widgetstatus11, unexpectedStatus11, "Status unexpectedly matches");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m90. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus11 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1036 = (JavascriptExecutor) driver;
		jse10226.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText11);

		// expected output
		String expectedOutput = "This post references BBC, one of your trusted sources.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("PUBLISHER_MATCH test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("PUBLISHER_MATCH test case PASSED (As expected)");

		}
	}

	// ------------------------------------------------------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 89)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER110001() throws InterruptedException {
		driver.get("https://twitter.com/Kushagra3837/status/1737696969022226734?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(3000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus1, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m91. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus1 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher1);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher1
		String Publisher1 = News_Item_Publisher1.getText();

		// Print the Publisher1
		System.out.println("Publisher: " + Publisher1);

		// locate TrustApp_message1
		WebElement TrustApp_message1 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message1
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message1);
		Thread.sleep(1000);

		// Get the text of TrustApp_message1
		String messageText1 = TrustApp_message1.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText1);

		// expected output
		String expectedOutput = "The text of the post mentions CNN, one of your trusted sources. However, the referenced link is from The Economist.";

		// Compare the actual text with the expected output
		if (messageText1.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
		}
	}

////-----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 90)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER110002() throws InterruptedException {
		driver.get("https://twitter.com/Kushagra3837/status/1737696969022226734?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark2
		WebElement TrustApp_mark2 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark2
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark2);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark2
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark2).perform();
		Thread.sleep(3000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus2, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m92. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus2 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher2
		WebElement News_Item_Publisher2 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher2
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher2);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher2
		String Publisher2 = News_Item_Publisher2.getText();

		// Print the Publisher2
		System.out.println("Publisher: " + Publisher2);

		// locate TrustApp_message2
		WebElement TrustApp_message2 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message2
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText2);

		// expected output
		String expectedOutput = "The text of the post mentions CNN, one of your trusted sources. However, the referenced link is from The Economist.";

		// Compare the actual text with the expected output
		if (messageText2.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
		}
	}
//	// -----------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 91)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER110003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742433135424319884");
		Thread.sleep(7000);

		// locate TrustApp_mark3
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus3, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m93. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus3 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher3
		WebElement News_Item_Publisher3 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher3
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher3);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher3
		String Publisher3 = News_Item_Publisher3.getText();

		// Print the Publisher3
		System.out.println("Publisher: " + Publisher3);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText3);

		// expected output
		String expectedOutput = "The text of the post mentions BBC, one of your trusted sources. However, the referenced link is from NPR.";

		// Compare the actual text with the expected output
		if (messageText3.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 92)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER110004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742500951636762708");
		Thread.sleep(7000);

		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus4, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m94. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus4 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher4
		WebElement News_Item_Publisher4 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher4
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher4);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher4
		String Publisher4 = News_Item_Publisher4.getText();

		// Print the Publisher4
		System.out.println("Publisher: " + Publisher4);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText4);

		// expected output
		String expectedOutput = "The text of the post mentions NPR, one of your trusted sources. However, the referenced link is from CNBC.";

		// Compare the actual text with the expected output
		if (messageText4.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
		}
	}
//	// -----------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 93)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER110005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742502261203280006");
		Thread.sleep(7000);

		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus5, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m95. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus5 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher5
		WebElement News_Item_Publisher5 = driver.findElement(By.xpath("//a[normalize-space()='The New York Times']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher5
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher5);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher5
		String Publisher5 = News_Item_Publisher5.getText();

		// Print the Publisher5
		System.out.println("Publisher: " + Publisher5);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText5);

		// expected output
		String expectedOutput = "The text of the post mentions BBC, one of your trusted sources. However, the referenced link is from The New York Times.";

		// Compare the actual text with the expected output
		if (messageText5.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED");
		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
//	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 94)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747568798226342282");
		Thread.sleep(7000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus6, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m96. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus6 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher6);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher6
		String Publisher6 = News_Item_Publisher6.getText();

		// Print the Publisher6
		System.out.println("Publisher: " + Publisher6);

		// locate TrustApp_message6
		WebElement TrustApp_message6 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message6
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText6);

		// expected output
		String expectedOutput = "The text of the post mentions BBC, one of your trusted sources. However, the referenced link is from The Washington Post.";

		// Compare the actual text with the expected output
		if (messageText6.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//
//	// -----------------------------------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 95)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747570541790183568");
		Thread.sleep(7000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus7, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m97. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus7 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='The Washington Post']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher7);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher7
		String Publisher7 = News_Item_Publisher7.getText();

		// Print the Publisher7
		System.out.println("Publisher: " + Publisher7);

		// locate TrustApp_message7
		WebElement TrustApp_message7 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message7
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText7);

		// expected output
		String expectedOutput = "The text of the post mentions CNN, one of your trusted sources. However, the referenced link is from The Washington Post.";

		// Compare the actual text with the expected output
		if (messageText7.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 96)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754394445481480685");
		Thread.sleep(7000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus8, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m98. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus8 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher8);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher8
		String Publisher8 = News_Item_Publisher8.getText();

		// Print the Publisher8
		System.out.println("Publisher: " + Publisher8);

		// locate TrustApp_message8
		WebElement TrustApp_message8 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message8
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText8);

		// expected output
		String expectedOutput = "The text of the post mentions CBC News, one of your trusted sources. However, the referenced link is from NPR.";

		// Compare the actual text with the expected output
		if (messageText8.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 97)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754395124992184689");
		Thread.sleep(7000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus9, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m99. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus9 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher9);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher9
		String Publisher9 = News_Item_Publisher9.getText();

		// Print the Publisher9
		System.out.println("Publisher: " + Publisher9);

		// locate TrustApp_message9
		WebElement TrustApp_message9 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message9
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText9);

		// expected output
		String expectedOutput = "The text of the post mentions BBC, one of your trusted sources. However, the referenced link is from CBC News.";

		// Compare the actual text with the expected output
		if (messageText9.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 98)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754396883269640364");
		Thread.sleep(7000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus10, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m100. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus10 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher10);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher10
		String Publisher10 = News_Item_Publisher10.getText();

		// Print the Publisher10
		System.out.println("Publisher: " + Publisher10);

		// locate TrustApp_message10
		WebElement TrustApp_message10 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message10
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText10);

		// expected output
		String expectedOutput = "The text of the post mentions CNBC, one of your trusted sources. However, the referenced link is from BBC.";

		// Compare the actual text with the expected output
		if (messageText10.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//	// -----------------------------------------------------------------------------------------------------
//
	// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER
	@Test(priority = 99)
	public void KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER_Negative110011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760203168858657031");
		Thread.sleep(7000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions111 = new Actions(driver);
		actions111.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus11, unexpectedStatus, "Status does not match expected");
		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m101. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus11 + "\033[0m");
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse102211.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher11);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher11
		String Publisher11 = News_Item_Publisher11.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher11);

		// locate TrustApp_message11
		WebElement TrustApp_message11 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message11
		JavascriptExecutor jse1011 = (JavascriptExecutor) driver;
		jse1011.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText11);

		// expected output
		String expectedOutput = "The text of the post mentions BBC, one of your trusted sources. However, the referenced link is from CNBC.";

		// Compare the actual text with the expected output
		if (messageText11.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -----------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 100)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER120001() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753009390892757266");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus12, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m102. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 101)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER120002() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753010114510913589");
		Thread.sleep(10000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus12, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m103. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// -------------------------------------------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 102)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER120003() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753010685858947287");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus12, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m104. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 103)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER120004() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753011347279716725");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus12, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m105. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 104)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER120005() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753011882800148946");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus12, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m106. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 105)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120006() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754397928012034440");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m107. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references CBC News, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 106)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120007() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754399074998972426");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m108. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 107)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754399679721181694");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m109. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 108)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1754400243666292986");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m110. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references Fox News, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 109)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753009390892757266");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m111. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 110)
	public void KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative120011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760539919133368586");
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions112.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus12, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m112. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse10012.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher12);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher12
		String Publisher12 = News_Item_Publisher12.getText();

		// Print the Publisher11
		System.out.println("Publisher: " + Publisher12);

		// locate TrustApp_message12
		WebElement TrustApp_message12 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);
		// to highlight the TrustApp_message12
		JavascriptExecutor jse1012 = (JavascriptExecutor) driver;
		jse1012.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText12.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}
	// -------------------------------------------------------------------------------------------------------------

	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 111)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION130001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1738064809608753627?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus13, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m113. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 112)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION130002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744591958805299553");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus13, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m114. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references Al Jazeera English, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 113)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION130003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1738064809608753627?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus13, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m115. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 114)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION130004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1738064809608753627?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus13, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m116. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 115)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION130005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742510008426790943");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus13, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m117. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 116)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745734538951811116");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m118. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 117)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1738064809608753627?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m119. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 118)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1752303286885994533");
		Thread.sleep(10000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m120. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references NPR, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 119)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130009() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1752306234416361763");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m121. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='The New York Times']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references The New York Times, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 120)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130010() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1752307542191902754");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m122. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references CBC News, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// KNOWN_NEWS_ITEM_NO_CONNECTION
	@Test(priority = 121)
	public void KNOWN_NEWS_ITEM_NO_CONNECTION_Negative130011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760542674568749399");
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);
		//
		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions113.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus13, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m123. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher13);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher13
		String Publisher13 = News_Item_Publisher13.getText();

		// Print the Publisher13
		System.out.println("Publisher: " + Publisher13);

		// locate TrustApp_message13
		WebElement TrustApp_message13 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message13
		JavascriptExecutor jse1013 = (JavascriptExecutor) driver;
		jse10013.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

		// expected output
		String expectedOutput = "This post references The Economist, one of your trusted sources. However, the text of the post does not seem to connect to the reference.";

		// Compare the actual text with the expected output
		if (messageText13.equals(expectedOutput)) {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case PASSED");
		} else {
			System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
			Assert.fail("KNOWN_NEWS_ITEM_NO_CONNECTION test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 122)
	public void UNVERIFIED_ATTACHMENT_ORIGIN140001() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745370148293206387");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m124. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNBC, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 123)
	public void UNVERIFIED_ATTACHMENT_ORIGIN140002() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745370148293206387");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m125. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNN, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 124)
	public void UNVERIFIED_ATTACHMENT_ORIGIN140003() throws InterruptedException {

		driver.get("https://twitter.com/Kushagra3837/status/1737691647314444773?s=20");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m126. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNN, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 125)
	public void UNVERIFIED_ATTACHMENT_ORIGIN140004() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1748309111337271729");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m127. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from BBC, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 126)
	public void UNVERIFIED_ATTACHMENT_ORIGIN140005() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1748310193073439078");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus14, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m128. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNN, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 127)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140006() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1748310769458897064");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m129. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from The Economist, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 128)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140007() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1752567084058333202");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m130. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from POLITICO, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 129)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140008() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1752567977029816719");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m131. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNBC, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 130)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140009() throws InterruptedException {

		driver.get("https://twitter.com/TrustAppTesting/status/1752567977029816719");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m132. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNBC, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 131)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140010() throws InterruptedException {

		driver.get("https://twitter.com/TrustAppTesting/status/1752574432806043789");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m133. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from Bloomberg, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNVERIFIED_ATTACHMENT_ORIGIN
	@Test(priority = 132)
	public void UNVERIFIED_ATTACHMENT_ORIGIN_Negative140011() throws InterruptedException {

		driver.get("https://twitter.com/TrustAppTesting/status/1760546537220825200");
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions114.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus14, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m134. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

		// expected output
		String expectedOutput = "This post implies it is from CNN, one of your trusted sources. However, we could not verify the referenced link.";

		// Compare the actual text with the expected output
		if (messageText14.equals(expectedOutput)) {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case PASSED");
		} else {
			System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
			Assert.fail("UNVERIFIED_ATTACHMENT_ORIGIN test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 133)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER150001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744614732441526369");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m135. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions CNN, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 134)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER150002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744616198325629080");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m136. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions CNN, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 135)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER150003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744617181449458046");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m137. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions The Economist, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 136)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER150004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744618874627068014");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m138. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions POLITICO, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 137)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER150005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744619440170275109");
		Thread.sleep(9000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus15, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m139. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions CNN, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 138)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747939852870373795");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m140. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions BBC, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 139)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747939852870373795");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m141. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions BBC, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 140)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150008() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747943537822306543");
		Thread.sleep(9000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m142. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions Al Jazeera English, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 141)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752576804374679643");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m143. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CBC News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions CBC News, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 142)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752578662443172014");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m144. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='BBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions BBC, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER
	@Test(priority = 143)
	public void UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER_Negative150011() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1744614732441526369");
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions115.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus15, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m145. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse102215.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher15);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher15
		String Publisher15 = News_Item_Publisher15.getText();

		// Print the Publisher15
		System.out.println("Publisher: " + Publisher15);

		// locate TrustApp_message15
		WebElement TrustApp_message15 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message15
		JavascriptExecutor jse1015 = (JavascriptExecutor) driver;
		jse1015.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
		// expected output
		String expectedOutput = "This post mentions CNN, one of your trusted source. However, we could not verify its connection with the link in the post.";

		// Compare the actual text with the expected output
		if (messageText15.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ----------------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 144)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED160001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742157772085485819");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m146. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
		}
	}

//		// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 145)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED160002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742157772085485819");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m147. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 146)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED160003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742443757583143407");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m148. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 147)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED160004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742157772085485819");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m149. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 148)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED160005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742513167438119386");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus16, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m150. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
			Assert.fail("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED");
		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 149)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747944504810766531");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m151. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 150)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747945013588132199");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m152. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 151)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752583297454973285");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m153. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 152)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752585339045036487");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m154. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 153)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1752585844815233040");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m155. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED
	@Test(priority = 154)
	public void UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED_Negative160011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760547786225791075");
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions116.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus16, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m156. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

		// expected output
		String expectedOutput = "This post neither references nor mentions a source currently present in our sources list.";

		// Compare the actual text with the expected output
		if (messageText16.equals(expectedOutput)) {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED test case PASSED (As expected)");

		}
	}

//			// --------------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 155)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN170001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745322114326966478");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m157. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
			Assert.fail("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 156)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN170002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742154844897513817");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m158. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
			Assert.fail("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 157)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN170003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1742422582861643850");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m159. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
			Assert.fail("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 158)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN170004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745343717664280648");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m160. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
			Assert.fail("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 159)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN170005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1749405326976122955");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus17, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m161. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from POLITICO.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
			Assert.fail("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED");
		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 160)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747946850118783241");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m162. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from POLITICO.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 161)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745322114326966478");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m163. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 162)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755196233121972715");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m164. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 163)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755197807663690042");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m165. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from POLITICO.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 164)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755198624118591522");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m166. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_MATCHED_PUBLISHER_DOMAIN
	@Test(priority = 165)
	public void KNOWN_MATCHED_PUBLISHER_DOMAIN1_Negative170011() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745322114326966478");
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions117.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus17, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m167. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher17);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher17
		String Publisher17 = News_Item_Publisher17.getText();

		// Print the Publisher17
		System.out.println("Publisher: " + Publisher17);

		// locate TrustApp_message17
		WebElement TrustApp_message17 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message17
		JavascriptExecutor jse1017 = (JavascriptExecutor) driver;
		jse117.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. While we could not verify the exact referenced link, we have verified it originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText17.equals(expectedOutput)) {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN test case PASSED (As expected)");

		}
	}

//		// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 166)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER180001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745321840896053345");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m168. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			// expected output
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 167)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER180002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745339217528459278");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m169. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			// expected output
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 168)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER180003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745321840896053345");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m170. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			// expected output
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 169)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER180004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745338205518397721");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m171. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references The Washington Post, one of your trusted sources. We could not verify the referenced link which originated from POLITICO.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			// expected output
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 170)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER180005() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1745355793552007297");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String expectedStatus = "Suspicious";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus18, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m172. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references POLITICO, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED");
			// expected output
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 171)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1747949712789913931");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m173. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references The Washington Post, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 172)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1748311581782380933");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m174. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references BBC, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 173)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1753305422310654059");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m175. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='Bloomberg']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. We could not verify the referenced link which originated from Bloomberg.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 174)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755116889292882039");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m176. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNBC, one of your trusted sources. We could not verify the referenced link which originated from POLITICO.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 175)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755116596241072285");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m177. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='Bloomberg']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references The Guardian, one of your trusted sources. We could not verify the referenced link which originated from Bloomberg.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
	@Test(priority = 176)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER_Negative180011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760552456185098517");
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions118.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Define the expected status text
		String unexpectedStatus = "Trusted";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus18, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m178. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='Bloomberg']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher18);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher18
		String Publisher18 = News_Item_Publisher18.getText();

		// Print the Publisher18
		System.out.println("Publisher: " + Publisher18);

		// locate TrustApp_message18
		WebElement TrustApp_message18 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message18
		JavascriptExecutor jse1018 = (JavascriptExecutor) driver;
		jse118.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);

		// expected output
		String expectedOutput = "This post references CNN, one of your trusted sources. We could not verify the referenced link which originated from Bloomberg.";

		// Compare the actual text with the expected output
		if (messageText18.equals(expectedOutput)) {
			System.out.println(
					"KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER test case PASSED (As expected)");

		}
	}

//	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 177)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER190001() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1748238228241756526");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus19, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m179. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 178)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER190002() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1748237961744076998");
		Thread.sleep(9000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus19, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m180. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 179)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER190003() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1749722038195863608");
		Thread.sleep(9000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus19, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m181. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 180)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER190004() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1749727850976981031");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus19, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m182. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 181)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER190005() throws InterruptedException {

		driver.get("https://twitter.com/TrustApp_Tsting/status/1749737848687763949");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus19, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m183. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED");
		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 182)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190006() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1749738956889932261");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m184. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 183)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190007() throws InterruptedException {
		driver.get("https://twitter.com/TrustApp_Tsting/status/1749739541378777460");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m185. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 184)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190008() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755119127277052060");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m186. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}

	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 185)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190009() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755123107751133458");
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m187. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 186)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190010() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1755205416219189405");
		Thread.sleep(10000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m188. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER
	@Test(priority = 187)
	public void KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER_Negative190011() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760557375079977445");
		Thread.sleep(10000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions119.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse119.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Define the expected status text
		String unexpectedStatus = "Conclusive";

		// Compare the actual status text with the expected status
		Assert.assertNotEquals(widgetstatus19, unexpectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m189. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//		WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//		Thread.sleep(1000);
//
//		// to highlight the News_Item_Publisher19
//		JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//		jse102219.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//				News_Item_Publisher19);
//		Thread.sleep(1000);
//
//		// Get the text of News_Item_Publisher19
//		String Publisher19 = News_Item_Publisher19.getText();
//
//		// Print the Publisher19
//		System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse1019.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// expected output
		String expectedOutput = "Default Message";

		// Compare the actual text with the expected output
		if (messageText19.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case FAILED(Unexpected outcome)");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER test case PASSED (As expected)");

		}
	}

	// ---------------------------------------------------------------------
	@Test(priority = 188)
	public void KNOWN_PUBLISHER_DOMAIN_DIFFERENT_MENTIONED_PUBLISHER200001() throws InterruptedException {
		driver.get("https://twitter.com/TrustAppTesting/status/1760204142537056559");
		Thread.sleep(7000);

		// locate TrustApp_mark54
		WebElement TrustApp_mark54 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark54
		JavascriptExecutor jse154 = (JavascriptExecutor) driver;
		jse154.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark54);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark54
		Actions actions1154 = new Actions(driver);
		actions1154.moveToElement(TrustApp_mark54).perform();
		Thread.sleep(5300);

		// locate Widget_Status54
		WebElement Widget_Status54 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(5300);

		// to highlight the Widget_Status54
		JavascriptExecutor jse10054 = (JavascriptExecutor) driver;
		jse10054.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status54);
		Thread.sleep(1000);

		// Get the text of Widget_Status53
		String widgetstatus54 = Widget_Status54.getText();

		// Define the expected status text
		String expectedStatus = "Inconclusive";

		// Compare the actual status text with the expected status
		Assert.assertEquals(widgetstatus54, expectedStatus, "Status does not match expected");

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m190. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus54 + "\033[0m"); // \042[42m sets color to green
		System.out.println();

		// locate News_Item_Publisher54
		WebElement News_Item_Publisher54 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher54
		JavascriptExecutor jse105254 = (JavascriptExecutor) driver;
		jse105254.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher54);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher54
		String Publisher54 = News_Item_Publisher54.getText();

		// Print the Publisher52
		System.out.println("Publisher: " + Publisher54);

		// locate TrustApp_message54
		WebElement TrustApp_message54 = driver
				.findElement(By.xpath("//div[contains(text(),'This post mentions BBC, one of your trusted source')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message54
		JavascriptExecutor jse1154 = (JavascriptExecutor) driver;
		jse1154.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message54);
		Thread.sleep(1000);

		// Get the text of TrustApp_message54
		String messageText54 = TrustApp_message54.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_MENTIONED_PUBLISHER: " + messageText54);

		// expected output
		String expectedOutput = "This post mentions BBC, one of your trusted sources. We could not verify the referenced link which originated from CNN.";

		// Compare the actual text with the expected output
		if (messageText54.equals(expectedOutput)) {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_MENTIONED_PUBLISHER test case PASSED");
		} else {
			System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_MENTIONED_PUBLISHER test case FAILED");
			Assert.fail("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_MENTIONED_PUBLISHER test case FAILED");
		}
	}

}
