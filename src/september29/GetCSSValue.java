package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.id("ctl00_MainContent_login_button")).click();


        WebElement errorMessage = driver.findElement(By.id("ctl00_MainContent_status"));

        System.out.println(errorMessage.getCssValue("color"));
        System.out.println(errorMessage.getCssValue("display"));
        System.out.println(errorMessage.getCssValue("font-family"));
        System.out.println(errorMessage.getCssValue("font-size"));

        // getCssValue method can be used to verify style related attributes of webelements such as color, font, size, etc


    }
}
