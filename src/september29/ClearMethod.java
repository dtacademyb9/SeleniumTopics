package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.dice.com/");


        driver.findElement(By.id("IPGeoLocateButton")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("google-location-search")).clear();
        driver.findElement(By.id("google-location-search")).sendKeys("New York, NY");

    }
}
