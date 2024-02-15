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
		driver.get("https://twitter.com/TheEconomist");

		
		driver.manage().window().maximize();

		Thread.sleep(3000);

//		// locate Username
//		WebElement Username = driver.findElement(By.xpath("(//input[@name='text'])[1]"));
//		Thread.sleep(1000);
//
//		// to highlight the Chrome_Web_Store
//		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
//		jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Username);
		Thread.sleep(1000);
//
//		Username.click();
//		Username.clear();
//		Username.sendKeys("TrustAppTesting");
////		Thread.sleep(1000);
//
//		// locate Next
//		WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
//
//		// to highlight the Next
//		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
//		jse2.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Next);
//		Thread.sleep(1000);
//
//		Next.click();
//
//		Thread.sleep(1000);
//
//		// locate Password
//		WebElement Password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
//
////		Thread.sleep(1000);
////		
////		// to highlight the Password
////		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
////		jse3.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Password);
////		Thread.sleep(1000);
////
////		Password.click();
////		Password.clear();
////		Password.sendKeys("TrustApp@5048");
////		Thread.sleep(1000);
////
////		// locate Log_in
////		WebElement Log_in = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
////
////		// to highlight the Log_in
////		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
////		jse4.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Log_in);
////		Thread.sleep(1000);
////
////		Log_in.click();
////
////		Thread.sleep(15000);
////
////		// driver.navigate().refresh();
////		Thread.sleep(1000);
//
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
//
//		js.executeScript("window.scrollBy(0,450)", "");
//		Thread.sleep(1000);
//
//		js.executeScript("window.scrollBy(0,550)", "");
//		Thread.sleep(1000);
//
		js1.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(1000);
