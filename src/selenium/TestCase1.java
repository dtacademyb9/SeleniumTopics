package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();

        // Navigate to google.com

        String searchTerm = "Selenium";

        driver.get("https://www.google.com/");
        // Type "selenium" on the search bar and hit enter
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm, Keys.ENTER);

        // Verify that the search page title contains the search term

        String expectedTitle = searchTerm + " - Google search";

        String actualTitle = driver.getTitle(); //Gets the title of the current page.

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL.\nThe expected title is: "  + expectedTitle );
            System.out.println("The actual title is: "  + actualTitle );
        }

    }
}
