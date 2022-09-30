package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FIndElementByClassName {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();  //maximizes the window on the launch

        driver.get("https://www.duotech.io/");




//        driver.findElement(By.className("link-2")).click();

//        ElementNotInteractableException: element not interactable
        // happens when an element is on the page but not interactable beacuse it could be hidden, ot covered by other element
        //

//        By.className  should not be used to locate a single webelement uniquely, but locate multiple elements at once


        List<WebElement> links = driver.findElements(By.className("link-2"));

        for (WebElement link : links) {

//            System.out.println(link.getText());  //Get the visible (i.e. not hidden by CSS) text of this element, including sub-elements.
            System.out.println(link.getAttribute("href")); //Get the value of the given attribute of the element
        }


//       if(driver.getPageSource().contains("Forgot Password?")){
//           System.out.println("PASS");
//       }else{
//           System.out.println("FAIL");
//       }


//        driver.quit();

    }
}
