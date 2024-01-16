package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;



public class demotrial {
	

	
	  public static void main(String[] args) throws InterruptedException {
	        // Set the path to the ChromeDriver executable.
	    	
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver.exe");

	    	WebDriverManager.chromedriver().setup();
	    	ChromeOptions options = new ChromeOptions();
	    	options.addExtensions(new File("./Extensions1/TrustApp 1.1.14.0.crx"));
	    	WebDriver driver = new ChromeDriver(options);


	        // Navigate to a website (replace with the desired URL).
	        driver.get("https://twitter.com/home");

	        Thread.sleep(3000);

	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	        // locate Username
	        WebElement Username = driver.findElement(By.xpath("//input[@name='text']"));

	        // to highlight the Chrome_Web_Store
	        JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	        jse1.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", Username);
	        Thread.sleep(2000);

	        Username.click();
	        Username.clear();
	        Username.sendKeys("TrustApp_Tsting");
	        Thread.sleep(3000);

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
	        Password.sendKeys("TrustApp@4948");
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
	        Thread.sleep(2000);

	        js.executeScript("window.scrollBy(0,450)", "");
	        Thread.sleep(2000);

	        js.executeScript("window.scrollBy(0,550)", "");
	        Thread.sleep(2000);

	        js.executeScript("window.scrollBy(0,650)", "");
	        Thread.sleep(2000);

	        
	        //------------------------------------------------------------------------------------------------------------------------
	        
	        
	        // locate Search_bar
	        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));

	        // to highlight the Search_bar
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
	        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist']"));

	        // to highlight the The_Economist
	        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
	        jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", The_Economist);
	        Thread.sleep(2000);

	        The_Economist.click();
	        jse6.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(3000);

	        // locate TrustApp_mark
	        WebElement TrustApp_mark = driver.findElement(By.xpath("(//img[@alt='TrustApp mark'])[1]"));

	        // to highlight the TrustApp_mark
	        JavascriptExecutor jse7 = (JavascriptExecutor) driver;
	        jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark);
	        Thread.sleep(2000);

	        // Perform a hover action on TrustApp_mark
	        Actions actions = new Actions(driver);
	        actions.moveToElement(TrustApp_mark).perform();
	             
	        
	        jse7.executeScript("window.scrollBy(0,850)", "");

	        // locate TrustApp_mark1
	        WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

	        // to highlight the TrustApp_mark
	        JavascriptExecutor jse17 = (JavascriptExecutor) driver;
	        jse17.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark1);
	        Thread.sleep(2000);

	        // Perform a hover action on TrustApp_mark
	        Actions actions1 = new Actions(driver);
	        actions1.moveToElement(TrustApp_mark).perform();

	        
	      //--------------------------------------------------------------------------------------------------------------------------------        
	        
	        
	        
	        // locate Search_bar1
	        WebElement Search_bar1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));

	        // to highlight the Search_bar1
	        JavascriptExecutor jse8 = (JavascriptExecutor) driver;
	        jse8.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar1);
	        Thread.sleep(2000);

	        Search_bar1.click();
	        Search_bar1.clear();
	        Thread.sleep(1000);

	        Search_bar1.sendKeys("CNN");
	        Thread.sleep(2000);

	        Search_bar1.sendKeys(Keys.RETURN);
	        Thread.sleep(3000);
	        
	        
	     // locate CNN
	        WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));

	        // to highlight the CNN
	        JavascriptExecutor jse9 = (JavascriptExecutor) driver;
	        jse9.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", CNN);
	        Thread.sleep(2000);
	        
	        CNN.click();
	        jse9.executeScript("window.scrollBy(0,450)", "");
	        Thread.sleep(3000);
	        
	        // locate TrustApp_mark1
	        WebElement TrustApp_mark11 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

	        // to highlight the TrustApp_mark
	        JavascriptExecutor jse10 = (JavascriptExecutor) driver;
	        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark11);
	        Thread.sleep(2000);

	        // Perform a hover action on TrustApp_mark
	        Actions actions11 = new Actions(driver);
	        actions11.moveToElement(TrustApp_mark11).perform();
	        
	        //--------------------------------------------------------------------------------------------------------------
	        
	        
	        // locate Search_bar10
	        WebElement Search_bar10 = driver.findElement(By.xpath("//input[@placeholder='Search']"));

	        // to highlight the Search_bar
	        JavascriptExecutor jse55 = (JavascriptExecutor) driver;
	        jse55.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar10);
	        Thread.sleep(2000);

	        Search_bar10.click();
	        Search_bar10.clear();
	        Thread.sleep(1000);

	        Search_bar10.sendKeys("The New York Times");
	        Thread.sleep(1000);

	        Search_bar10.sendKeys(Keys.RETURN);
	        Thread.sleep(3000);

	        
	        
	        
	        // locate The_New_York_Times
	        WebElement The_New_York_Times = driver.findElement(By.xpath("//span[normalize-space()='@nytimes']"));

	        // to highlight the The_New_York_Times
	        JavascriptExecutor jse66 = (JavascriptExecutor) driver;
	        jse66.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", The_New_York_Times);
	        Thread.sleep(2000);

	        The_New_York_Times.click();
	        jse6.executeScript("window.scrollBy(0,350)", "");
	        Thread.sleep(3000);

	        // locate TrustApp_mark5
	        WebElement TrustApp_mark5 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));

	        // to highlight the TrustApp_mark5
	        JavascriptExecutor jse77 = (JavascriptExecutor) driver;
	        jse77.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark5);
	        Thread.sleep(2000);

	        // Perform a hover action on TrustApp_mark
	        Actions actions7 = new Actions(driver);
	        actions.moveToElement(TrustApp_mark5).perform();
	        
	        
	        
