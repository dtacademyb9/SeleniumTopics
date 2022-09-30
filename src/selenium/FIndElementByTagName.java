package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FIndElementByTagName {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();


        driver.get("https://www.facebook.com/");


        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        for (WebElement allLink : allLinks) {
            System.out.println(allLink.getAttribute("href"));
        }


//        driver.quit();

    }
}
