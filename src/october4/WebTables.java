package october4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebTables {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

        driver.findElement(By.linkText("View all products")).click();

        // Verify that 2nd row and first columns text is MyMoney

        String actualText = driver.findElement(By.xpath("//table[@class='ProductsTable']//tr[2]//td[1]")).getText();
        String expectedText= "MyMoney";

        System.out.println(actualText);
        Assert.assertEquals(actualText, expectedText);


        List<String> expectedHeaderRowValues = Arrays.asList("Product name", "Price", "Discount");

//        System.out.println(driver.findElement(By.xpath("//table[@class='ProductsTable']//tr[1]")).getText());
        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr[1]//th"));



        List<String> actualHeaderRowValues =  new ArrayList<>();

        for (WebElement element : elements) {
            actualHeaderRowValues.add(element.getText());
        }

        Assert.assertEquals(actualHeaderRowValues, expectedHeaderRowValues);


        // Verify Product name column values

        List<String> expectedProductNames = Arrays.asList("MyMoney", "FamilyAlbum", "ScreenSaver");

        List<WebElement> elements1 = driver.findElements(By.xpath("//table[@class='ProductsTable']//tr//td[1]"));

        List<String> actualProductNames =  new ArrayList<>();
        for (WebElement webElement : elements1) {
            actualProductNames.add(webElement.getText());
        }

        Assert.assertEquals(actualProductNames, expectedProductNames);




    }
}
