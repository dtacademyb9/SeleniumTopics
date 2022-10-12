package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HoverOver {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.amazon.com/");


        Actions actions = new Actions(driver);


        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

        WebElement link = driver.findElement(By.xpath("//a[@href='https://www.amazon.com/credit/landing?ref_=nav_AccountFlyout_ya_amazon_cc_landing_ms']"));

        link.click();





    }
}
