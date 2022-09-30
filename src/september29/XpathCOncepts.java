package september29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCOncepts {

    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nuclues\\Downloads\\browserDriver\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hoteltonight.com/");

        Thread.sleep(2000);


        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div/div[1]/div/form/div/div/div/input")).click();


        //input  -> matches all input elements on the page

        driver.findElement(By.xpath("//input")).sendKeys("dcsvgvdgh");


        System.out.println(driver.findElements(By.xpath("//div")).size());



        //input[@type='City, neighborhood, or address']  -> uses a single attribute to locate the element

        String xpath = "//input[@placeholder='City, neighborhood, or address']";

        driver.findElement(By.xpath(xpath)).sendKeys(Keys.chord(Keys.CONTROL, "A"), Keys.BACK_SPACE, "Washington DC");

        driver.findElement(By.xpath("//button[@data-aid='find-hotels-btn']")).click();


        //a[@class='city_1yk0k7t'][@href='/l/usa/nevada/las-vegas'] - uses 2 attributes to create a unique expression


        //a[@data-aid] --> All a elements containing data-aid attribute

        //*[@data-aid] --> All elements containing data-aid attribute


        //*[@id]  -> returns all the elements that have id attribute


        //div[.='Happy hour is never just an hour. From basic to luxe, book where the night takes you.'] -> div element with the text that is equal to the long given text

        //div[contains( text() , 'Happy hour')] -> div element that contains text 'Happy hour'




    }
}
