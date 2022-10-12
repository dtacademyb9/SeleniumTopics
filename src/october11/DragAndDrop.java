package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://javascript.info/mouse-drag-and-drop");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/article/mouse-drag-and-drop/ball4/']")));

        Actions actions = new Actions(driver);

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement gate = driver.findElement(By.id("gate"));

//        actions.dragAndDrop(ball, gate).perform(); // when there is a target

       actions.dragAndDropBy(ball, 100, -100).
               dragAndDropBy(ball, 100, 100).
               dragAndDropBy(ball, 100, -100).
               dragAndDropBy(ball, 100, 100).
               dragAndDropBy(ball, 100, -100).build().perform();




    }
}
