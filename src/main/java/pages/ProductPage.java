package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.CommonUtils;

/**
 * Created by Yogesh on 26-10-2016.
 */
public class ProductPage extends BasePage {
    String firstProduct;
    String secondProduct;
    String thirdProduct;

    public ProductPage addMultipleProduct() {

        CommonUtils.selectProduct(By.linkText("TEST: Product 2"), By.cssSelector("#buy_button"));//select first product
        firstProduct = CommonUtils.getproductName(By.linkText("TEST: Product 2"));
        WebElement qty = driver.findElement(By.name("1.qty"));///update quantity
        qty.clear();
        qty.sendKeys("3");
        WebElement updateCart = driver.findElement(By.xpath("//input[@value='Update cart']"));
        updateCart.click();

        CommonUtils.selectProduct(By.linkText("TEST: Product 3"), By.cssSelector("#buy_button"));//select second product
        secondProduct = CommonUtils.getproductName(By.linkText("TEST: Product 3"));


        CommonUtils.selectProduct(By.linkText("TEST: Product 4"), By.cssSelector("#buy_button"));//select third product
        thirdProduct = CommonUtils.getproductName(By.linkText("TEST: Product 4"));

        //////////////Search product to add to cart////////
        WebElement search = driver.findElement(By.name("ssv"));
        search.sendKeys("TEST: Product 5");

        WebElement goBtn = driver.findElement(By.xpath("//input[@class='goBtn']"));
        goBtn.click();
        WebElement buyBtn = driver.findElement(By.xpath("//input[@value='Buy']"));
        buyBtn.click();

        //apply promo code//
        WebElement promoCode = driver.findElement(By.name("promoCode"));
        promoCode.sendKeys("012345T");
        WebElement applyBtn = driver.findElement(By.xpath("//input[@value='Apply']"));
        applyBtn.click();

        driver.findElement(By.xpath("//input[@class='smallBtn']")).click();
        return this;
    }
    //////////////////delete first product///////////


    public ProductPage customerDeleteFirstProduct() {
        WebElement firstDelete = driver.findElement(By.cssSelector(".dlt"));
        firstDelete.click();///delete Test:Product 2//
        WebElement updateCart = driver.findElement(By.xpath("//input[@value='Update cart']"));
        updateCart.click();
        return this;
    }


    public ProductPage cartUpdatedSuccessfully() {
      try {
          WebElement cart = driver.findElement(By.xpath("//input[@value='View Cart']"));
          cart.click();
          // String cartItem = driver.findElement(By.linkText("TEST: Product 3")).getText();
          String text = driver.findElement(By.tagName("body")).getText();
          Assert.assertFalse(text.contains(firstProduct));

      }catch (Exception e)
      {
          e.getStackTrace();
      }
        return this;
    }


    public ProductPage leaveCompuerLongTime() throws InterruptedException {
        Thread.sleep(60000000);//leave computer for long hour//for persistent basket test we generally carry manually and for automation we have generally should have account and be able to make
        // some changes in configuration but here I can't do that
        //if we wait for 1hour for automation test then i will be very time consuming that's why generally  carried out manually.
        return this;
    }

    public ProductPage purchaseItemWithouReadding() {
        try {                                                                        //one product is present means others are also present.
            driver.findElement(By.xpath("//input[@value='View Cart']")).click();
            String cartItem = driver.findElement(By.linkText("TEST: Product 3")).getText();
            Assert.assertTrue(cartItem.contains(secondProduct));

        } catch (Exception e) {
            e.getStackTrace();
        }


        return this;
    }

    public ProductPage gotoCheckout() {
        WebElement checkOut = driver.findElement(By.xpath("//input[@value='Checkout']"));
        checkOut.click();
        return this;
    }
}