//
//	
//		// --------------------------------------------------------------------------------------------------------
//		driver.get("https://twitter.com/TheEconomist");
		Thread.sleep(7000);
		
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

		Thread.sleep(3000);

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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status3
		WebElement Widget_Status3 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status3
		JavascriptExecutor jse1003 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
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

       //--------------------------------------------------------------------------------------------------------------------------------------- 

		// CANNOT_VERIFY_IMAGE_ATTACHMENT

		driver.get("https://twitter.com/TrustApp_Tsting/status/1737775226836971778?s=20");
		Thread.sleep(7000);


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
		Thread.sleep(3000);

		// locate Widget_Status4
		WebElement Widget_Status4 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status4
		JavascriptExecutor jse1004 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
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
		Thread.sleep(7000);


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
		Thread.sleep(3000);

		// locate Widget_Status5
		WebElement Widget_Status5 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status5
		JavascriptExecutor jse1005 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 5px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status6
		WebElement Widget_Status6 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status6
		JavascriptExecutor jse1006 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 6px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status7
		WebElement Widget_Status7 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status7
		JavascriptExecutor jse1007 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 7px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status8
		WebElement Widget_Status8 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status8
		JavascriptExecutor jse1008 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 8px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status9
		WebElement Widget_Status9 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status9
		JavascriptExecutor jse1009 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 9px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status10
		WebElement Widget_Status10 = driver.findElement(By.xpath("//div[@class='tag green']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status10
		JavascriptExecutor jse10010 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 10px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

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
		Thread.sleep(3000);

		// locate Widget_Status11
		WebElement Widget_Status11 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status11
		JavascriptExecutor jse10011 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 11px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark12
		WebElement TrustApp_mark12 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark12
		JavascriptExecutor jse112 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark12);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark12
		Actions actions112 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark12).perform();
		Thread.sleep(3000);

		// locate Widget_Status12
		WebElement Widget_Status12 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status12
		JavascriptExecutor jse10012 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 12px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark13
		WebElement TrustApp_mark13 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark13
		JavascriptExecutor jse113 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark13);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark13
		Actions actions113 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark13).perform();
		Thread.sleep(3000);

		// locate Widget_Status13
		WebElement Widget_Status13 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status13
		JavascriptExecutor jse10013 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 13px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark14
		WebElement TrustApp_mark14 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark14
		JavascriptExecutor jse114 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark14);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark14
		Actions actions114 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark14).perform();
		Thread.sleep(3000);

		// locate Widget_Status14
		WebElement Widget_Status14 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status14
		JavascriptExecutor jse10014 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 14px solid red;')",
				Widget_Status14);
		Thread.sleep(1000);

		// Get the text of Widget_Status14
		String widgetstatus14 = Widget_Status14.getText();

			
		// Print the status with only the word "STATUS" in bold and the widget status in red
		System.out.print("\033[1m14. STATUS\033[0m: ");
		System.out.print("\033[91m" + widgetstatus14 + "\033[0m"); // \033[91m sets color to red
		System.out.println();
		
		
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
		Thread.sleep(7000);

		// locate TrustApp_mark15
		WebElement TrustApp_mark15 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark15
		JavascriptExecutor jse115 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark15);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark15
		Actions actions115 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark15).perform();
		Thread.sleep(3000);

		// locate Widget_Status15
		WebElement Widget_Status15 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status15
		JavascriptExecutor jse10015 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 15px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark16
		WebElement TrustApp_mark16 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark16
		JavascriptExecutor jse116 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark16);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark16
		Actions actions116 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark16).perform();
		Thread.sleep(3000);

		// locate Widget_Status16
		WebElement Widget_Status16 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status16
		JavascriptExecutor jse10016 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 16px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark17
		WebElement TrustApp_mark17 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark17
		JavascriptExecutor jse117 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark17);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark17
		Actions actions117 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark17).perform();
		Thread.sleep(3000);

		// locate Widget_Status17
		WebElement Widget_Status17 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status17
		JavascriptExecutor jse10017 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 17px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark18
		WebElement TrustApp_mark18 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark18
		JavascriptExecutor jse118 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark18);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark18
		Actions actions118 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark18).perform();
		Thread.sleep(3000);

		// locate Widget_Status18
		WebElement Widget_Status18 = driver.findElement(By.xpath("//div[@class='tag danger']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status18
		JavascriptExecutor jse10018 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 18px solid red;')",
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
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
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
		Thread.sleep(7000);

		// locate TrustApp_mark19
		WebElement TrustApp_mark19 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark19
		JavascriptExecutor jse119 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark19);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark19
		Actions actions119 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark19).perform();
		Thread.sleep(3000);

		// locate Widget_Status19
		WebElement Widget_Status19 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status19
		JavascriptExecutor jse10019 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 19px solid red;')",
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

		// locate News_Item_Publisher19
				WebElement News_Item_Publisher19 = driver.findElement(By.xpath(""));
				Thread.sleep(1000);

				// to highlight the News_Item_Publisher19
				JavascriptExecutor jse102219 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher19);
				Thread.sleep(1000);

				// Get the text of News_Item_Publisher19
				String Publisher19 = News_Item_Publisher19.getText();

				// Print the Publisher19
				System.out.println("Publisher: " + Publisher19);

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

		
		// NO_URL_TO_VERIFY

		driver.get("https://twitter.com/Kushagra3837/status/1737838697738129837");
		Thread.sleep(7000);

		// locate TrustApp_mark20
		WebElement TrustApp_mark20 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		Thread.sleep(1000);

		// to highlight the TrustApp_mark20
		JavascriptExecutor jse120 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark20);
		Thread.sleep(1000);

		// Perform a hover action on TrustApp_mark20
		Actions actions120 = new Actions(driver);
		actions1.moveToElement(TrustApp_mark20).perform();
		Thread.sleep(3000);

		// locate Widget_Status20
		WebElement Widget_Status20 = driver.findElement(By.xpath("//div[@class='tag']"));
		Thread.sleep(2000);

		// to highlight the Widget_Status20
		JavascriptExecutor jse10020 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 20px solid red;')",
				Widget_Status20);
		Thread.sleep(1000);

		// Get the text of Widget_Status20
		String widgetstatus20 = Widget_Status20.getText();

		// Print the status with only the word "STATUS" in bold and the widget status in grey
		System.out.print("\033[1m20. STATUS\033[0m: ");
		System.out.print("\033[90m" + widgetstatus20 + "\033[0m"); // \033[90m sets color to grey
		System.out.println();

		// locate News_Item_Publisher20
		WebElement News_Item_Publisher20 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
		Thread.sleep(1000);

		// to highlight the News_Item_Publisher20
		JavascriptExecutor jse102220 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
				News_Item_Publisher20);
		Thread.sleep(1000);

		// Get the text of News_Item_Publisher20
		String Publisher20 = News_Item_Publisher20.getText();

		// Print the Publisher20
		System.out.println("Publisher: " + Publisher20);

		// locate TrustApp_message20
		WebElement TrustApp_message20 = driver.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
		Thread.sleep(1000);

		// to highlight the TrustApp_message20
		JavascriptExecutor jse1020 = (JavascriptExecutor) driver;
		jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_message20);
		Thread.sleep(1000);

		// Get the text of TrustApp_message20
		String messageText20 = TrustApp_message20.getText();

		// Print the text
		System.out.println("NO_URL_TO_VERIFY: " + messageText20);
		
		//-----------------------------------------------------------------------------------------------------------------------------------
	
		// CANNOT_VERIFY_IMAGE_ATTACHMENT

				driver.get("https://twitter.com/TrustApp_Tsting/status/1737775226836971778?s=21");
				Thread.sleep(7000);

				// locate TrustApp_mark21
				WebElement TrustApp_mark21 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark21
				JavascriptExecutor jse121 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark21);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark21
				Actions actions121 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark21).perform();
				Thread.sleep(3000);

				// locate Widget_Status21
				WebElement Widget_Status21 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(2100);

				// to highlight the Widget_Status21
				JavascriptExecutor jse10021 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 21px solid red;')",
						Widget_Status21);
				Thread.sleep(1000);

				// Get the text of Widget_Status21
				String widgetstatus21 = Widget_Status21.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in grey
				System.out.print("\033[1m21. STATUS\033[0m: ");
				System.out.print("\033[90m" + widgetstatus21 + "\033[0m"); // \033[90m sets color to grey
				System.out.println();

				// locate News_Item_Publisher21
				WebElement News_Item_Publisher21 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher21
				JavascriptExecutor jse102221 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher21);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher21
				String Publisher21 = News_Item_Publisher21.getText();
		
				// Print the Publisher21
				System.out.println("Publisher: " + Publisher21);

				// locate TrustApp_message21
				WebElement TrustApp_message21 = driver.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message21
				JavascriptExecutor jse1021 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message21);
				Thread.sleep(1000);

				// Get the text of TrustApp_message21
				String messageText21 = TrustApp_message21.getText();

				// Print the text
				System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText21);
				
				
				//-------------------------------------------------------------------------------------------------------------------------------------------------

				// CANNOT_VERIFY_VIDEO_ATTACHMENT

				driver.get("https://twitter.com/TrustAppTesting/status/1755906683946111011");
				Thread.sleep(7000);

				// locate TrustApp_mark22
				WebElement TrustApp_mark22 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark22
				JavascriptExecutor jse122 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark22);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark22
				Actions actions122 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark22).perform();
				Thread.sleep(1000);

				// locate Widget_Status22
				WebElement Widget_Status22 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(2200);

				// to highlight the Widget_Status22
				JavascriptExecutor jse10022 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 22px solid red;')",
						Widget_Status22);
				Thread.sleep(1000);

				// Get the text of Widget_Status22
				String widgetstatus22 = Widget_Status22.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in
				// red
				System.out.print("\033[1m22. STATUS\033[0m: ");
				System.out.print("\033[31m" + widgetstatus22 + "\033[0m"); // \033[31m sets color to red
				System.out.println();
				Thread.sleep(1000);

				// locate News_Item_Publisher22
				WebElement News_Item_Publisher22 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher22
				JavascriptExecutor jse102222 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher22);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher22
				String Publisher22 = News_Item_Publisher22.getText();
		
				// Print the Publisher22
				System.out.println("Publisher: " + Publisher22);

				// locate TrustApp_message22
				WebElement TrustApp_message22 = driver.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message22
				JavascriptExecutor jse1022 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message22);
				Thread.sleep(1000);

				// Get the text of TrustApp_message22
				String messageText22 = TrustApp_message22.getText();

				// Print the text
				System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText22);
				
				//-----------------------------------------------------------------------------------------------------------------------------------------
				
				
				// PUBLISHER_MATCH

				driver.get("https://twitter.com/TrustApp_Tsting/status/1737775640005243004?s=20");
				Thread.sleep(7000);

				// locate TrustApp_mark23
				WebElement TrustApp_mark23 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark23
				JavascriptExecutor jse123 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark23);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark23
				Actions actions123 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark23).perform();
				Thread.sleep(3000);

				// locate Widget_Status23
				WebElement Widget_Status23 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(2300);

				// to highlight the Widget_Status23
				JavascriptExecutor jse10023 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 23px solid red;')",
						Widget_Status23);
				Thread.sleep(1000);

				// Get the text of Widget_Status23
				String widgetstatus23 = Widget_Status23.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m23. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus23 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher23
				WebElement News_Item_Publisher23 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher23
				JavascriptExecutor jse102323 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher23);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher23
				String Publisher23 = News_Item_Publisher23.getText();
		
				// Print the Publisher23
				System.out.println("Publisher: " + Publisher23);

				// locate TrustApp_message23
				WebElement TrustApp_message23 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message23
				JavascriptExecutor jse1023 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message23);
				Thread.sleep(1000);

				// Get the text of TrustApp_message23
				String messageText23 = TrustApp_message23.getText();

				// Print the text
				System.out.println("PUBLISHER_MATCH: " + messageText23);
				

				
				//-----------------------------------------------------------------------------------------------------------------------------------------------------
		
				
				// EXACT_HEADLINE_MATCH

				driver.get("https://twitter.com/TrustApp_Tsting/status/1737777541266469017?s=20");
				Thread.sleep(7000);

				// locate TrustApp_mark24
				WebElement TrustApp_mark24 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark24
				JavascriptExecutor jse124 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark24);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark24
				Actions actions124 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark24).perform();
				Thread.sleep(3000);

				// locate Widget_Status24
				WebElement Widget_Status24 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(2400);

				// to highlight the Widget_Status24
				JavascriptExecutor jse10024 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 24px solid red;')",
						Widget_Status24);
				Thread.sleep(1000);

				// Get the text of Widget_Status24
				String widgetstatus24 = Widget_Status24.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m24. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus24 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher24
				WebElement News_Item_Publisher24 = driver.findElement(By.xpath("//a[normalize-space()='Fox News']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher24
				JavascriptExecutor jse102424 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher24);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher24
				String Publisher24 = News_Item_Publisher24.getText();
		
				// Print the Publisher24
				System.out.println("Publisher: " + Publisher24);

				// locate TrustApp_message24
				WebElement TrustApp_message24 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message24
				JavascriptExecutor jse1024 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message24);
				Thread.sleep(1000);

				// Get the text of TrustApp_message24
				String messageText24 = TrustApp_message24.getText();

				// Print the text
				System.out.println("EXACT_HEADLINE_MATCH: " + messageText24);
				
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
		
				// SEMANTIC_HEADLINE_MATCH

				driver.get("https://twitter.com/TrustAppTesting/status/1752985276467609694");
				Thread.sleep(7000);

				// locate TrustApp_mark25
				WebElement TrustApp_mark25 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark25
				JavascriptExecutor jse125 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark25);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark25
				Actions actions125 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark25).perform();
				Thread.sleep(3000);

				// locate Widget_Status25
				WebElement Widget_Status25 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(2500);

				// to highlight the Widget_Status25
				JavascriptExecutor jse10025 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 25px solid red;')",
						Widget_Status25);
				Thread.sleep(1000);

				// Get the text of Widget_Status25
				String widgetstatus25 = Widget_Status25.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m25. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus25 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher25
				WebElement News_Item_Publisher25 = driver.findElement(By.xpath("//a[normalize-space()='The Wall Street Journal']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher25
				JavascriptExecutor jse102525 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher25);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher25
				String Publisher25 = News_Item_Publisher25.getText();
		
				// Print the Publisher25
				System.out.println("Publisher: " + Publisher25);

				// locate TrustApp_message25
				WebElement TrustApp_message25 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message25
				JavascriptExecutor jse1025 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message25);
				Thread.sleep(1000);

				// Get the text of TrustApp_message25
				String messageText25 = TrustApp_message25.getText();

				// Print the text
				System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText25);
				
				
				//-----------------------------------------------------------------------------------------------------------------------------------------------
				
				// SEMANTIC_HEADLINE_CONTRADICTION

				driver.get("https://twitter.com/Kushagra3837/status/1735733278332821781?s=20");
				Thread.sleep(7000);

				// locate TrustApp_mark26
				WebElement TrustApp_mark26 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark26
				JavascriptExecutor jse126 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark26);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark26
				Actions actions126 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark26).perform();
				Thread.sleep(3000);

				// locate Widget_Status26
				WebElement Widget_Status26 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(2600);

				// to highlight the Widget_Status26
				JavascriptExecutor jse10026 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 26px solid red;')",
						Widget_Status26);
				Thread.sleep(1000);

				// Get the text of Widget_Status26
				String widgetstatus26 = Widget_Status26.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m26. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus26 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher26
				WebElement News_Item_Publisher26 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher26
				JavascriptExecutor jse102626 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher26);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher26
				String Publisher26 = News_Item_Publisher26.getText();
		
				// Print the Publisher26
				System.out.println("Publisher: " + Publisher26);

				// locate TrustApp_message26
				WebElement TrustApp_message26 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message26
				JavascriptExecutor jse1026 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message26);
				Thread.sleep(1000);

				// Get the text of TrustApp_message26
				String messageText26 = TrustApp_message26.getText();

				// Print the text
				System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText26);
				
				
				//-------------------------------------------------------------------------------------
				

				// PUBLISHER_MATCH

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742164277736112172");
				Thread.sleep(7000);

				// locate TrustApp_mark27
				WebElement TrustApp_mark27 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark27
				JavascriptExecutor jse127 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark27);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark27
				Actions actions127 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark27).perform();
				Thread.sleep(3000);

				// locate Widget_Status27
				WebElement Widget_Status27 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(2700);

				// to highlight the Widget_Status27
				JavascriptExecutor jse10027 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 27px solid red;')",
						Widget_Status27);
				Thread.sleep(1000);

				// Get the text of Widget_Status27
				String widgetstatus27 = Widget_Status27.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m27. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus27 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher27
				WebElement News_Item_Publisher27 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher27
				JavascriptExecutor jse102727 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher27);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher27
				String Publisher27 = News_Item_Publisher27.getText();
		
				// Print the Publisher27
				System.out.println("Publisher: " + Publisher27);

				// locate TrustApp_message27
				WebElement TrustApp_message27 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message27
				JavascriptExecutor jse1027 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message27);
				Thread.sleep(1000);

				// Get the text of TrustApp_message27
				String messageText27 = TrustApp_message27.getText();

				// Print the text
				System.out.println("PUBLISHER_MATCH: " + messageText27);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
			
				
				// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

				driver.get("https://twitter.com/TrustAppTesting/status/1753010114510913589");
				Thread.sleep(7000);

				// locate TrustApp_mark28
				WebElement TrustApp_mark28 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark28
				JavascriptExecutor jse128 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark28);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark28
				Actions actions128 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark28).perform();
				Thread.sleep(3000);

				// locate Widget_Status28
				WebElement Widget_Status28 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(2800);

				// to highlight the Widget_Status28
				JavascriptExecutor jse10028 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 28px solid red;')",
						Widget_Status28);
				Thread.sleep(1000);

				// Get the text of Widget_Status28
				String widgetstatus28 = Widget_Status28.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m28. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus28 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher28
				WebElement News_Item_Publisher28 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher28
				JavascriptExecutor jse102828 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher28);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher28
				String Publisher28 = News_Item_Publisher28.getText();
		
				// Print the Publisher28
				System.out.println("Publisher: " + Publisher28);

				// locate TrustApp_message28
				WebElement TrustApp_message28 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message28
				JavascriptExecutor jse1028 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message28);
				Thread.sleep(1000);

				// Get the text of TrustApp_message28
				String messageText28 = TrustApp_message28.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText28);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
			
				
				// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER

				driver.get("https://twitter.com/TrustAppTesting/status/1753010114510913589");
				Thread.sleep(7000);

				// locate TrustApp_mark29
				WebElement TrustApp_mark29 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark29
				JavascriptExecutor jse129 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark29);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark29
				Actions actions129 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark29).perform();
				Thread.sleep(3000);

				// locate Widget_Status29
				WebElement Widget_Status29 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(2900);

				// to highlight the Widget_Status29
				JavascriptExecutor jse10029 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 29px solid red;')",
						Widget_Status29);
				Thread.sleep(1000);

				// Get the text of Widget_Status29
				String widgetstatus29 = Widget_Status29.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m29. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus29 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher29
				WebElement News_Item_Publisher29 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher29
				JavascriptExecutor jse102929 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher29);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher29
				String Publisher29 = News_Item_Publisher29.getText();
		
				// Print the Publisher29
				System.out.println("Publisher: " + Publisher29);

				// locate TrustApp_message29
				WebElement TrustApp_message29 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message29
				JavascriptExecutor jse1029 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message29);
				Thread.sleep(1000);

				// Get the text of TrustApp_message29
				String messageText29 = TrustApp_message29.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText29);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// KNOWN_NEWS_ITEM_NO_CONNECTION

				driver.get("https://twitter.com/TrustApp_Tsting/status/1744591958805299553");
				Thread.sleep(7000);

				// locate TrustApp_mark30
				WebElement TrustApp_mark30 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark30
				JavascriptExecutor jse130 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark30);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark30
				Actions actions130 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark30).perform();
				Thread.sleep(3000);

				// locate Widget_Status30
				WebElement Widget_Status30 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3000);

				// to highlight the Widget_Status30
				JavascriptExecutor jse10030 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 30px solid red;')",
						Widget_Status30);
				Thread.sleep(1000);

				// Get the text of Widget_Status30
				String widgetstatus30 = Widget_Status30.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m30. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus30 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher30
				WebElement News_Item_Publisher30 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher30
				JavascriptExecutor jse103030 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher30);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher30
				String Publisher30 = News_Item_Publisher30.getText();
		
				// Print the Publisher30
				System.out.println("Publisher: " + Publisher30);

				// locate TrustApp_message30
				WebElement TrustApp_message30 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message30
				JavascriptExecutor jse1030 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message30);
				Thread.sleep(1000);

				// Get the text of TrustApp_message30
				String messageText30 = TrustApp_message30.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText30);
