package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GEtLocation {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://duotech.io/");

        System.out.println(driver.findElement(By.tagName("h1")).getLocation());
        System.out.println(driver.findElement(By.tagName("h1")).getSize());

        List<WebElement> allElelemnets = driver.findElements(By.xpath("//*"));


        for (WebElement each : allElelemnets) {

            System.out.println(each.getTagName());
        }
    }
}
