package october8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaits {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        // implicit wait is set once per Driver initialization

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // implicit wait is considered a global wait since it applies to your entire script

        driver.manage().window().maximize();



        driver.get("https://www.lexus.com/");

//        Thread.sleep(10000); // 10s wait -> static wait
        // Try limiting the use of Thread.sleep()


        // dynamic waits -> implicit, explicit, fluent

        driver.findElement(By.linkText("LEXUS INTERNATIONALcbjdgsvhdgv")).sendKeys(Keys.ENTER);


        // If the element is not found within the given time, NoSuchElementException is thrown

    }
}
