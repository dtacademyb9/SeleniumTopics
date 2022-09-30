package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementByLinkText {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.facebook.com/");

//        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("password?")).click();


//        driver.quit();

    }
}
