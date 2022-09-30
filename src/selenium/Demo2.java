package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {


    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.duotech.io/");

        String expectedURL = "https://www.duotech.io/";
        String expectedTitle = "Software QA Automation Engineer program | SDET | QA School | Software Testing";

        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle) && expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }






    }
}
