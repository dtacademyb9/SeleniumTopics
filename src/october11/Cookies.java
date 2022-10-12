package october11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Cookies {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.amazon.com/");


        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie cookie : cookies) {
            System.out.println(cookie);
        }


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Ray Ban", Keys.ENTER);


        driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']//div[@class='sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 sg-col s-widget-spacing-small sg-col-4-of-20']//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();


        driver.findElement(By.id("add-to-cart-button")).click();
//        driver.findElement(By.id("attachSiNoCoverage-announce")).click();


        WebElement cancel = driver.findElement(By.xpath("(//span[@id='attachSiNoCoverage']//span[.=' No Thanks '])[2]"));

        JavascriptExecutor js =  (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();", cancel);

        Thread.sleep(2000);


        for (int i = 0; i < 2; i++) {

            driver.navigate().back();

            driver.findElement(By.id("add-to-cart-button")).click();
            WebElement cancel1 = driver.findElement(By.xpath("(//span[@id='attachSiNoCoverage']//span[.=' No Thanks '])[2]"));

            js =  (JavascriptExecutor) driver;

            js.executeScript("arguments[0].click();", cancel1);

            Thread.sleep(2000);
        }


        driver.manage().deleteAllCookies();

        driver.navigate().refresh();





    }
}
