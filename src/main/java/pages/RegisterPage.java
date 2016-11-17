package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

/**
 * Created by shweta on 27-10-2016.
 */
public class RegisterPage extends BasePage {

  public   RegisterPage doRegister() throws InterruptedException {
       // driver.findElement(By.cssSelector(".newCustomerBtn.leftBtn")).click();
        String[] arr = {"WH", "Ge", "r", "t","iu","Ly", "Tp", "Mt", "iB", "uz", "Kb", "oP", "1", "M", "N", "D", "C", "A", "Q", "qw", "cx", "ws", "vb", "TY", "AM", "az", "J", "ty", "ty", "Mj"};
        Random random = new Random();
        int select = random.nextInt(arr.length);
        String username = arr[select] + "pinkesh";
        WebElement userName = driver.findElement(By.name("userName"));
        userName.sendKeys(username);//enter username//
        WebElement passWord = driver.findElement(By.name("password"));
        passWord.sendKeys("password1");//enter password//
        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("password1");
        WebElement firstName = driver.findElement(By.name("firstName"));
        Thread.sleep(1000);
        firstName.sendKeys("shweta");//enter first name//
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("neela");///enter last name
        String emaail = "s" + new Random().nextInt() + "patil42@yahoo.com";
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(emaail);//enter email/
        WebElement confirmEmail = driver.findElement(By.name("confirmEmail"));
        confirmEmail.sendKeys(emaail);
        Thread.sleep(1000);
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("09876543234");//enter phone number
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("long road");//enter address
        WebElement town = driver.findElement(By.name("town"));
        Thread.sleep(1000);
        town.sendKeys("ilford");////enter town/////
        WebElement postcode = driver.findElement(By.name("postcode"));
        postcode.sendKeys("ig11el");//enter postcode//
        WebElement register = driver.findElement(By.cssSelector(".middleBtn.rightBtn"));
        register.click();
        Thread.sleep(1000);
        return this;

    }


     public RegisterPage registerdSuccessfully()
    {
        String text =driver.findElement(By.tagName("body")).getText();
        Assert.assertTrue(text.contains("The account has been successfully created"));

        return this;
    }

}
