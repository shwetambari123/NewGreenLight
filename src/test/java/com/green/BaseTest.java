package com.green;

import org.junit.After;
import org.junit.Before;
import pages.BasePage;

/**
 * Created by shweta on 27-10-2016.
 */
public class BaseTest {
    BasePage basePage = new BasePage();

    @Before
    public void setUP()
    {
        basePage.openBrowser();
    }



    @After
    public void tearDown()
    {
        basePage.closeBrowser();
    }
}
