package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsClassDemo {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.delta.com/");

        Actions actions = new Actions(driver);


        WebElement from = driver.findElement(By.id("fromAirportName"));
        actions.click(from).keyDown(Keys.SHIFT).sendKeys("mia").keyUp(Keys.SHIFT).build().perform();
        actions.click(driver.findElement(By.xpath("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']"))).build().perform();

        WebElement to = driver.findElement(By.id("toAirportName"));
        actions.click(to).sendKeys("dca").build().perform();
        actions.click(driver.findElement(By.xpath("//button[@class='search-flyout-close float-right d-none d-lg-block circle-outline icon-moreoptionsclose']"))).build().perform();



    }
}
