package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementMethod {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.instagram.com/accounts/emailsignup/");

        Thread.sleep(500);

        driver.findElement(By.name("emailOrPhone")).sendKeys("dtacademy@gmail.com");
        driver.findElement(By.name("fullName")).sendKeys("Duotech");
        driver.findElement(By.name("username")).sendKeys("dtacademy2022");
        driver.findElement(By.name("password")).sendKeys("dtacademy123", Keys.ENTER);

        Thread.sleep(500);

        if(driver.getPageSource().contains("Add Your Birthday")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        driver.quit();

    }
}
