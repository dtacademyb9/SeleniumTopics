package october4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();


        // When alert is active and you don't handle it and try interacting with the page UnhandledAlertException is thrown
        //UnhandledAlertException: unexpected alert open: {Alert text : I am a JS Alert}

        Alert alert = driver.switchTo().alert();

//        alert.dismiss();
        alert.accept();


        driver.findElement(By.linkText("Elemental Selenium")).click();
    }
}
