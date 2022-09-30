package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVsElements {


    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://duotech.io/");

        Thread.sleep(2000);

        System.out.println(driver.findElement(By.xpath("//a[@href='/about-us']")).getText());

        List<WebElement> elements = driver.findElements(By.xpath("//a[@href='/about-']"));

        System.out.println(elements.size());

        if(elements.size() == 0){
            throw  new RuntimeException("List is empty.Check your locator.");
        }




        // findElement method throws NoSuchELementException whereas findelements returns Empty list if the element/s is not found.

    }
}
