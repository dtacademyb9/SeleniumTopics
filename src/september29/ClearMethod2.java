package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod2 {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hoteltonight.com/");


        driver.findElement(By.name("searchfield")).click();




        driver.findElement(By.name("searchfield")).sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE, "Washington DC");


        driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).submit();



    }
}
