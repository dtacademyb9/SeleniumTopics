package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        System.out.println(driver.findElement(By.tagName("h1")).getText());  // gets the text of a single webelement

        System.out.println(driver.findElement(By.className("pb-center-column")).getText());  // gets the text of the inner elements too


    }
}