//				//--------------------------------------------------------------------------------------------------------------------------------------------------
//				
				
				// UNVERIFIED_ATTACHMENT_ORIGIN

				driver.get("https://twitter.com/Kushagra3837/status/1737691647314444773?s=20");
				Thread.sleep(7000);

				// locate TrustApp_mark31
				WebElement TrustApp_mark31 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

//				// to highlight the TrustApp_mark31
				JavascriptExecutor jse131 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark31);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark31
				Actions actions131 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark31).perform();
				Thread.sleep(3100);

				// locate Widget_Status31
				WebElement Widget_Status31 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(3100);

				// to highlight the Widget_Status31
				JavascriptExecutor jse10031 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 31px solid red;')",
						Widget_Status31);
				Thread.sleep(1000);

				// Get the text of Widget_Status31
				String widgetstatus31 = Widget_Status31.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m31. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus31 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher31
				WebElement News_Item_Publisher31 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher31
				JavascriptExecutor jse103131 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher31);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher31
				String Publisher31 = News_Item_Publisher31.getText();
		
				// Print the Publisher31
				System.out.println("Publisher: " + Publisher31);

				// locate TrustApp_message31
				WebElement TrustApp_message31 = driver.findElement(By.xpath("//div[contains(text(),'This post implies it is from CNN, one of your trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message31
				JavascriptExecutor jse1031 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message31);
				Thread.sleep(1000);

				// Get the text of TrustApp_message31
				String messageText31 = TrustApp_message31.getText();

				// Print the text
				System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText31);
				//--------------------------------------------------------------------------------------------------------------------------------------------------	
				
				

				// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1744616198325629080");
				Thread.sleep(7000);

				// locate TrustApp_mark32
				WebElement TrustApp_mark32 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark32
				JavascriptExecutor jse132 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark32);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark32
				Actions actions132 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark32).perform();
				Thread.sleep(3200);

				// locate Widget_Status32
				WebElement Widget_Status32 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3200);

				// to highlight the Widget_Status32
				JavascriptExecutor jse10032 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 32px solid red;')",
						Widget_Status32);
				Thread.sleep(1000);

				// Get the text of Widget_Status32
				String widgetstatus32 = Widget_Status32.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m32. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus32 + "\033[0m"); // \033[32m sets color to green
				System.out.println();

				// locate News_Item_Publisher32
				WebElement News_Item_Publisher32 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher32
				JavascriptExecutor jse103232 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher32);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher32
				String Publisher32 = News_Item_Publisher32.getText();
		
				// Print the Publisher32
				System.out.println("Publisher: " + Publisher32);

				// locate TrustApp_message32
				WebElement TrustApp_message32 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message32
				JavascriptExecutor jse1032 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message32);
				Thread.sleep(1000);

				// Get the text of TrustApp_message32
				String messageText32 = TrustApp_message32.getText();

				// Print the text
				System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText32);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				

				// UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742157772085485819");
				Thread.sleep(7000);

				// locate TrustApp_mark33
				WebElement TrustApp_mark33 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark33
				JavascriptExecutor jse133 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark33);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark33
				Actions actions133 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark33).perform();
				Thread.sleep(3300);

				// locate Widget_Status33
				WebElement Widget_Status33 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3300);

				// to highlight the Widget_Status33
				JavascriptExecutor jse10033 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status33);
				Thread.sleep(1000);

				// Get the text of Widget_Status33
				String widgetstatus33 = Widget_Status33.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m33. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus33 + "\033[0m"); // \033[32m sets color to green
				System.out.println();


				// locate News_Item_Publisher33
				WebElement News_Item_Publisher33 = driver.findElement(By.xpath("//a[normalize-space()='Al Jazeera English']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher33
				JavascriptExecutor jse103333 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher33);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher33
				String Publisher33 = News_Item_Publisher33.getText();
		
				// Print the Publisher33
				System.out.println("Publisher: " + Publisher33);

				// locate TrustApp_message33
				WebElement TrustApp_message33 = driver.findElement(By.xpath("//div[contains(text(),'This post neither references nor mentions a source')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message33
				JavascriptExecutor jse1133 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message33);
				Thread.sleep(1000);

				// Get the text of TrustApp_message33
				String messageText33 = TrustApp_message33.getText();

				// Print the text
				System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText33);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				

				// KNOWN_MATCHED_PUBLISHER_DOMAIN

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742154844897513817");
				Thread.sleep(7000);

				// locate TrustApp_mark34
				WebElement TrustApp_mark34 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark34
				JavascriptExecutor jse134 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark34);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark34
				Actions actions134 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark34).perform();
				Thread.sleep(3400);

				// locate Widget_Status34
				WebElement Widget_Status34 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3400);

				// to highlight the Widget_Status34
				JavascriptExecutor jse10034 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status34);
				Thread.sleep(1000);

				// Get the text of Widget_Status34
				String widgetstatus34 = Widget_Status34.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m34. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus34 + "\033[0m"); // \033[32m sets color to green
				System.out.println();


				// locate News_Item_Publisher34
				WebElement News_Item_Publisher34 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher34
				JavascriptExecutor jse103434 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher34);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher34
				String Publisher34 = News_Item_Publisher34.getText();
		
				// Print the Publisher34
				System.out.println("Publisher: " + Publisher34);

				// locate TrustApp_message34
				WebElement TrustApp_message34 = driver.findElement(By.xpath("//div[contains(text(),'This post references CNN, one of your trusted sour')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message34
				JavascriptExecutor jse1134 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message34);
				Thread.sleep(1000);

				// Get the text of TrustApp_message34
				String messageText34 = TrustApp_message34.getText();

			// Print the text
				System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText34);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				

				// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1745339217528459278");
				Thread.sleep(7000);

				// locate TrustApp_mark35
				WebElement TrustApp_mark35 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark35
				JavascriptExecutor jse135 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark35);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark35
				Actions actions135 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark35).perform();
				Thread.sleep(3500);

				// locate Widget_Status35
				WebElement Widget_Status35 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(3500);

				// to highlight the Widget_Status35
				JavascriptExecutor jse10035 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status35);
				Thread.sleep(1000);

				// Get the text of Widget_Status35
				String widgetstatus35 = Widget_Status35.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m35. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus35 + "\033[0m"); // \033[32m sets color to green
				System.out.println();


				// locate News_Item_Publisher35
				WebElement News_Item_Publisher35 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher35
				JavascriptExecutor jse103535 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher35);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher35
				String Publisher35 = News_Item_Publisher35.getText();
		
				// Print the Publisher35
				System.out.println("Publisher: " + Publisher35);

				// locate TrustApp_message35
				WebElement TrustApp_message35 = driver.findElement(By.xpath("//div[contains(text(),'This post references Reuters, one of your trusted ')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message35
				JavascriptExecutor jse1135 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message35);
				Thread.sleep(1000);

				// Get the text of TrustApp_message35
				String messageText35 = TrustApp_message35.getText();

				// Print the text
				System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText35);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742127483397267594");
				Thread.sleep(7000);

				// locate TrustApp_mark36
				WebElement TrustApp_mark36 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark36
				JavascriptExecutor jse136 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark36);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark36
				Actions actions136 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark36).perform();
				Thread.sleep(3600);

				// locate Widget_Status36
				WebElement Widget_Status36 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3600);

				// to highlight the Widget_Status36
				JavascriptExecutor jse10036 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status36);
				Thread.sleep(1000);

				// Get the text of Widget_Status36
				String widgetstatus36 = Widget_Status36.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m36. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus36 + "\033[0m"); // \033[32m sets color to green
				System.out.println();
				
			
				// locate News_Item_Publisher36
				WebElement News_Item_Publisher36 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher36
				JavascriptExecutor jse103636 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher36);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher36
				String Publisher36 = News_Item_Publisher36.getText();
		
				// Print the Publisher36
				System.out.println("Publisher: " + Publisher36);

				// locate TrustApp_message36
				WebElement TrustApp_message36 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message36
				JavascriptExecutor jse1136 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message36);
				Thread.sleep(1000);

				// Get the text of TrustApp_message36
				String messageText36 = TrustApp_message36.getText();

				// Print the text
				System.out.println("KNOWN_PUBLISHER_DOMAIN_WITH_MENTIONED_PUBLISHER: " + messageText36);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// NO_URL_TO_VERIFY

				driver.get("https://twitter.com/Kushagra3837/status/1737838697738129837");
				Thread.sleep(7000);

				// locate TrustApp_mark37
				WebElement TrustApp_mark37 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark37
				JavascriptExecutor jse137 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark37);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark37
				Actions actions137 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark37).perform();
				Thread.sleep(3700);

				// locate Widget_Status37
				WebElement Widget_Status37 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3700);

				// to highlight the Widget_Status37
				JavascriptExecutor jse10037 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status37);
				Thread.sleep(1000);

				// Get the text of Widget_Status37
				String widgetstatus37 = Widget_Status37.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m37. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus37 + "\033[0m"); // \037[37m sets color to green
				System.out.println();
	 
				// locate TrustApp_message37
				WebElement TrustApp_message37 = driver.findElement(By.xpath("//div[contains(text(),'This post does not have any reference for us to ve')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message37
				JavascriptExecutor jse1137 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message37);
				Thread.sleep(1000);

				// Get the text of TrustApp_message37
				String messageText37 = TrustApp_message37.getText();

				// Print the text
				System.out.println("NO_URL_TO_VERIFY: " + messageText37);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// CANNOT_VERIFY_IMAGE_ATTACHMENT

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742141779170758819");
				Thread.sleep(7000);

				// locate TrustApp_mark38
				WebElement TrustApp_mark38 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark38
				JavascriptExecutor jse138 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark38);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark38
				Actions actions138 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark38).perform();
				Thread.sleep(3800);

				// locate Widget_Status38
				WebElement Widget_Status38 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3800);

				// to highlight the Widget_Status38
				JavascriptExecutor jse10038 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status38);
				Thread.sleep(1000);

				// Get the text of Widget_Status38
				String widgetstatus38 = Widget_Status38.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m38. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus38 + "\033[0m"); // \038[38m sets color to green
				System.out.println();
				
			
				// locate News_Item_Publisher38
				WebElement News_Item_Publisher38 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher38
				JavascriptExecutor jse103838 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher38);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher38
				String Publisher38 = News_Item_Publisher38.getText();
		
				// Print the Publisher38
				System.out.println("Publisher: " + Publisher38);

				// locate TrustApp_message38
				WebElement TrustApp_message38 = driver.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message38
				JavascriptExecutor jse1138 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message38);
				Thread.sleep(1000);

				// Get the text of TrustApp_message38
				String messageText38 = TrustApp_message38.getText();

				// Print the text
				System.out.println("CANNOT_VERIFY_IMAGE_ATTACHMENT: " + messageText38);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// CANNOT_VERIFY_VIDEO_ATTACHMENT

				driver.get("https://twitter.com/TrustAppTesting/status/1757359834570121700");
				Thread.sleep(7000);

				// locate TrustApp_mark39
				WebElement TrustApp_mark39 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark39
				JavascriptExecutor jse139 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark39);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark39
				Actions actions139 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark39).perform();
				Thread.sleep(3900);

				// locate Widget_Status39
				WebElement Widget_Status39 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(3900);

				// to highlight the Widget_Status39
				JavascriptExecutor jse10039 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status39);
				Thread.sleep(1000);

				// Get the text of Widget_Status39
				String widgetstatus39 = Widget_Status39.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\039[1m39. STATUS\039[0m: ");
				System.out.print("\039[32m" + widgetstatus39 + "\039[0m"); // \039[39m sets color to green
				System.out.println();

				// locate News_Item_Publisher39
				WebElement News_Item_Publisher39 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher39
				JavascriptExecutor jse103939 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher39);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher39
				String Publisher39 = News_Item_Publisher39.getText();
		
				// Print the Publisher39
				System.out.println("Publisher: " + Publisher39);

				// locate TrustApp_message39
				WebElement TrustApp_message39 = driver.findElement(By.xpath("//div[contains(text(),'The attachment for this post is an image, and Trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message39
				JavascriptExecutor jse1139 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message39);
				Thread.sleep(1000);

				// Get the text of TrustApp_message39
				String messageText39 = TrustApp_message39.getText();

				// Print the text
				System.out.println("CANNOT_VERIFY_VIDEO_ATTACHMENT: " + messageText39);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				
				// PUBLISHER_MATCH

				driver.get("https://twitter.com/TrustAppTesting/status/1757366259140755898");
				Thread.sleep(7000);

				// locate TrustApp_mark40
				WebElement TrustApp_mark40 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark40
				JavascriptExecutor jse140 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark40);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark40
				Actions actions140 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark40).perform();
				Thread.sleep(4000);

				// locate Widget_Status40
				WebElement Widget_Status40 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(4000);

				// to highlight the Widget_Status40
				JavascriptExecutor jse10040 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status40);
				Thread.sleep(1000);

				// Get the text of Widget_Status40
				String widgetstatus40 = Widget_Status40.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m40. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus40 + "\033[0m"); // \040[40m sets color to green
				System.out.println();
				
				// locate News_Item_Publisher40
				WebElement News_Item_Publisher40 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher40
				JavascriptExecutor jse104040 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher40);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher40
				String Publisher40 = News_Item_Publisher40.getText();
		
				// Print the Publisher40
				System.out.println("Publisher: " + Publisher40);

				// locate TrustApp_message40
				WebElement TrustApp_message40 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message40
				JavascriptExecutor jse1140 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message40);
				Thread.sleep(1000);

				// Get the text of TrustApp_message40
				String messageText40 = TrustApp_message40.getText();

				// Print the text
				System.out.println("PUBLISHER_MATCH: " + messageText40);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// EXACT_HEADLINE_MATCH

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742151531737088311");
				Thread.sleep(7000);

				// locate TrustApp_mark41
				WebElement TrustApp_mark41 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark41
				JavascriptExecutor jse141 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark41);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark41
				Actions actions141 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark41).perform();
				Thread.sleep(4100);

				// locate Widget_Status41
				WebElement Widget_Status41 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(4100);

				// to highlight the Widget_Status41
				JavascriptExecutor jse10041 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status41);
				Thread.sleep(1000);

				// Get the text of Widget_Status41
				String widgetstatus41 = Widget_Status41.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m41. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus41 + "\033[0m"); // \041[41m sets color to green
				System.out.println();
				
		     	// locate News_Item_Publisher41
				WebElement News_Item_Publisher41 = driver.findElement(By.xpath("//a[normalize-space()='CNBC']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher41
				JavascriptExecutor jse104141 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher41);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher41
				String Publisher41 = News_Item_Publisher41.getText();
		
				// Print the Publisher41
				System.out.println("Publisher: " + Publisher41);

				// locate TrustApp_message41
				WebElement TrustApp_message41 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message41
				JavascriptExecutor jse1141 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message41);
				Thread.sleep(1000);

				// Get the text of TrustApp_message41
				String messageText41 = TrustApp_message41.getText();

				// Print the text
				System.out.println("EXACT_HEADLINE_MATCH: " + messageText41);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// SEMANTIC_HEADLINE_MATCH

				driver.get("https://twitter.com/TrustAppTesting/status/1752952096771465711");
				Thread.sleep(7000);

				// locate TrustApp_mark42
				WebElement TrustApp_mark42 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark42
				JavascriptExecutor jse142 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark42);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark42
				Actions actions142 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark42).perform();
				Thread.sleep(4200);

				// locate Widget_Status42
				WebElement Widget_Status42 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(4200);

				// to highlight the Widget_Status42
				JavascriptExecutor jse10042 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status42);
				Thread.sleep(1000);

				// Get the text of Widget_Status42
				String widgetstatus42 = Widget_Status42.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m42. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus42 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher42
				WebElement News_Item_Publisher42 = driver.findElement(By.xpath("(//a[normalize-space()='The Economist'])[1]"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher42
				JavascriptExecutor jse104242 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher42);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher42
				String Publisher42 = News_Item_Publisher42.getText();
		
				// Print the Publisher42
				System.out.println("Publisher: " + Publisher42);

				// locate TrustApp_message42
				WebElement TrustApp_message42 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message42
				JavascriptExecutor jse1142 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message42);
				Thread.sleep(1000);

				// Get the text of TrustApp_message42
				String messageText42 = TrustApp_message42.getText();

				// Print the text
				System.out.println("SEMANTIC_HEADLINE_MATCH: " + messageText42);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// SEMANTIC_HEADLINE_CONTRADICTION

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742495649491304865");
				Thread.sleep(7000);

				// locate TrustApp_mark43
				WebElement TrustApp_mark43 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark43
				JavascriptExecutor jse143 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark43);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark43
				Actions actions143 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark43).perform();
				Thread.sleep(4300);

				// locate Widget_Status43
				WebElement Widget_Status43 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(4300);

				// to highlight the Widget_Status43
				JavascriptExecutor jse10043 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status43);
				Thread.sleep(1000);

				// Get the text of Widget_Status43
				String widgetstatus43 = Widget_Status43.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m43. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus43 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher43
				WebElement News_Item_Publisher43 = driver.findElement(By.xpath("(//a[normalize-space()='The Economist'])[1]"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher43
				JavascriptExecutor jse104343 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher43);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher43
				String Publisher43 = News_Item_Publisher43.getText();
		
				// Print the Publisher43
				System.out.println("Publisher: " + Publisher43);

				// locate TrustApp_message43
				WebElement TrustApp_message43 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message43
				JavascriptExecutor jse1143 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message43);
				Thread.sleep(1000);

				// Get the text of TrustApp_message43
				String messageText43 = TrustApp_message43.getText();

				// Print the text
				System.out.println("SEMANTIC_HEADLINE_CONTRADICTION: " + messageText43);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// PUBLISHER_MATCH

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742430282496495876");
				Thread.sleep(7000);

				// locate TrustApp_mark44
				WebElement TrustApp_mark44 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark44
				JavascriptExecutor jse144 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark44);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark44
				Actions actions144 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark44).perform();
				Thread.sleep(4400);

				// locate Widget_Status44
				WebElement Widget_Status44 = driver.findElement(By.xpath("//div[@class='tag green']"));
				Thread.sleep(4400);

				// to highlight the Widget_Status44
				JavascriptExecutor jse10044 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status44);
				Thread.sleep(1000);

				// Get the text of Widget_Status44
				String widgetstatus44 = Widget_Status44.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m44. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus44 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher44
				WebElement News_Item_Publisher44 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher44
				JavascriptExecutor jse104444 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher44);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher44
				String Publisher44 = News_Item_Publisher44.getText();
		
				// Print the Publisher44
				System.out.println("Publisher: " + Publisher44);

				// locate TrustApp_message44
				WebElement TrustApp_message44 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message44
				JavascriptExecutor jse1144 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message44);
				Thread.sleep(1000);

				// Get the text of TrustApp_message44
				String messageText44 = TrustApp_message44.getText();

				// Print the text
				System.out.println("PUBLISHER_MATCH: " + messageText44);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742433135424319884");
				Thread.sleep(7000);

				// locate TrustApp_mark45
				WebElement TrustApp_mark45 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark45
				JavascriptExecutor jse145 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark45);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark45
				Actions actions145 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark45).perform();
				Thread.sleep(4500);

				// locate Widget_Status45
				WebElement Widget_Status45 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(4500);

				// to highlight the Widget_Status45
				JavascriptExecutor jse10045 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status45);
				Thread.sleep(1000);

				// Get the text of Widget_Status45
				String widgetstatus45 = Widget_Status45.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m45. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus45 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher45
				WebElement News_Item_Publisher45 = driver.findElement(By.xpath("//a[normalize-space()='NPR']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher45
				JavascriptExecutor jse104545 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher45);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher45
				String Publisher45 = News_Item_Publisher45.getText();
		
				// Print the Publisher45
				System.out.println("Publisher: " + Publisher45);

				// locate TrustApp_message45
				WebElement TrustApp_message45 = driver.findElement(By.xpath("//div[contains(text(),'The text of the post mentions BBC, one of your tru')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message45
				JavascriptExecutor jse1145 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message45);
				Thread.sleep(1000);

				// Get the text of TrustApp_message45
				String messageText45 = TrustApp_message45.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_WRONG_REFERENCED_PUBLISHER: " + messageText45);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

				driver.get("https://twitter.com/TrustAppTesting/status/1753010685858947287");
				Thread.sleep(7000);

				// locate TrustApp_mark46
				WebElement TrustApp_mark46 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark46
				JavascriptExecutor jse146 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark46);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark46
				Actions actions146 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark46).perform();
				Thread.sleep(4600);

				// locate Widget_Status46
				WebElement Widget_Status46 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(4600);

				// to highlight the Widget_Status46
				JavascriptExecutor jse10046 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status46);
				Thread.sleep(1000);

				// Get the text of Widget_Status46
				String widgetstatus46 = Widget_Status46.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m46. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus46 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher46
				WebElement News_Item_Publisher46 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher46
				JavascriptExecutor jse104646 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher46);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher46
				String Publisher46 = News_Item_Publisher46.getText();
		
				// Print the Publisher46
				System.out.println("Publisher: " + Publisher46);

				// locate TrustApp_message46
				WebElement TrustApp_message46 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message46
				JavascriptExecutor jse1146 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message46);
				Thread.sleep(1000);

				// Get the text of TrustApp_message46
				String messageText46 = TrustApp_message46.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText46);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// KNOWN_NEWS_ITEM_NO_CONNECTION

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742504998133502353");
				Thread.sleep(7000);

				// locate TrustApp_mark47
				WebElement TrustApp_mark47 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark47
				JavascriptExecutor jse147 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark47);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark47
				Actions actions147 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark47).perform();
				Thread.sleep(4700);

				// locate Widget_Status47
				WebElement Widget_Status47 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(4700);

				// to highlight the Widget_Status47
				JavascriptExecutor jse10047 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status47);
				Thread.sleep(1000);

				// Get the text of Widget_Status47
				String widgetstatus47 = Widget_Status47.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m47. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus47 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
			
				// locate News_Item_Publisher47
				WebElement News_Item_Publisher47 = driver.findElement(By.xpath("//a[normalize-space()='The New York Times']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher47
				JavascriptExecutor jse104747 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher47);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher47
				String Publisher47 = News_Item_Publisher47.getText();
		
				// Print the Publisher47
				System.out.println("Publisher: " + Publisher47);

				// locate TrustApp_message47
				WebElement TrustApp_message47 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message47
				JavascriptExecutor jse1147 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message47);
				Thread.sleep(1000);

				// Get the text of TrustApp_message47
				String messageText47 = TrustApp_message47.getText();

				// Print the text
				System.out.println("KNOWN_NEWS_ITEM_NO_CONNECTION: " + messageText47);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
