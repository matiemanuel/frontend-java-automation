package com.framework.testsuite;

import com.framework.driver.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public abstract class BaseTest {

    public static Driver driver;

    @BeforeClass
    public static void init() {
        driver = new Driver();
    }

    @AfterClass
    public static void disposeTest() {
        driver.getWebDriver().close();
    }

    public static Driver getDriver() {
        return driver;
    }
}
