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

public class ChromeExtensionAutomation_clone {
	
	

    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions option = new ChromeOptions();
        // Set the path to the ChromeDriver executable.
<<<<<<< HEAD
        option.setBinary("C:\\Users\\praka\\Downloads\\chromedriver_win32 (17)\\chromedriver.exe");
//        WebDriver driver= new ChromeDriver(option);

        String url = "https://twitter.com/TheEconomist";
        String extensionId = "gbjgcjcomfhmleglhdfgibgnmplodedb"; // Replace with your extension ID
=======
    	
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create an instance of ChromeOptions.
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./Extensions/TrustApp 1.1.12.0.crx"));
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225

        WebDriver driver = openChromeWithExtension(url, extensionId);

        driver.get("https://twitter.com/home");

        Thread.sleep(3000);

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Username = driver.findElement(By.xpath("//input[@name='text']"));
        highlightElement(driver, Username);
        Thread.sleep(2000);
        Username.click();
        Username.clear();
<<<<<<< HEAD
        Username.sendKeys("TrustAppTesting");
=======
        Username.sendKeys("TrustApp_Tsting");
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225
        Thread.sleep(3000);

        WebElement Next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
        highlightElement(driver, Next);
        Thread.sleep(2000);
        Next.click();

        Thread.sleep(2000);

        WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
        highlightElement(driver, Password);
        Thread.sleep(2000);
        Password.click();
        Password.clear();
        Password.sendKeys("TrustApp@4948");
        Thread.sleep(2000);

        WebElement Log_in = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        highlightElement(driver, Log_in);
        Thread.sleep(2000);
        Log_in.click();

        Thread.sleep(15000);

        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,650)", "");
<<<<<<< HEAD
        Thread.sleep(3000);

        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        highlightElement(driver, Search_bar);
        Thread.sleep(2000);
        Search_bar.click();
        Search_bar.clear();
        Thread.sleep(1000);
        Search_bar.sendKeys("The Economist");
        Thread.sleep(1000);
        Search_bar.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist']"));
        highlightElement(driver, The_Economist);
        Thread.sleep(2000);
        The_Economist.click();
        Thread.sleep(3000);

        WebElement TrustApp_mark = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));
        highlightElement(driver, TrustApp_mark);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(TrustApp_mark).perform();

        WebElement Search_bar1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
        highlightElement(driver, Search_bar1);
=======
        Thread.sleep(2000);

        
        driver.get("https://twitter.com/theeconomist");
        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,250)", "");
        
//        // locate Search_bar
//        WebElement Search_bar = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//
//        // to highlight the Log_in
//        JavascriptExecutor jse5 = (JavascriptExecutor) driver;
//        jse5.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar);
//        Thread.sleep(2000);
//
//        Search_bar.click();
//        Search_bar.clear();
//        Thread.sleep(1000);
//
//        Search_bar.sendKeys("The Economist");
//        Thread.sleep(1000);
//
//        Search_bar.sendKeys(Keys.RETURN);
//        Thread.sleep(3000);

        // locate The_Economist
