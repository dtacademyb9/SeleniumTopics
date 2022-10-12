package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RightClick {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions actions = new Actions(driver);

        actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).
                sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER).build().perform();

        

    }
}
