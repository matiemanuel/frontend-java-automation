package com.framework.page;

import org.openqa.selenium.WebElement;

public abstract class WebOperations extends WaitOperations {

    protected void type(WebElement webElement, String text) {
        isVisible(webElement);
        webElement.sendKeys(text);
    }

    protected void click(WebElement webElement) {
        isClickable(webElement);
        webElement.click();
    }

    protected String getText(WebElement webElement) {
        isVisible(webElement);
        return webElement.getText();
    }
}
