package october1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class WarmUp {

    public static void main(String[] args) throws InterruptedException {





        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       // Implicit wait is a dynamic wait that waits up until indicated time till the element is found.
       // IF the element is found before that time, then the wait will be over
        // Implicit wait is set once per session after the WenDriver is initialized and applies to ALL
        // instances of findElement() or findElements() method calls
        // Implicit wait is a global wait that applies to the entire scripts

        // If the element is not found within the timeframe indicated in implicit wait,
        // NoSuchElementException is thrown.

        // Typical implicit wait time should be around 5-10 seconds


        //Go to dice.com
        // Search for SDET in Washington DC



        driver.get("https://www.dice.com/");

        String term = "SDET";
        String location = "Washington DC";


        Assert.assertEquals(driver.getCurrentUrl(), "https://www.dice.com/");

        Assert.assertEquals(driver.getTitle(), "Find Jobs in Technology");

        Assert.assertTrue(driver.getTitle().contains("Find Jobs"));

        driver.findElement(By.id("typeaheadInput")).sendKeys(term);
        driver.findElement(By.id("google-location-search")).sendKeys(location);
        driver.findElement(By.xpath("//button[@id='submitSearch-button']")).click();

//        Thread.sleep(2000);


        // Verify that ALL search results contain SDET
        List<WebElement> links = driver.findElements(By.xpath("//a[@class='card-title-link bold']"));


        if(links.isEmpty()){
            throw new RuntimeException("Find elements couldn't find anything");
        }


        for (WebElement link : links) {
            System.out.println(link.getText());
            Assert.assertTrue(link.getText().contains(term));
        }



        // Verify that last search result contains the term SDET


        Assert.assertTrue(links.get(links.size()-1).getText().contains(term));


        // Verify that the second search result contains the term SDET

        Assert.assertTrue(links.get(1).getText().contains(term));










    }
}
