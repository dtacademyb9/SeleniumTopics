package october4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertsJSPrompt {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();


        driver.switchTo().alert().sendKeys("Hello JS Alert");


        String textOfTheAlertBox = driver.switchTo().alert().getText();

        System.out.println("The alert box text is : " + textOfTheAlertBox);

        driver.switchTo().alert().accept();  // click OK
//        driver.switchTo().alert().dismiss(); // click Cancel




        driver.findElement(By.linkText("Elemental Selenium")).click();


        // Non-javascript alerts which are called popups or modal alerts/windows can be handled like a normal element by inspecting them and clicking on abutton or an x to remove it


        //input[@placeholder='First']

    }
}
