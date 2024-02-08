import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

import java.io.File;
import java.util.List;

public class UI_TrustApp {

	public static void main(String[] args) throws InterruptedException {
		// Set up ChromeDriver executable using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Example usage:
		List<String> extensionPaths = List.of("./Extension/TrustApp 1.1.16.0.crx");
		WebDriver driver = createChromeDriverWithExtensions(extensionPaths);

		// Navigate to a website).
		driver.get("https://twitter.com/home");

		
		driver.manage().window().maximize();

		Thread.sleep(3000);

		// locate Username
		WebElement Username = driver.findElement(By.xpath("(//input[@name='text'])[1]"));
		Thread.sleep(1000);

		// to highlight the Chrome_Web_Store
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Username);
		Thread.sleep(1000);

		Username.click();
		Username.clear();
		Username.sendKeys("TrustAppTesting");
		Thread.sleep(1000);

		// locate Next
		WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

		// to highlight the Next
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Next);
		Thread.sleep(1000);

		Next.click();

		Thread.sleep(1000);

		// locate Password
		WebElement Password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));

		Thread.sleep(1000);
		
		// to highlight the Password
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Password);
		Thread.sleep(1000);

		Password.click();
		Password.clear();
		Password.sendKeys("TrustApp@4948");
		Thread.sleep(1000);

		// locate Log_in
		WebElement Log_in = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));

		// to highlight the Log_in
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Log_in);
		Thread.sleep(1000);

		Log_in.click();

		Thread.sleep(15000);

		// driver.navigate().refresh();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(1000);

		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(1000);

		driver.get("https://twitter.com/TheEconomist");
		Thread.sleep(1000);

		// --------------------------------------------------------------------------------------------------------

		// locate The_Economist
		WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist'][1]"));
		Thread.sleep(1000);

		// to highlight the The_Economist
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				The_Economist);
		Thread.sleep(1000);

		jse6.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);

		// locate TrustApp_mark1
		WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

		// to highlight the TrustApp_mark1
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark1
		Actions actions = new Actions(driver);
		actions.moveToElement(TrustApp_mark1).perform();
		Thread.sleep(1000);

		// locate Widget_Status1
		WebElement Widget_Status1 = driver
				.findElement(By.xpath("//div[@class='tag green'][normalize-space()='Trusted Source']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status1
		JavascriptExecutor jse100 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status1);
		Thread.sleep(1000);

		// Get the text of Widget_Status1
		String widgetstatus1 = Widget_Status1.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green

		System.out.print("\033[1m1. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus1 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher1
		WebElement News_Item_Publisher1 = driver.findElement(By.xpath("//a[@href='https://www.economist.com/']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher1
		JavascriptExecutor jse1000221 = (JavascriptExecutor) driver;
		jse100.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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

		// --------------------------------------------------------------------------------------------------------------------------------------

		driver.get("https://twitter.com/CNN");

		Thread.sleep(1000);

		// locate CNN
		WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));
		Thread.sleep(1000);

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
		Thread.sleep(1000);

		// locate Widget_Status2
		WebElement Widget_Status2 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(1000);

		// to highlight the Widget_Status2
		JavascriptExecutor jse1001 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status2);
		Thread.sleep(1000);

		// Get the text of Widget_Status2
		String widgetstatus2 = Widget_Status2.getText();

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
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10001.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message2);
		Thread.sleep(1000);

		// Get the text of TrustApp_message2
		String messageText2 = TrustApp_message2.getText();

		// Print the text
		System.out.println("Verified_Tweet: " + messageText2);

		// -----------------------------------------------------------------------------------------------------------------------------------------------

		// NO_URL_TO_VERIFY

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742067234799821185");
		Thread.sleep(5000);

//
		// locate TrustApp_mark3 //div[@class='trust-app-verification-container
		// trust-app-trusted-container']//img[@alt='TrustApp mark']
		WebElement TrustApp_mark3 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark3
		JavascriptExecutor jse103 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark3);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark3
		Actions actions22 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark3).perform();
		Thread.sleep(1000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1003 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status3);
		Thread.sleep(1000);

		// Get the text of Widget_Status3
		String widgetstatus3 = Widget_Status3.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey

		System.out.print("\033[1m3. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus3 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message3
		WebElement TrustApp_message3 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message3
		JavascriptExecutor jse1033 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message3);
		Thread.sleep(1000);

		// Get the text of TrustApp_message3
		String messageText3 = TrustApp_message3.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText3);

