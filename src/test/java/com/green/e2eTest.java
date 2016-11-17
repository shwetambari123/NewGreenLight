package com.green;

import org.junit.Test;
import pages.*;

/**
 * Created by shweta on 27-10-2016.
 */
public class e2eTest extends BaseTest {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userJourneyProductSelection() throws InterruptedException {///////////select product and leave computer for long time
        homePage.openHomePage();
        productPage.addMultipleProduct().customerDeleteFirstProduct().cartUpdatedSuccessfully().leaveCompuerLongTime().purchaseItemWithouReadding().gotoCheckout();
        checkOutPage.proceedToCheckout().checkoutSuccessfully();


    }

    @Test
    public void userHomePageJourney() throws InterruptedException {//////check home page
        homePage.openHomePage();
        homePage.WebsiteHomePage();
    }

    @Test
    public void userAccountJourney() throws InterruptedException {////////register functionality//
        loginPage.login().gotoRegisterPage();
        registerPage.doRegister().registerdSuccessfully();
        loginPage.login().doLogin();//do login functionality
    }
}
