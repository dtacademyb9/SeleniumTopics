package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WarmUp {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.hoteltonight.com/");

        driver.findElement(By.xpath("//input")).sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE, "New York City, NY, USA", Keys.TAB, Keys.TAB, Keys.ENTER);

//       driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).click();



        List<WebElement> names = driver.findElements(By.xpath("//div[@class='_12pn51pp']//div[@class='_sx8sj8']"));

        for (WebElement name : names) {
            System.out.println(name.getText());
        }

//        Assert.assertEquals(names.size(), 24);


        driver.findElement(By.xpath("//div[.='Customize:']//following-sibling::div")).click();

        driver.findElement(By.xpath("//div[@class='_ditcmw']//div[.='4']//preceding-sibling::div")).click();
        driver.findElement(By.xpath("//button[.='Done']")).click();

        Thread.sleep(2000);


        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_12pn51pp']//div[@data-aid='inventory-item-rate']"));


        for (WebElement price : prices) {

            System.out.println(price.getText());
          Assert.assertTrue(Double.parseDouble(price.getText().replace("$", "")) < 300);
        }

    }
}
