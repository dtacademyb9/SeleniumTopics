package october8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();



        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

//

        driver.findElement(By.xpath("//button[.='Start']")).click();


//

//    Explicit wait is local, it is applied to a specific element
        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[.='Hello World!']")));

     //   new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        WebElement helloWorldText = driver.findElement(By.xpath("//h4[.='Hello World!']"));

        System.out.println(helloWorldText.getText());


        // If the element is not found within the given time, NoSuchElementException is thrown

    }
}
