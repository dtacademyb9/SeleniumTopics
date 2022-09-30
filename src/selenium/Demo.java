package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {


    public static void main(String[] args) {


//

//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\geckodriver.exe");
//        WebDriver driver =  new FirefoxDriver();
//        driver.get("https://www.google.com/");


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.google.com/");





    }
}
