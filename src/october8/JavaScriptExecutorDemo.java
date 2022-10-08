package october8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.manage().window().maximize();



        driver.get("https://www.duotech.io/");

        WebElement link = driver.findElement(By.xpath("//nav[@id='w-dropdown-list-2']//a[@href='/software-qa-engineer']"));

        JavascriptExecutor js =  (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", link);

//        driver.findElement(By.xpath("//nav[@id='w-dropdown-list-2']//a[@href='/software-qa-engineer']")).click();



        driver.get("https://www.amazon.com/");

        js.executeScript("document.getElementById('twotabsearchtextbox').value='JavaScriptExecutor';");

        // Scroll down to the bottom


        js.executeScript("window.scrollBy(0,6000)");




    }
}
