package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by shweta on 27-10-2016.
 */
public class CheckOutPage extends BasePage {

public CheckOutPage proceedToCheckout()
{
    try {

        driver.findElement(By.name("userName")).sendKeys("patilshwet");//here I am using already registerd username and password
        driver.findElement(By.name("password")).sendKeys("manjarbok1");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
        loginBtn.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Continue']")).click();//pay on delivary option
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Continue Shopping']")).click();//////continue shopping///
        Thread.sleep(2000);


    } catch (Exception e) {
        e.getStackTrace();
    }


    return this;
}


public CheckOutPage checkoutSuccessfully()
{
  String text = driver.findElement(By.tagName("body")).getText();
    Assert.assertTrue(text.contains("Orders placed on this site WILL NOT be fulfilled."));
    return this;
}
}
