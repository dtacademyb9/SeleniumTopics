package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementByID {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.facebook.com/");

       driver.findElement(By.id("email")).sendKeys("johndoe@yahoo.com");
       driver.findElement(By.id("pass")).sendKeys("johndoe123456", Keys.ENTER);


       Thread.sleep(1000);

       if(driver.getPageSource().contains("Forgot Password?")){
           System.out.println("PASS");
       }else{
           System.out.println("FAIL");
       }


        driver.quit();

    }
}
