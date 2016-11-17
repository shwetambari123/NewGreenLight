package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by shweta on 27-10-2016.
 */
public class BasePage {
    public static WebDriver driver;

    public void openBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver","src/main/browser/chromedriver.exe");//open browser
            driver = new ChromeDriver();
        } catch (Exception e) {
            System.out.println("FAILURE: Browser did not load: ");
        }

    }


    public static WebDriver getDriver() {
        return driver;
    }

    public void closeBrowser() {
        driver.quit();
    }//kill browser


}