//	        WebElement newsElement = driver.findElement(By.cssSelector("div[id='id__wagpq6ggja'] span[class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3']"));
//	        String newsText = newsElement.getText();
//	        System.out.println(newsText);
	        
	        
	        
	        
//	        // locate Profile
	        WebElement Profile = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));

	        // to highlight the Profile
	        JavascriptExecutor jse11 = (JavascriptExecutor) driver;
	        jse11.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile);
	        Thread.sleep(2000);
	        
	        Profile.click();
	        
	        Thread.sleep(3000);
	        
	        // locate Post
	        WebElement Post = driver.findElement(By.xpath("//a[@aria-label='Post']"));

	        // to highlight the Post
	        JavascriptExecutor jse111 = (JavascriptExecutor) driver;
	        jse111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post);
	        Thread.sleep(2000);
	        
	        Post.click();
	        
	        Thread.sleep(3000);
	        
	        
	        // locate Post_text
	        WebElement Post_text = driver.findElement(By.xpath("//div[@aria-label='Post text']"));

	        // to highlight the Post_text
	        JavascriptExecutor jse12 = (JavascriptExecutor) driver;
	        jse12.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text);
	        Thread.sleep(2000);
	        
	        Post_text.click();
	        Post_text.clear();
	        
	        Post_text.sendKeys("  https://www.economist.com/interactive/international/2023/08/03/western-values-are-steadily-diverging-from-the-rest-of-the-world");
	        
	        Thread.sleep(4000);
	        
	        
	        // locate Post1
	        WebElement Post1 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));

	        // to highlight the Post
	        JavascriptExecutor jse13 = (JavascriptExecutor) driver;
	        jse13.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post1);
	        Thread.sleep(2000);
	        
	      
	        Post1.click();
	        
	        Thread.sleep(2000);
//	//
	        
	        // locate Post11
	        WebElement Post11 = driver.findElement(By.xpath("//a[@aria-label='Post']"));

	        // to highlight the Post
	        JavascriptExecutor jse1111 = (JavascriptExecutor) driver;
	        jse1111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post11);
	        Thread.sleep(2000);
	        
	        Post11.click();
	        
	        Thread.sleep(3000);
	        
	        
	        // locate Post_text11
	        WebElement Post_text11 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));

	        // to highlight the Post_text
	        JavascriptExecutor jse112 = (JavascriptExecutor) driver;
	        jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text11);
	        Thread.sleep(2000);
	        
	        Post_text11.click();
	        Post_text11.clear();
	        
	        Post_text11.sendKeys("https://edition.cnn.com/2024/01/01/europe/megalosaurus-first-dinosaur-discovery-scn/index.html");
	        
	        Thread.sleep(4000);
	        
	        
	        // locate Post10
	        WebElement Post10 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));

	        // to highlight the Post10
	        JavascriptExecutor jse133 = (JavascriptExecutor) driver;
	        jse133.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post10);
	        Thread.sleep(2000);
	        
	      
	        Post10.click();
	        
	        Thread.sleep(2000);

