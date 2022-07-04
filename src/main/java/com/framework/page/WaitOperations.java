package com.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.framework.testsuite.BaseTest.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class WaitOperations {

    protected boolean isClickable(WebElement webElement) {
        return waiting().until(elementToBeClickable(webElement)).isEnabled();
    }

    protected boolean isVisible(WebElement webElement) {
        return waiting().until(visibilityOf(webElement)).isDisplayed();
    }

    private WebDriverWait waiting() {
        return getDriver().getWebDriverWait();
    }
}
