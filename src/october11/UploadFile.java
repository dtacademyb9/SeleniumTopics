package october11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class UploadFile {


    public static void main(String[] args) throws AWTException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));


        driver.manage().window().maximize();



        driver.get("https://www.filemail.com/share/upload-file");

        driver.findElement(By.xpath("//span[.='Add Files']//following-sibling::input")).sendKeys("C:\\Users\\Nuclues\\Downloads\\myFile.pptx");
        driver.findElement(By.xpath("//span[.='Add Files']//following-sibling::input")).sendKeys("C:\\Users\\Nuclues\\IdeaProjects\\SeleniumDemo1\\src\\october11\\another.png");



        // Download a file
        driver.get("https://unsplash.com/images");

        WebElement link = driver.findElement(By.xpath("//a[@href='https://unsplash.com/photos/RkAv0rm1x2I/download?force=true']"));



        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", link);

    }
}
