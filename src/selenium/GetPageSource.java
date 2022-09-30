package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

    public static void main(String[] args) {




        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();

        driver.get("https://www.duotech.io/");
//

        System.out.println(driver.getPageSource().contains("Start New IT&nbsp;Career"));


//        driver.close();  //Closes the current window
        driver.quit(); //Quits this driver, closing every associated window.

        //When you call any method on driver object after calling quit NoSuchSessionException
//        org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
        driver.get("https://www.duotech.io/");
    }
}
