package october11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utils {



    public static void takeScreenshot(WebDriver driver, String pathToStore){
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshotFile, new File(pathToStore));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