//        WebElement The_Economist = driver.findElement(By.xpath("//span[normalize-space()='@TheEconomist']"));
//
//        // to highlight the The_Economist
//        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
//        jse6.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", The_Economist);
//        Thread.sleep(2000);
//
//        The_Economist.click();
//        jse6.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(3000);

        
        //.....................................................................................................
        
        
        
		// locate TrustApp_mark
		WebElement TrustApp_mark = driver
				.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div/section/div/div/div[1]/div/div/article/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div/div[3]/img"));

		// to highlight the TrustApp_mark
		JavascriptExecutor jse7 = (JavascriptExecutor) driver;
		jse7.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark);
		Thread.sleep(2000);

		// Perform a hover action on TrustApp_mark
		Actions actions = new Actions(driver);
		actions.moveToElement(TrustApp_mark).perform();
        
        
     //...............................................................................................   
        
      
        
		// locate TrustApp_mark1001
		WebElement TrustApp_mark1001 = driver.findElement(By.xpath("//img[@alt='TrustApp mark'][2]"));

		// to highlight the TrustApp_mark
		JavascriptExecutor jse1001 = (JavascriptExecutor) driver;
		jse1001.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')",
				TrustApp_mark1001);
		Thread.sleep(2000);

		// Perform a hover action on TrustApp_mark
		Actions actions1001 = new Actions(driver);
		actions.moveToElement(TrustApp_mark1001).perform();

        //...........................................................................................................
        
        
        
     // locate TrustApp_mark1002
        WebElement TrustApp_mark1002 = driver.findElement(By.xpath("//img[@alt='TrustApp mark'][3]"));

        // to highlight the TrustApp_mark
        JavascriptExecutor jse1002 = (JavascriptExecutor) driver;
        jse1002.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark1002);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark
        Actions actions1002 = new Actions(driver);
        actions.moveToElement(TrustApp_mark1002).perform();


        
        
        
        
        
        
        
        
        
        
        // locate Search_bar1
        WebElement Search_bar1 = driver.findElement(By.xpath("//input[@placeholder='Search']"));

        // to highlight the Search_bar1
        JavascriptExecutor jse8 = (JavascriptExecutor) driver;
        jse8.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Search_bar1);
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225
        Thread.sleep(2000);
        Search_bar1.click();
        Search_bar1.clear();
        Thread.sleep(1000);
        Search_bar1.sendKeys("CNN");
        Thread.sleep(2000);
        Search_bar1.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

        WebElement CNN = driver.findElement(By.xpath("//span[normalize-space()='CNN']"));
        highlightElement(driver, CNN);
        Thread.sleep(2000);
        CNN.click();
        Thread.sleep(3000);

        WebElement TrustApp_mark1 = driver.findElement(By.xpath("//div//img[@alt='TrustApp mark']"));
<<<<<<< HEAD
        highlightElement(driver, TrustApp_mark1);
        Thread.sleep(2000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark1).perform();

        WebElement Profile = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
        highlightElement(driver, Profile);
=======

        // to highlight the TrustApp_mark1
        JavascriptExecutor jse10 = (JavascriptExecutor) driver;
        jse10.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark1);
        Thread.sleep(2000);

        // Perform a hover action on TrustApp_mark1
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark1).perform();
        
        
        
//        WebElement newsElement = driver.findElement(By.cssSelector("div[id='id__wagpq6ggja'] span[class='css-1qaijid r-bcqeeo r-qvutc0 r-poiln3']"));
//        String newsText = newsElement.getText();
//        System.out.println(newsText);
        
        
        
        // locate Profile
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
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225
        Thread.sleep(2000);
        Profile.click();

        Thread.sleep(3000);
<<<<<<< HEAD
=======
        
        
        
        
        // locate Post_text
        WebElement Post_text = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225

        WebElement Post = driver.findElement(By.xpath("//a[@aria-label='Post']"));
        highlightElement(driver, Post);
        Thread.sleep(2000);
        Post.click();

        Thread.sleep(3000);

        WebElement Post_text = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
        highlightElement(driver, Post_text);
        Thread.sleep(2000);
        Post_text.click();
        Post_text.clear();
<<<<<<< HEAD
        Post_text.sendKeys("https://www.economist.com/interactive/international/2023/08/03/western-values-are-steadily-diverging-from-the-rest-of-the-world");

        Thread.sleep(4000);

=======
        
        Post_text.sendKeys("https://www.economist.com/interactive/international/2023/08/03/western-values-are-steadily-diverging-from-the-rest-of-the-world");
        
        Thread.sleep(4000);
        
        
        // locate Post1
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225
        WebElement Post1 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
        highlightElement(driver, Post1);
        Thread.sleep(2000);
        Post1.click();

        Thread.sleep(2000);
