package october1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DynamicElementsPArtialMatch {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");


        System.out.println(driver.findElement(By.xpath("//input[starts-with(@value, 'AJiK0')]")).getTagName());

        // starts-with -> locate the element based on attribute value that has a static part in the beginning

        ///html/body/div[1]/div[3]/form/div[2]/input[2]

        System.out.println(driver.findElement(By.xpath("//div[contains(@aria-controls, '_1')]")).getTagName());

        // contains -> locate the element based on attribute value that has a static part anywhere



    }
}