//				// UNVERIFIED_ATTACHMENT_ORIGIN

				driver.get("https://twitter.com/Kushagra3837/status/1737691647314444773?s=20");
				Thread.sleep(7000);

				// locate TrustApp_mark48
				WebElement TrustApp_mark48 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark48
				JavascriptExecutor jse148 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark48);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark48
				Actions actions148 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark48).perform();
				Thread.sleep(1000);

				// locate Widget_Status48
				WebElement Widget_Status48 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(1000);

				// to highlight the Widget_Status48
				JavascriptExecutor jse10048 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status48);
				Thread.sleep(1000);

				// Get the text of Widget_Status48
				String widgetstatus48 = Widget_Status48.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m48. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus48 + "\033[0m"); // \033[32m sets color to green
				System.out.println();
			

				// locate TrustApp_message48
				WebElement TrustApp_message48 = driver.findElement(By.xpath("//div[contains(text(),'This post implies it is from CNN, one of your trus')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message48
				JavascriptExecutor jse1148 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message48);
				Thread.sleep(1000);

				// Get the text of TrustApp_message48
				String messageText48 = TrustApp_message48.getText();

				// Print the text
				System.out.println("UNVERIFIED_ATTACHMENT_ORIGIN: " + messageText48);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				
				// UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1744617181449458046");
				Thread.sleep(7000);

				// locate TrustApp_mark49
				WebElement TrustApp_mark49 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark49
				JavascriptExecutor jse149 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark49);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark
				Actions actions150 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark49).perform();
				Thread.sleep(5000);

				// locate Widget_Status49
				WebElement Widget_Status49 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(5000);

				// to highlight the Widget_Status49
				JavascriptExecutor jse10049 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status49);
				Thread.sleep(1000);

				// Get the text of Widget_Status49
				String widgetstatus49 = Widget_Status49.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m49. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus49 + "\033[0m"); // \033[32m sets color to green
				System.out.println();
				
				// locate News_Item_Publisher49
				WebElement News_Item_Publisher49 = driver.findElement(By.xpath("//a[normalize-space()='The Economist']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher49
				JavascriptExecutor jse105049 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher49);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher49
				String Publisher49 = News_Item_Publisher49.getText();
		
				// Print the Publisher49
				System.out.println("Publisher: " + Publisher49);
			

				// locate TrustApp_message49
				WebElement TrustApp_message49 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message49
				JavascriptExecutor jse1149 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message49);
				Thread.sleep(1000);

				// Get the text of TrustApp_message49
				String messageText49 = TrustApp_message49.getText();

				// Print the text
				System.out.println("UNKNOWN_NEWS_ITEM_KNOWN_MENTIONED_PUBLISHER: " + messageText49);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