<<<<<<< HEAD

        WebElement Profile1 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
        highlightElement(driver, Profile1);
        Thread.sleep(2000);
        Profile1.click();

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,350)", "");

        WebElement TrustApp_mark3 = driver.findElement(By.xpath("//div[@class='trust-app-verification-container trust-app-trusted-container']//img[@alt='TrustApp mark']"));
        highlightElement(driver, TrustApp_mark3);
        Thread.sleep(2000);
        Actions actions2 = new Actions(driver);
        actions1.moveToElement(TrustApp_mark3).perform();
    }

    private static WebDriver openChromeWithExtension(String url, String extensionId) {
        ChromeOptions options = new ChromeOptions();
     options.addExtensions(new File("./Extensions/TrustApp 1.1.14.0.crx"));
//      options.addArguments("--load-extension=" + extensionId);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get(url);
        return driver;
    }

    private static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 4px solid red;')", element);
=======
//
        
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
         Actions actions3 = new Actions(driver);
         actions1.moveToElement(TrustApp_mark3).perform();
//         
//         
         
//         // locate Post0
//         WebElement Post0 = driver.findElement(By.xpath("//a[@aria-label='Post']"));
//
//         // to highlight the Post
//         JavascriptExecutor jse11111 = (JavascriptExecutor) driver;
//         jse11111.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post0);
//         Thread.sleep(2000);
//         
//         Post0.click();
////         
//         
//         
//         
//         Thread.sleep(3000);
//        
//         // locate Post_text1
//         WebElement Post_text1 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
//
//         // to highlight the Post_text1
//         JavascriptExecutor jse112 = (JavascriptExecutor) driver;
//         jse112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text1);
//         Thread.sleep(2000);
//         
//         Post_text1.click();
//         Post_text1.clear();
//         
//         Post_text1.sendKeys("Test");
//         
//         Thread.sleep(4000);
//         
//         
//         
//         // locate Post2
//         WebElement Post2 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
//
//         // to highlight the Post2
//         JavascriptExecutor jse16 = (JavascriptExecutor) driver;
//         jse16.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post2);
//         Thread.sleep(2000);
//         
//       
//         Post2.click();
//         
//         
//         Thread.sleep(2000);
//         
//         // locate Profile2
//         WebElement Profile2 = driver.findElement(By.xpath("//span[normalize-space()='Profile']"));
//
//         // to highlight the Profile2
//         JavascriptExecutor jse114 = (JavascriptExecutor) driver;
//         jse114.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Profile2);
//         Thread.sleep(2000);
//         
//       
//         Profile2.click();
//         
//         Thread.sleep(2000);
//         
//          jse14.executeScript("window.scrollBy(0,350)", "");
//          
//          // locate TrustApp_mark4
//          WebElement TrustApp_mark4 = driver.findElement(By.xpath("//div[@id='id__xsyo9ok2ig']//img[@alt='TrustApp mark']"));
//
//          // to highlight the TrustApp_mark4
//          JavascriptExecutor jse115 = (JavascriptExecutor) driver;
//          jse115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", TrustApp_mark4);
//          Thread.sleep(2000);
//
//          // Perform a hover action on TrustApp_mark4
//          Actions actions3 = new Actions(driver);
//          actions3.moveToElement(TrustApp_mark4).perform();
//          
////----------------------------------------------------------------------------------------------------------
//         
//          // locate Post3
//          WebElement Post3 = driver.findElement(By.xpath(" //span[normalize-space()='Post']"));
//
//          // to highlight the Post
//          JavascriptExecutor jse113 = (JavascriptExecutor) driver;
//          jse113.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post3);
//          Thread.sleep(2000);
//          
//        
//          Post3.click();
//          
//          Thread.sleep(2000);
//          
//          
          
          
          
          
          
          
//          // locate Post_text2
//          WebElement Post_text2 = driver.findElement(By.xpath("//div[@aria-label='Post text']"));
//
//          // to highlight the Post_text1
//          JavascriptExecutor jse1112 = (JavascriptExecutor) driver;
//          jse1112.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post_text2);
//          Thread.sleep(2000);
//          
//          Post_text2.click();
//          Post_text2.clear();
//          
//          Post_text2.sendKeys("Israel-Hamas war live: 14 killed by Israeli bombing of house in Gaza    https://www.aljazeera.com/news/liveblog/2024/1/4/israel-hamas-war-live-bloody-day-for-hezbollah-tensions-with-israel-soar");
////          
////          
//          Thread.sleep(4000);
//          
//          // locate Post4
//          WebElement Post4 = driver.findElement(By.xpath("//span[contains(text(),'Post')]"));
//
//          // to highlight the Post4
//          JavascriptExecutor jse116 = (JavascriptExecutor) driver;
//          jse116.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Post4);
//          Thread.sleep(2000);
//          
//        
//          Post4.click();
//          
//          
//          Thread.sleep(2000);
//          
//
//     //----------------------------------------------------------     
          
