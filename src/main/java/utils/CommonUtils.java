package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by shweta on 27-10-2016.
 */
public class CommonUtils extends BasePage {

    public static void selectProduct(By elementProduct, By elementBuy) {////this function is to select the product//////


            WebElement productList = driver.findElement(By.linkText("test"));
            productList.click();//click on product list//
            driver.findElement(elementProduct).click();//select second product
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(elementBuy).click();
        }


    public static String getproductName(By elementProductname) {/////////this is to get product name//
        String productName = driver.findElement(elementProductname).getText();
        return productName;
    }
    }