//	        
	        // locate Profile
	        WebElement Profile1 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));

	        // to highlight the Profile
	        JavascriptExecutor jse14 = (JavascriptExecutor) driver;
	        jse14.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile1);
	        Thread.sleep(2000);
	        
	      
	        Profile1.click();
	        
	        Thread.sleep(2000);
	        
	         jse14.executeScript("window.scrollBy(0,350)", "");
	         
	         // locate TrustApp_mark3
	         WebElement TrustApp_mark3 = driver.findElement(By.xpath("//div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']"));

	         // to highlight the TrustApp_mark3
	         JavascriptExecutor jse15 = (JavascriptExecutor) driver;
	         jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark3);
	         Thread.sleep(2000);

	         // Perform a hover action on TrustApp_mark3
	         Actions actions2 = new Actions(driver);
	         actions11.moveToElement(TrustApp_mark3).perform();
	         
	      // Perform a hover action on TrustApp_mark3
	         Actions actions3 = new Actions(driver);
	         actions11.moveToElement(TrustApp_mark3).perform();
//	         
	         
	         
	         
	         
	         
	         
	         // locate home
		        WebElement home = driver.findElement(By.xpath("//span[normalize-space()='Home']"));

		        // to highlight the Post
		        JavascriptExecutor jse1333 = (JavascriptExecutor) driver;
		        jse1333.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", home);
		        Thread.sleep(2000);
		        
		      
		        home.click();
		        home.click();
		        home.click();
		        
		        Thread.sleep(2000);
	         driver.navigate().refresh();
	         
	         
	         
	         
	       

//	         
//	         
//	         
	        
		      
	       //div[@id='id__ixfamorzne']//img[@alt='TrustApp mark']
	       //div[@id='id__7jiww7yuudc']//img[@alt='TrustApp mark']
	       //div[@id='id__kz1dghloz3']//img[@alt='TrustApp mark']
	         
	         
		        // locate Status
		        WebElement Status = driver.findElement(By.xpath("//img[@alt='TrustApp mark']"));
		        
//		      //div[@id='id__5zzp422edck']//img[@alt='TrustApp mark']
//		      //div[@id='id__3fcwomipzfh']//img[@alt='TrustApp mark']
//		      //div[@id='id__3j4lge6sbhs']//img[@alt='TrustApp mark']
//
		        // to highlight the Status
		        JavascriptExecutor jse13333 = (JavascriptExecutor) driver;
		        jse13333.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Status);
		        Thread.sleep(2000);
		        
		        
			      // Perform a hover action on Status
			         Actions actions31 = new Actions(driver);
			         actions1.moveToElement(Status).perform();
		        
//		        // locate Status1
//		        WebElement Status1 = driver.findElement(By.xpath("//div[@id='id__6hx6671hyd']//img[@alt='TrustApp mark']"));
//
//		        // to highlight the Status
//		        JavascriptExecutor jse113333 = (JavascriptExecutor) driver;
//		        jse113333.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Status1);
//		        Thread.sleep(2000);
//	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
		        
		        
		        
		        
		        
		        
		        
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
//	         // locate Post0
//	         WebElement Post0 = driver.findElement(By.xpath("//a[@aria-label='Post']"));
	//
//	         // to highlight the Post
//	         JavascriptExecutor jse11111 = (JavascriptExecutor) driver;
//	         jse11111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post0);
//	         Thread.sleep(2000);
//	         
//	         Post0.click();
////	         
//	         
//	         
//	         
//	         Thread.sleep(3000);
//	        
//	         // locate Post_text1
//	         WebElement Post_text1 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
	//
//	         // to highlight the Post_text1
//	         JavascriptExecutor jse112 = (JavascriptExecutor) driver;
//	         jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text1);
//	         Thread.sleep(2000);
//	         
//	         Post_text1.click();
//	         Post_text1.clear();
//	         
//	         Post_text1.sendKeys("Test");
//	         
//	         Thread.sleep(4000);
//	         
//	         
//	         
//	         // locate Post2
//	         WebElement Post2 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
	//
//	         // to highlight the Post2
//	         JavascriptExecutor jse16 = (JavascriptExecutor) driver;
//	         jse16.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post2);
//	         Thread.sleep(2000);
//	         
//	       
//	         Post2.click();
//	         
//	         
//	         Thread.sleep(2000);
//	         
//	         // locate Profile2
//	         WebElement Profile2 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
	//
//	         // to highlight the Profile2
//	         JavascriptExecutor jse114 = (JavascriptExecutor) driver;
//	         jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile2);
//	         Thread.sleep(2000);
//	         
//	       
//	         Profile2.click();
//	         
//	         Thread.sleep(2000);
//	         
//	          jse14.executeScript("window.scrollBy(0,350)", "");
//	          
//	          // locate TrustApp_mark4
//	          WebElement TrustApp_mark4 = driver.findElement(By.xpath("//div[@id='id__xsyo9ok2ig']//img[@alt='TrustApp mark']"));
	//
//	          // to highlight the TrustApp_mark4
//	          JavascriptExecutor jse115 = (JavascriptExecutor) driver;
//	          jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark4);
//	          Thread.sleep(2000);
	//
