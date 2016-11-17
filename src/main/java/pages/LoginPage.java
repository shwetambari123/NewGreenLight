package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by shweta on 27-10-2016.
 */
public class LoginPage extends BasePage {

   public LoginPage login() {
        driver.get("https://testsite.gplshops.com/account/login");

        return this;
    }

  public   LoginPage doLogin() {
        try {
            driver.findElement(By.name("userName")).sendKeys("patilshwet");//here I am using already registerd username and password
            driver.findElement(By.name("password")).sendKeys("manjarbok1");
            driver.findElement(By.cssSelector(".middleBtn.rightBtn")).click();
            //Thread.sleep(20000);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;
    }

   public LoginPage customerLoggedIn() {

        try {
            String text = driver.findElement(By.tagName("body")).getText();////customer logged in successfully
            Assert.assertTrue(text.contains("Welcome"));
        } catch (Exception e) {
            System.out.println("enter valid details");
        }
        return this;
    }


  public   LoginPage gotoRegisterPage() {
        driver.findElement(By.cssSelector(".newCustomerBtn.leftBtn")).click();
        return this;
    }
}
