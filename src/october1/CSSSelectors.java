package october1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CSSSelectors {


    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");


//        driver.findElement(By.cssSelector("html body div div a")).click();
//        driver.findElement(By.cssSelector("a.MV3Tnb")).click();  // a element with class MV3Tnb
//        driver.findElement(By.cssSelector("a.MV3Tnb")).click();  // a element with class MV3Tnb




        //   html body div div a -> absolute cssSelector Path
        // a.MV3Tnb  -> a with a class MV3Tnb
        //  div.o3j99.LLD4me.yr19Zb.LS8OJ  -> div that has multiple classes (separated by .)


        // div#tophf  -> div with an id tophf
        // #tophf  -> this is shorter since id's are unique so the tag name can be omitted

//        System.out.println(driver.findElement(By.cssSelector("#tophf")).getTagName());


        //      input[maxlength='2048']  -> find an element by its attribute value
        //       input[maxlength='2048'][type='text']  -> find an element by its multiple attribute values

       driver.findElement(By.cssSelector("input[maxlength='2048']")).sendKeys("Css Selectors" , Keys.ENTER);

        // With CSS Selector method you can't use the element's text to locate it.
        // CSS Selector method can find elements only in forward direction









    }
}