//				 UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742443757583143407");
				Thread.sleep(7000);

				// locate TrustApp_mark50
				WebElement TrustApp_mark50 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark50
				JavascriptExecutor jse150 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark50);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark50
				Actions actions1150 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark50).perform();
				Thread.sleep(5000);

				// locate Widget_Status50
				WebElement Widget_Status50 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(5000);

				// to highlight the Widget_Status50
				JavascriptExecutor jse10050 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status50);
				Thread.sleep(1000);

				// Get the text of Widget_Status50
				String widgetstatus50 = Widget_Status50.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m50. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus50 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
						
				

				// locate TrustApp_message50
				WebElement TrustApp_message50 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message50
				JavascriptExecutor jse1150 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message50);
				Thread.sleep(1000);

				// Get the text of TrustApp_message50
				String messageText50 = TrustApp_message50.getText();

				// Print the text
				System.out.println("UNKNOWN_NEWS_ITEM_NO_PUBLISHER_MENTIONED: " + messageText50);
				//--------------------------------------------------------------------------------------------------------------------------------------------------
				
				// KNOWN_MATCHED_PUBLISHER_DOMAIN

				driver.get("https://twitter.com/TrustApp_Tsting/status/1742422582861643850");
				Thread.sleep(7000);

				// locate TrustApp_mark51
				WebElement TrustApp_mark51 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark51
				JavascriptExecutor jse151 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark51);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark51
				Actions actions1151 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark51).perform();
				Thread.sleep(5100);

				// locate Widget_Status51
				WebElement Widget_Status51 = driver.findElement(By.xpath("//div[@class='tag']"));
				Thread.sleep(5100);

				// to highlight the Widget_Status51
				JavascriptExecutor jse10051 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status51);
				Thread.sleep(1000);

				// Get the text of Widget_Status51
				String widgetstatus51 = Widget_Status51.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m51. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus51 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
						
				// locate News_Item_Publisher51
				WebElement News_Item_Publisher51 = driver.findElement(By.xpath("//a[normalize-space()='CNN']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher51
				JavascriptExecutor jse105151 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher51);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher51
				String Publisher51 = News_Item_Publisher51.getText();
		
				// Print the Publisher51
				System.out.println("Publisher: " + Publisher51);

				// locate TrustApp_message51
				WebElement TrustApp_message51 = driver.findElement(By.xpath("//div[@class='text']//div[1]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message51
				JavascriptExecutor jse1151 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message51);
				Thread.sleep(1000);

				// Get the text of TrustApp_message51
				String messageText51 = TrustApp_message51.getText();

				// Print the text
				System.out.println("KNOWN_MATCHED_PUBLISHER_DOMAIN: " + messageText51);
				
				//------------------------------------------------------------------------------------------------------------------------------

				// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1745323107437457564");
				Thread.sleep(7000);

				// locate TrustApp_mark52
				WebElement TrustApp_mark52 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark52
				JavascriptExecutor jse152 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark52);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark52
				Actions actions1152 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark52).perform();
				Thread.sleep(5200);

				// locate Widget_Status52
				WebElement Widget_Status52 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(5200);

				// to highlight the Widget_Status52
				JavascriptExecutor jse10052 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status52);
				Thread.sleep(1000);

				// Get the text of Widget_Status52
				String widgetstatus52 = Widget_Status52.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m52. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus52 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
						
				// locate News_Item_Publisher52
				WebElement News_Item_Publisher52 = driver.findElement(By.xpath("//a[normalize-space()='POLITICO']"));
				Thread.sleep(1000);
		
				// to highlight the News_Item_Publisher52
				JavascriptExecutor jse105252 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')",
						News_Item_Publisher52);
				Thread.sleep(1000);
		
				// Get the text of News_Item_Publisher52
				String Publisher52 = News_Item_Publisher52.getText();
		
				// Print the Publisher52
				System.out.println("Publisher: " + Publisher52);

				// locate TrustApp_message52
				WebElement TrustApp_message52 = driver.findElement(By.xpath("//div[contains(text(),'This post references NPR, one of your trusted sour')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message52
				JavascriptExecutor jse1152 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message52);
				Thread.sleep(1000);

				// Get the text of TrustApp_message52
				String messageText52 = TrustApp_message52.getText();

				// Print the text
				System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText52);
				
				//------------------------------------------------------------------------------------------------------------------------------

				// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER

				driver.get("https://twitter.com/TrustApp_Tsting/status/1749722038195863608");
				Thread.sleep(7000);

				// locate TrustApp_mark53
				WebElement TrustApp_mark53 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
				Thread.sleep(1000);

				// to highlight the TrustApp_mark53
				JavascriptExecutor jse153 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_mark53);
				Thread.sleep(1000);

				// Perform a hover action on TrustApp_mark53
				Actions actions1153 = new Actions(driver);
				actions1.moveToElement(TrustApp_mark53).perform();
				Thread.sleep(5300);

				// locate Widget_Status53
				WebElement Widget_Status53 = driver.findElement(By.xpath("//div[@class='tag danger']"));
				Thread.sleep(5300);

				// to highlight the Widget_Status53
				JavascriptExecutor jse10053 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						Widget_Status53);
				Thread.sleep(1000);

				// Get the text of Widget_Status53
				String widgetstatus53 = Widget_Status53.getText();

				// Print the status with only the word "STATUS" in bold and the widget status in green
				System.out.print("\033[1m53. STATUS\033[0m: ");
				System.out.print("\033[32m" + widgetstatus53 + "\033[0m"); // \042[42m sets color to green
				System.out.println();
						
	     		// locate TrustApp_message53
				WebElement TrustApp_message53 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
				Thread.sleep(1000);

				// to highlight the TrustApp_message53
				JavascriptExecutor jse1153 = (JavascriptExecutor) driver;
				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
						TrustApp_message53);
				Thread.sleep(1000);

				// Get the text of TrustApp_message53
				String messageText53 = TrustApp_message53.getText();

				// Print the text
				System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText53);
				
				//------------------------------------------------------------------------------------------------------------------------------

