package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatingStartegiesUniqueSiblingToNonUnique {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.duotech.io/");


        //div[@class='review-card-info-2'][.='Alexandra ']//preceding-sibling::p
        // Find the unique sibling and locate its preceding non-unique sibling


        //p[.='"Great learning environment, well organized and tailored course material, review sessions, can’t ask for more."']//following-sibling::div

        // Find the unique sibling and locate its following non-unique sibling

        System.out.println(driver.findElement(By.xpath("//div[@class='review-card-info-2'][.='Alexandra ']//preceding-sibling::p")).getText());

       // ->   (//h3)[2]  -> you can use this syntax when there are multiple matches and you need the specific one








    }
}