//       //--------------------------------------------------------------------------------------------------------------------------------------- 

		// CANNOT_VERIFY_IMAGE_ATTACHMENT

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775226836971778?s=20");
		Thread.sleep(5000);

//
		// locate TrustApp_mark4
		WebElement TrustApp_mark4 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark4
		JavascriptExecutor jse104 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark4);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark4
		Actions action104 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark4).perform();
		Thread.sleep(1000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1004 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				Widget_Status4);
		Thread.sleep(1000);

		// Get the text of Widget_Status4
		String widgetstatus4 = Widget_Status4.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m4. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus4 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message4
		WebElement TrustApp_message4 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message4
		JavascriptExecutor jse1034 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message4);
		Thread.sleep(1000);

		// Get the text of TrustApp_message4
		String messageText4 = TrustApp_message4.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText4);

		// ------------------------------------------------------------------------------------------------------------------------------------------

		// CANNOT_VERIFY_VIDEO_ATTACHMENT

		driver.get("https://twitter.com/TrustAppTesting/status/1754388754658218354");
		Thread.sleep(5000);

//
		// locate TrustApp_mark5
		WebElement TrustApp_mark5 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark5
		JavascriptExecutor jse105 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark5);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark5
		Actions actions105 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark5).perform();
		Thread.sleep(1000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1005 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 5px solid red;')",
				Widget_Status5);
		Thread.sleep(1000);

		// Get the text of Widget_Status5
		String widgetstatus5 = Widget_Status5.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m5. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus5 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message5
		WebElement TrustApp_message5 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message5
		JavascriptExecutor jse1035 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message5);
		Thread.sleep(1000);

		// Get the text of TrustApp_message5
		String messageText5 = TrustApp_message5.getText();

		// Print the text
		System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText5);

		// ----------------------------------------------------------------------------------------------------------------------------------------------------

		// PUBLISHER_MATCH

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
		Thread.sleep(5000);

		// locate TrustApp_mark6
		WebElement TrustApp_mark6 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark6
		JavascriptExecutor jse106 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark6);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark6
		Actions actions106 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark6).perform();
		Thread.sleep(1000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 6px solid red;')",
				Widget_Status6);
		Thread.sleep(1000);

		// Get the text of Widget_Status6
		String widgetstatus6 = Widget_Status6.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m6. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus6 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher6
		WebElement News_Item_Publisher6 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher6
		JavascriptExecutor jse10226 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message6);
		Thread.sleep(1000);

		// Get the text of TrustApp_message6
		String messageText6 = TrustApp_message6.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText6);

		// ----------------------------------------------------------------------------------------------------------------------------------------------------

		// EXACT_HEADLINE_MATCH

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737777541266469017?s=20");
		Thread.sleep(5000);

		// locate TrustApp_mark7
		WebElement TrustApp_mark7 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark7
		JavascriptExecutor jse107 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark7);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark7
		Actions actions107 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark7).perform();
		Thread.sleep(1000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1007 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 7px solid red;')",
				Widget_Status7);
		Thread.sleep(1000);

		// Get the text of Widget_Status7
		String widgetstatus7 = Widget_Status7.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m7. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus7 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher7
		WebElement News_Item_Publisher7 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher7
		JavascriptExecutor jse10227 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		JavascriptExecutor jse1037 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message7);
		Thread.sleep(1000);

		// Get the text of TrustApp_message7
		String messageText7 = TrustApp_message7.getText();

		// Print the text
		System.out.println("EXACT_HEADLINE_MATCH: " + messageText7);
		// ----------------------------------------------------------------------------------------------------------------------------------------------------

		// SEMANTIC_HEADLINE_MATCH

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742062790829826348");
		Thread.sleep(5000);

		// locate TrustApp_mark8
		WebElement TrustApp_mark8 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark8
		JavascriptExecutor jse108 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark8);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark8
		Actions actions108 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark8).perform();
		Thread.sleep(1000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse1008 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 8px solid red;')",
				Widget_Status8);
		Thread.sleep(1000);

		// Get the text of Widget_Status8
		String widgetstatus8 = Widget_Status8.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m8. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus8 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher8
		WebElement News_Item_Publisher8 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher8
		JavascriptExecutor jse10228 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		JavascriptExecutor jse1038 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message8);
		Thread.sleep(1000);

		// Get the text of TrustApp_message8
		String messageText8 = TrustApp_message8.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText8);
