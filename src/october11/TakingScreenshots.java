package october11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TakingScreenshots {


    public static void main(String[] args) throws IOException, InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.hoteltonight.com/");

        driver.findElement(By.xpath("//input")).sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE, "New York City, NY, USA", Keys.TAB, Keys.TAB, Keys.ENTER);

        Thread.sleep(1000);

        Utils.takeScreenshot(driver, "src/october11/another.png");





    }


}
