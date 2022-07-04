package com.framework.page;

import com.framework.driver.Driver;

import static com.framework.testsuite.BaseTest.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class WebPage extends WebOperations {

    protected WebPage() {
        Driver driver = getDriver();
        initElements(driver.getWebDriver(), this);
    }
}