//----------------------------------------------------------------------------------------------------------------------------------------------------

		// SEMANTIC_HEADLINE_CONTRADICTION

		driver.get("https://twitter.com/Kushagra3837/status/1735733278332821781?s=20");
		Thread.sleep(5000);

		// locate TrustApp_mark9
		WebElement TrustApp_mark9 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark9
		JavascriptExecutor jse109 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark9);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark9
		Actions actions109 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark9).perform();
		Thread.sleep(1000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 9px solid red;')",
				Widget_Status9);
		Thread.sleep(1000);

		// Get the text of Widget_Status9
		String widgetstatus9 = Widget_Status9.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m9. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus9 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher9
		WebElement News_Item_Publisher9 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher9
		JavascriptExecutor jse10229 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message9);
		Thread.sleep(1000);

		// Get the text of TrustApp_message9
		String messageText9 = TrustApp_message9.getText();

		// Print the text
		System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText9);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// PUBLISHER_MATCH

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742164277736112172");
		Thread.sleep(5000);

		// locate TrustApp_mark10
		WebElement TrustApp_mark10 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark10
		JavascriptExecutor jse110 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark10);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark10
		Actions actions110 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark10).perform();
		Thread.sleep(1000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10010 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 10px solid red;')",
				Widget_Status10);
		Thread.sleep(1000);

		// Get the text of Widget_Status10
		String widgetstatus10 = Widget_Status10.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m10. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus10 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher10
		WebElement News_Item_Publisher10 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher10
		JavascriptExecutor jse102210 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		JavascriptExecutor jse1010 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message10);
		Thread.sleep(1000);

		// Get the text of TrustApp_message10
		String messageText10 = TrustApp_message10.getText();

		// Print the text
		System.out.println("PUBLISHER_MATCH: " + messageText10);
//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER

		driver.get("https://twitter.com/Kushagra3837/status/1737696969022226734?s=20");
		Thread.sleep(5000);

		// locate TrustApp_mark11
		WebElement TrustApp_mark11 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark11
		JavascriptExecutor jse111 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark11);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark11
		Actions actions111 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark11).perform();
		Thread.sleep(1000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 11px solid red;')",
				Widget_Status11);
		Thread.sleep(1000);

		// Get the text of Widget_Status11
		String widgetstatus11 = Widget_Status11.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m11. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus11 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher11
		WebElement News_Item_Publisher11 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher11
		JavascriptExecutor jse102211 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message11);
		Thread.sleep(1000);

		// Get the text of TrustApp_message11
		String messageText11 = TrustApp_message11.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText11);
//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

		driver.get("https://twitter.com/TrustAppTesting/status/1753009390892757266");
		Thread.sleep(5000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(1000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 12px solid red;')",
				Widget_Status12);
		Thread.sleep(1000);

		// Get the text of Widget_Status12
		String widgetstatus12 = Widget_Status12.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// green
		System.out.print("\033[1m12. STATUS\033[0m: ");
		System.out.print("\033[32m" + widgetstatus12 + "\033[0m"); // \033[32m sets color to green
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher12
		WebElement News_Item_Publisher12 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher12
		JavascriptExecutor jse102212 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message12);
		Thread.sleep(1000);

		// Get the text of TrustApp_message12
		String messageText12 = TrustApp_message12.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText12);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_NEWS_ITEM_NO_CONNECTION

		driver.get("https://twitter.com/TrustApp_Tsting/status/1738064809608753627?s=20");
		Thread.sleep(5000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(1000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 13px solid red;')",
				Widget_Status13);
		Thread.sleep(1000);

		// Get the text of Widget_Status13
		String widgetstatus13 = Widget_Status13.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m13. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus13 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher13
		WebElement News_Item_Publisher13 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher13
		JavascriptExecutor jse102213 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message13);
		Thread.sleep(1000);

		// Get the text of TrustApp_message13
		String messageText13 = TrustApp_message13.getText();

		// Print the text
		System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText13);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// UNVERIFIED_ATTACHMENT_ORIGIN

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745370148293206387");
		Thread.sleep(5000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(1000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 14px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m14. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus14 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message14
		WebElement TrustApp_message14 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message14
		JavascriptExecutor jse1014 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message14);
		Thread.sleep(1000);

		// Get the text of TrustApp_message14
		String messageText14 = TrustApp_message14.getText();

		// Print the text
		System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText14);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

		driver.get("https://twitter.com/TrustApp_Tsting/status/1744614732441526369");
		Thread.sleep(5000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(1000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 15px solid red;')",
				Widget_Status15);
		Thread.sleep(1000);

		// Get the text of Widget_Status15
		String widgetstatus15 = Widget_Status15.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m15. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus15 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher15
		WebElement News_Item_Publisher15 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher15
		JavascriptExecutor jse102215 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message15);
		Thread.sleep(1000);

		// Get the text of TrustApp_message15
		String messageText15 = TrustApp_message15.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText15);
