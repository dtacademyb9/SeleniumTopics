package october8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WarmUpTask {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();


     //   Go to https://www.webstaurantstore.com/
        driver.get("https://www.webstaurantstore.com/");


//                Test case:
//
//                Search for 'stainless work table'.

        driver.findElement(By.id("searchval")).sendKeys("stainless work table", Keys.ENTER);

//                Check the all search results from the current page ensuring every product has the word 'Table' in its title.

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='product_listing']//a[@data-testid='itemDescription']"));


        for (WebElement element : elements) {
            String result = element.getText().toLowerCase();
//            Assert.assertTrue( result.contains("table") &&
//                                        result.contains("stainless") &&
//                                        result.contains("work"), "The text is: " + element.getText());

            Assert.assertTrue( result.contains("table"),"The text is: " + element.getText());
        }

//                Add the first of found item to Cart.

        elements.get(0).click();

        driver.findElement(By.id("buyButton")).click();

        WebElement element = driver.findElement(By.xpath("//div[@class='amount']"));

        Assert.assertTrue(element.isDisplayed());

        driver.findElement(By.xpath("//button[contains(text(), 'View Cart')]")).click();

        driver.findElement(By.xpath("//button[.='Empty Cart']")).click();

        driver.findElement(By.xpath("//footer//button[.='Empty Cart']")).click();

//                Empty Cart.

        Assert.assertTrue(driver.findElement(By.xpath("//p[.='Your cart is empty.']")).isDisplayed());



    }
}