//	          // Perform a hover action on TrustApp_mark4
//	          Actions actions3 = new Actions(driver);
//	          actions3.moveToElement(TrustApp_mark4).perform();
//	          
	////----------------------------------------------------------------------------------------------------------
//	         
//	          // locate Post3
//	          WebElement Post3 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
	//
//	          // to highlight the Post
//	          JavascriptExecutor jse113 = (JavascriptExecutor) driver;
//	          jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post3);
//	          Thread.sleep(2000);
//	          
//	        
//	          Post3.click();
//	          
//	          Thread.sleep(2000);
//	          
//	          
	          
	          
	          
	          
	          
	          
//	          // locate Post_text2
//	          WebElement Post_text2 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
	//
//	          // to highlight the Post_text1
//	          JavascriptExecutor jse1112 = (JavascriptExecutor) driver;
//	          jse1112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text2);
//	          Thread.sleep(2000);
//	          
//	          Post_text2.click();
//	          Post_text2.clear();
//	          
//	          Post_text2.sendKeys("Israel-Hamas war live: 14 killed by Israeli bombing of house in Gaza    https://www.aljazeera.com/news/liveblog/2024/1/4/israel-hamas-war-live-bloody-day-for-hezbollah-tensions-with-israel-soar");
////	          
////	          
//	          Thread.sleep(4000);
//	          
//	          // locate Post4
//	          WebElement Post4 = driver.findElement(By.xpath("//span[contains(text(),'Post')]"));
	//
//	          // to highlight the Post4
//	          JavascriptExecutor jse116 = (JavascriptExecutor) driver;
//	          jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post4);
//	          Thread.sleep(2000);
//	          
//	        
//	          Post4.click();
//	          
//	          
//	          Thread.sleep(2000);
//	          
	//
//	     //----------------------------------------------------------     
	          
	          // locate Home_mark5
	    WebElement Home_mark5 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));
	    
	    // Perform a hover action on TrustApp_mark4
	  Actions actions44 = new Actions(driver);
	  actions44.moveToElement(Home_mark5).perform();
//	                                                          ////div[@id='id__znj3gu0ho6']//img[@alt='TrustApp mark']
	                                                             ////div[@id='id__rdko57jecvb']//img[@alt='TrustApp mark']
	                                                             //div[@id='id__pw241ui0z6']//img[@alt='TrustApp mark']   
	       
	       
	     //div[@id='id__54vk6huz23j']//img[@alt='TrustApp mark']
	     //div[@id='id__vitds5cxa5s']//img[@alt='TrustApp mark']
	     //div[@id='id__fa15rtfx6ug']//img[@alt='TrustApp mark']
	       
//	       
//	       
//	       
//	       
//	        // to highlight the TrustApp_mark5
//	        JavascriptExecutor jse1115 = (JavascriptExecutor) driver;
//	        jse1115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark5);
//	        Thread.sleep(2000);
	//
//	        // Perform a hover action on TrustApp_mark5
//	        Actions actions33 = new Actions(driver);
//	        actions33.moveToElement(Home_mark5).perform();
//	        
//	        //---------------------------------------------------------------
//	        // locate Home_mark6
//	        WebElement Home_mark6 = driver.findElement(By.xpath("//div[@id='id__ypoqbktwo']//img[@alt='TrustApp mark']"));
	// //
//	         // to highlight the TrustApp_mark5
//	         JavascriptExecutor jse11115 = (JavascriptExecutor) driver;
//	         jse11115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark6);
//	         Thread.sleep(2000);
	//
//	         // Perform a hover action on TrustApp_mark5
//	         Actions actions4 = new Actions(driver);
//	         actions4.moveToElement(Home_mark5).perform();
//	         jse11115.executeScript("window.scrollBy(0,850)", "");
//	          
//	          
//	          //-----------------------------------------------------------------------
//	         
//	         // locate Home_mark7
//	         WebElement Home_mark7 = driver.findElement(By.xpath("//div[@id='id__si8is5wjhue']//img[@alt='TrustApp mark']"));
	//  //
//	          // to highlight the TrustApp_mark5
//	          JavascriptExecutor jse111115 = (JavascriptExecutor) driver;
//	          jse111115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark7);
//	          Thread.sleep(2000);
	//
//	          // Perform a hover action on TrustApp_mark5
//	          Actions actions5 = new Actions(driver);
//	          actions5.moveToElement(Home_mark5).perform();
//	         
//	        // Scroll down
//	       // js.executeScript("window.scrollBy(0,850)", "");
	  
	  
	  driver.quit();
	//
	       
	    }
	
}












