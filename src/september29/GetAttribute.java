package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://duotech.io/");

        WebElement home = driver.findElement(By.linkText("Home"));

        System.out.println(home.getAttribute("class"));
        System.out.println(home.getAttribute("aria-label")); // non-existent attribute returns null
        System.out.println(home.getAttribute("aria-current"));
        System.out.println(home.getAttribute("href"));


        // The text fom the input box can be retrieved using getAttribute("value");

        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");

        System.out.println(driver.findElement(By.id("quantity_wanted")).getAttribute("value"));

    }
}
