package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by shweta on 27-10-2016.
 */
public class HomePage extends BasePage {

    public void openHomePage() {
        driver.get("http://www.testsite.gplshops.com/index.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void gotoTestProductPage() {
        driver.findElement(By.linkText("test")).click();
    }


    public HomePage WebsiteHomePage() throws InterruptedException {
        try {


            WebElement termsCondition;
            termsCondition = driver.findElement(By.linkText("Terms And Conditions"));//terms and condition page
            termsCondition.click();
            Thread.sleep(1000);


            WebElement about;
            about = driver.findElement(By.linkText("About Us"));
            about.click();
            Thread.sleep(1000);

            WebElement contact;
            contact = driver.findElement(By.linkText("Contact Us"));
            contact.click();
            Thread.sleep(1000);

            WebElement enquiry;
            enquiry = driver.findElement(By.linkText("Enquiry"));
            enquiry.click();
            Thread.sleep(2000);
            enquiry = driver.findElement(By.id("title"));
            enquiry.sendKeys("Mr");
            enquiry = driver.findElement(By.id("name"));
            enquiry.sendKeys("Meena");
            enquiry = driver.findElement(By.id("phone"));
            enquiry.sendKeys("07552892792");
            enquiry = driver.findElement(By.id("email"));
            enquiry.sendKeys("veena12@gmail.com");
            enquiry = driver.findElement(By.id("note"));
            enquiry.sendKeys("information");

            Thread.sleep(2000);
            enquiry = driver.findElement(By.xpath("//input[@class='middleBtn leftBtn']"));
            enquiry.click();
            Thread.sleep(2000);

            enquiry = driver.findElement(By.id("title"));
            enquiry.sendKeys("Mr");
            enquiry = driver.findElement(By.id("name"));
            enquiry.sendKeys("Meena");
            enquiry = driver.findElement(By.id("phone"));
            enquiry.sendKeys("07245892692");
            enquiry = driver.findElement(By.id("email"));
            enquiry.sendKeys("joshe@gmail.com");
            enquiry = driver.findElement(By.id("note"));
            enquiry.sendKeys("Ttest");

            Thread.sleep(2000);
            enquiry = driver.findElement(By.xpath("//input[@class='middleBtn rightBtn']"));
            enquiry.click();
            Thread.sleep(2000);

            WebElement selCat;
            selCat = driver.findElement(By.linkText("Vision (Sample)"));
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.cssSelector("a[href='/category/Vision+%28Sample%29/Televisions+%28Sample%29"));//television sample
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.cssSelector("a[href='/category/Sound+%28Sample%29"));///sound sample//
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.cssSelector("a[href='/category/Sound+%28Sample%29/Accessories"));//sample accessories
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.cssSelector("a[href='/category/Testing"));
            selCat.click();
            Thread.sleep(2000);
            //WebElement searchProduct;
            selCat = driver.findElement(By.name("ssv"));
            selCat.sendKeys("prod 5");
            Thread.sleep(1000);

            Select dropdown = new Select(driver.findElement(By.xpath("//select[@name='psf']")));//////////select price low to high
            dropdown.selectByVisibleText("Price: high to low");
            Thread.sleep(3000);
            selCat = driver.findElement(By.cssSelector("a[href='/brand/Sony+%28Sample%29"));///////////sony brand
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.cssSelector("a[href='/brand/Samsung+%28Sample%29"));///////samsung brand
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.xpath("//div[@class='pciCompliant']"));///////////click complain
            selCat.click();
            Thread.sleep(2000);
            selCat = driver.findElement(By.xpath("//div[@class='poweredBy']"));
            selCat.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.getStackTrace();
        }

        return this;
    }


}
