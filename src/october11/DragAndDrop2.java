package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop2 {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.youtube.com/watch?v=K1iu1kXkVoA");


        Actions actions = new Actions(driver);



        WebElement scroller = driver.findElement(By.xpath("//div[@class='ytp-chrome-bottom']//div[@class='ytp-scrubber-pull-indicator']"));


        actions.clickAndHold(scroller).moveByOffset(100, 0).release().
                clickAndHold(scroller).moveByOffset(100, 0).release().
                clickAndHold(scroller).moveByOffset(100, 0).release().build().perform();



        //a[@href='https://www.amazon.com/credit/landing?ref_=nav_AccountFlyout_ya_amazon_cc_landing_ms']
    }
}