//				// KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER
//
//				driver.get("https://twitter.com/TrustApp_Tsting/status/1749722038195863608");
//				Thread.sleep(7000);
//
//				// locate TrustApp_mark53
//				WebElement TrustApp_mark53 = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
//				Thread.sleep(1000);
//
//				// to highlight the TrustApp_mark53
//				JavascriptExecutor jse153 = (JavascriptExecutor) driver;
//				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
//						TrustApp_mark53);
//				Thread.sleep(1000);
//
//				// Perform a hover action on TrustApp_mark53
//				Actions actions1153 = new Actions(driver);
//				actions1.moveToElement(TrustApp_mark53).perform();
//				Thread.sleep(5300);
//
//				// locate Widget_Status53
//				WebElement Widget_Status53 = driver.findElement(By.xpath("//div[@class='tag danger']"));
//				Thread.sleep(5300);
//
//				// to highlight the Widget_Status53
//				JavascriptExecutor jse10053 = (JavascriptExecutor) driver;
//				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
//						Widget_Status53);
//				Thread.sleep(1000);
//
//				// Get the text of Widget_Status53
//				String widgetstatus53 = Widget_Status53.getText();
//
//				// Print the status with only the word "STATUS" in bold and the widget status in green
//				System.out.print("\033[1m53. STATUS\033[0m: ");
//				System.out.print("\033[32m" + widgetstatus53 + "\033[0m"); // \042[42m sets color to green
//				System.out.println();
//						
//	     		// locate TrustApp_message53
//				WebElement TrustApp_message53 = driver.findElement(By.xpath("//div[contains(text(),'Default Message')]"));
//				Thread.sleep(1000);
//
//				// to highlight the TrustApp_message53
//				JavascriptExecutor jse1153 = (JavascriptExecutor) driver;
//				jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
//						TrustApp_message53);
//				Thread.sleep(1000);
//
//				// Get the text of TrustApp_message53
//				String messageText53 = TrustApp_message53.getText();
//
//				// Print the text
//				System.out.println("KNOWN_PUBLISHER_DOMAIN_DIFFERENT_REFERENCED_PUBLISHER: " + messageText53);
//				
//				//------------------------------------------------------------------------------------------------------------------------------
//
//				
//				
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
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
