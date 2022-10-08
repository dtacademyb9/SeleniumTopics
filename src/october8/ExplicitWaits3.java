package october8;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaits3 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.manage().window().maximize();



        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

//

        driver.findElement(By.xpath("//button[.='Start']")).click();


        WebElement helloWorldText = driver.findElement(By.xpath("//h4[.='Hello World!']"));
//



        WebDriverWait wait =  new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(helloWorldText));

     //   new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));


        System.out.println(helloWorldText.getText());


        // If the element is not found within the given time, TimeoutException is thrown

        // In general, it is recommended not to mix implicit and explicit waits
        // If you need to, ser implicit wait to zero, use explicit wait, then set the implicit wait back to previous timeout



        // Fluent wait syntax

        Wait<WebDriver> fluentlyWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);


        fluentlyWait.until(ExpectedConditions.titleIs("Hello World"));


        // With fluent wait you can configure polling frequency and exceptions to be ignored while waiting





    }
}
