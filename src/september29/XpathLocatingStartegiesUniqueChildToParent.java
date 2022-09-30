package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatingStartegiesUniqueChildToParent {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");


        //h6[contains( text(), 'Path to IT')]//parent::div[@class='service-simple-info']
        // Find the unique child and locate its non-unique parent

        System.out.println(driver.findElement(By.xpath("//h6[contains( text(), 'Path to IT')]//parent::div[@class='service-simple-info']")).getText());





    }
}
