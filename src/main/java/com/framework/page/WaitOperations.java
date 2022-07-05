package com.framework.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static com.framework.testsuite.BaseTest.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public abstract class WaitOperations {

    protected boolean isClickable(WebElement webElement) {
        return waiting().until(elementToBeClickable(webElement)).isEnabled();
    }

    protected boolean isVisible(WebElement webElement) {
        return waiting().until(visibilityOf(webElement)).isDisplayed();
    }

    protected boolean areVisible(List<WebElement> webElements) {
        return waiting().until(visibilityOfAllElements(webElements)).stream().allMatch(element -> element.isDisplayed());
    }

    private WebDriverWait waiting() {
        return getDriver().getWebDriverWait();
    }
}