//----------------------------------------------------------------------------------------------------------------------------------------------------

		// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED

		driver.get("https://twitter.com/TrustApp_Tsting/status/1742157772085485819");
		Thread.sleep(5000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(1000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 16px solid red;')",
				Widget_Status16);
		Thread.sleep(1000);

		// Get the text of Widget_Status16
		String widgetstatus16 = Widget_Status16.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m16. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus16 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate TrustApp_message16
		WebElement TrustApp_message16 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message16
		JavascriptExecutor jse1016 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message16);
		Thread.sleep(1000);

		// Get the text of TrustApp_message16
		String messageText16 = TrustApp_message16.getText();

		// Print the text
		System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText16);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_MATCHED_PUBLISHER_DOMAIN

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745322114326966478");
		Thread.sleep(5000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(1000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 17px solid red;')",
				Widget_Status17);
		Thread.sleep(1000);

		// Get the text of Widget_Status17
		String widgetstatus17 = Widget_Status17.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m17. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus17 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher17
		WebElement News_Item_Publisher17 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher17
		JavascriptExecutor jse102217 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message17);
		Thread.sleep(1000);

		// Get the text of TrustApp_message17
		String messageText17 = TrustApp_message17.getText();

		// Print the text
		System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText17);

//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER

		driver.get("https://twitter.com/TrustApp_Tsting/status/1745321840896053345");
		Thread.sleep(6000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(1000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 18px solid red;')",
				Widget_Status18);
		Thread.sleep(1000);

		// Get the text of Widget_Status18
		String widgetstatus18 = Widget_Status18.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// red
		System.out.print("\033[1m18. STATUS\033[0m: ");
		System.out.print("\033[31m" + widgetstatus18 + "\033[0m"); // \033[31m sets color to red
		System.out.println();
		Thread.sleep(1000);

		// locate News_Item_Publisher18
		WebElement News_Item_Publisher18 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher18
		JavascriptExecutor jse102218 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message18);
		Thread.sleep(1000);

		// Get the text of TrustApp_message18
		String messageText18 = TrustApp_message18.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText18);
//----------------------------------------------------------------------------------------------------------------------------------------------------

		// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER

		driver.get("https://twitter.com/TrustApp_Tsting/status/1748238228241756526");
		Thread.sleep(5000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(1000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].setAttribute('style','background: pink; border: 19px solid red;')",
				Widget_Status19);
		Thread.sleep(1000);

		// Get the text of Widget_Status19
		String widgetstatus19 = Widget_Status19.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in
		// grey
		System.out.print("\033[1m19. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus19 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();
		Thread.sleep(1000);

//		// locate News_Item_Publisher19
//				WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
//				Thread.sleep(1000);
//
//				// to highlight the News_Item_Publisher19
//				JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
//				jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
//						News_Item_Publisher19);
//				Thread.sleep(1000);
//
//				// Get the text of News_Item_Publisher19
//				String Publisher19 = News_Item_Publisher19.getText();
//
//				// Print the Publisher19
//				System.out.println("Publisher: " + Publisher19);

		// locate TrustApp_message19
		WebElement TrustApp_message19 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message19
		JavascriptExecutor jse1019 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message19);
		Thread.sleep(1000);

		// Get the text of TrustApp_message19
		String messageText19 = TrustApp_message19.getText();

		// Print the text
		System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText19);

		// ----------------------------------------------------------------------------------------------------------------------------------------------

		driver.quit();
	}

	private static WebDriver createChromeDriverWithExtensions(List<String> extensionPaths) {
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();

		// Add extensions to ChromeOptions
		for (String extensionPath : extensionPaths) {
			File extensionFile = new File(extensionPath);
			if (extensionFile.exists()) {
				options.addExtensions(extensionFile);
			} else {
				System.err.println("Extension file not found: " + extensionPath);
			}
		}

		// Create a new ChromeDriver instance with the configured ChromeOptions
		return new ChromeDriver(options);
	}
}