//          // locate Home_mark5
//    WebElement Home_mark5 = driver.findElement(By.xpath("By.xpath(\"//div[@id='id__54vk6huz23j' or @id='id__vitds5cxa5s' or @id='id__fa15rtfx6ug']//img[@alt='TrustApp mark']\")\r\n"
//    		+ ""));
//    
//    // Perform a hover action on TrustApp_mark4
//  Actions actions44 = new Actions(driver);
//  actions44.moveToElement(Home_mark5).perform();
////                                                          ////div[@id='id__znj3gu0ho6']//img[@alt='TrustApp mark']
//                                                             ////div[@id='id__rdko57jecvb']//img[@alt='TrustApp mark']
//                                                             //div[@id='id__pw241ui0z6']//img[@alt='TrustApp mark']   
//       
//       
//     //div[@id='id__54vk6huz23j']//img[@alt='TrustApp mark']
//     //div[@id='id__vitds5cxa5s']//img[@alt='TrustApp mark']
//     //div[@id='id__fa15rtfx6ug']//img[@alt='TrustApp mark']
//       
//       
//       
//       
//       
//        // to highlight the TrustApp_mark5
//        JavascriptExecutor jse1115 = (JavascriptExecutor) driver;
//        jse1115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark5);
//        Thread.sleep(2000);
//
//        // Perform a hover action on TrustApp_mark5
//        Actions actions33 = new Actions(driver);
//        actions33.moveToElement(Home_mark5).perform();
//        
//        //---------------------------------------------------------------
//        // locate Home_mark6
//        WebElement Home_mark6 = driver.findElement(By.xpath("//div[@id='id__ypoqbktwo']//img[@alt='TrustApp mark']"));
// //
//         // to highlight the TrustApp_mark5
//         JavascriptExecutor jse11115 = (JavascriptExecutor) driver;
//         jse11115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark6);
//         Thread.sleep(2000);
//
//         // Perform a hover action on TrustApp_mark5
//         Actions actions4 = new Actions(driver);
//         actions4.moveToElement(Home_mark5).perform();
//         jse11115.executeScript("window.scrollBy(0,850)", "");
//          
//          
//          //-----------------------------------------------------------------------
//         
//         // locate Home_mark7
//         WebElement Home_mark7 = driver.findElement(By.xpath("//div[@id='id__si8is5wjhue']//img[@alt='TrustApp mark']"));
//  //
//          // to highlight the TrustApp_mark5
//          JavascriptExecutor jse111115 = (JavascriptExecutor) driver;
//          jse111115.executeScript("arguments[0].setAttribute('style','background: pink; border: 4px solid red;')", Home_mark7);
//          Thread.sleep(2000);
//
//          // Perform a hover action on TrustApp_mark5
//          Actions actions5 = new Actions(driver);
//          actions5.moveToElement(Home_mark5).perform();
//         
//        // Scroll down
//       // js.executeScript("window.scrollBy(0,850)", "");
//
       
>>>>>>> 98ace70849b9880cc66977ec57c28651ac678225
    }
}

  //C:\Users\praka\AppData\Local\Google\Chrome\User Data\Default\Extensions
