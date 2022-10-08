package october8;

import jdk.jshell.execution.Util;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingWindowsUsingTitle {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();



        driver.get("https://www.lexus.com/");


        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.linkText("LEXUS INTERNATIONAL")).sendKeys(Keys.ENTER);

        Set<String> windowHandles = driver.getWindowHandles();



        for (String windowHandle : windowHandles) {    // if you work with  multiple windows, this approach could be used

           driver.switchTo().window(windowHandle);

           if(driver.getTitle().equals("Home / Discover the Global World of Lexus")){
               break;
           }
        }



        System.out.println(driver.getCurrentUrl());


        driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline")).click();


        WebElement link = driver.findElement(By.xpath("//a[@href='https://privacy.toyota.com/']"));


        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", link);


        for (String windowHandle : driver.getWindowHandles()) {    // if you work with  multiple windows, this approach could be used

            driver.switchTo().window(windowHandle);

            if(driver.getTitle().equals("Privacy Hub")){
                break;
            }
        }


        System.out.println(driver.getCurrentUrl());


        Utilities.switchWindow(driver, "Lexus | Experience Amazing");


        System.out.println(driver.getCurrentUrl());

        driver.close();  // closes the current active window

   //     System.out.println(driver.getCurrentUrl()); //NoSuchWindowException: no such window: target window already closed

   // when closing the current window, the context is not automatically switched, you need to still switch to another window if you need to interact with it

        Utilities.switchWindow(driver,"Privacy Hub"); // switch to another window after closing the current
        System.out.println(driver.getCurrentUrl());


//        driver.quit();   // closes all the windows and quits the driver session


    }



}
