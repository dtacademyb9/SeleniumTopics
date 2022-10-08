package october8;

import org.openqa.selenium.WebDriver;

public class Utilities {



    public static void switchWindow(WebDriver driver, String windowTitle){

        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);

            if(driver.getTitle().equals(windowTitle)){
                break;
            }
        }
    }
}
