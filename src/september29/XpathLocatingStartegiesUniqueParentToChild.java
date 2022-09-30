package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatingStartegiesUniqueParentToChild {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");


        //div[@id='Services']//div[@class='section-small-header']
        // Find the unique ancestor and locate non-unique child from it

        System.out.println(driver.findElement(By.xpath("//div[@id='Services']//div[@class='section-small-header']")).getText());





    }
}
