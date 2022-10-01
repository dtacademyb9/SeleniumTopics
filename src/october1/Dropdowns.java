package october1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dropdowns {

    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.cars.com/");


//        WebElement selectElement = driver.findElement(By.id("make-model-search-stocktype"));
////        Select select = new Select(selectElement);
        Select select = new Select(driver.findElement(By.id("make-model-search-stocktype")));

        select.selectByVisibleText("Certified cars");  // selects the option by its text.

        WebElement makes = driver.findElement(By.id("makes"));
//        makes.click();
//        makes.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);   // you can still use normal locating and clicking with dropdowns

        List<WebElement> options1 = new Select(makes).getOptions();

        for (WebElement webElement : options1) {

            if(webElement.getText().equals("Ferrari")){
                webElement.click();
            }

        }


        new Select(driver.findElement(By.id("models"))).selectByValue("ferrari-california"); //selects the option by its value attribute.

        //new Select(driver.findElement(By.id("models"))).deselectByValue("bmw-m5"); //UnsupportedOperationException: You may only deselect options of a multi-select drop down box


        new Select(driver.findElement(By.id("make-model-max-price"))).selectByIndex(1); //selects the option by its index (zero-based)



        // Verify New/USed drop down box contents

        List<String> expectedList  = Arrays.asList("New & used cars", "New & certified cars", "New cars", "Used cars", "Certified cars");

        List<WebElement> options = new Select(driver.findElement(By.id("make-model-search-stocktype"))).getOptions();

        List<String> actualList =  new ArrayList<>();

        for (WebElement option : options) {
            actualList.add(option.getText());
        }

        Assert.assertEquals(actualList, expectedList);


        // Verify the default selected option when page loads for Distance dropdown box, expected 20 miles

        WebElement firstSelectedOption = new Select(driver.findElement(By.id("make-model-maximum-distance"))).getFirstSelectedOption();

        Assert.assertEquals(firstSelectedOption.getText(), "20 miles");


    }
}
