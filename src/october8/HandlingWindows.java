package october8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class HandlingWindows {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();



        driver.get("https://www.lexus.com/");


        System.out.println(driver.getCurrentUrl());

        String fisrt = driver.getWindowHandle();  //returns current window's unique window handle

        System.out.println(fisrt);

        driver.findElement(By.linkText("LEXUS INTERNATIONAL")).sendKeys(Keys.ENTER);







        Set<String> windowHandles = driver.getWindowHandles();// returns all active windows' window handles

        System.out.println(windowHandles);

        for (String windowHandle : windowHandles) {    // if you work with only two windows, this approach could be used

            if(!windowHandle.equals(fisrt)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }




        String second = driver.getWindowHandle();  //returns current window's unique window handle

        System.out.println(second);

        System.out.println(driver.getCurrentUrl());





    }
}
