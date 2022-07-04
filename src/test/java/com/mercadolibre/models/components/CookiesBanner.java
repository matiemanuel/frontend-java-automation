package com.mercadolibre.models.components;

import com.framework.page.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CookiesBanner extends WebComponent {

    @FindBy(css = "[data-testid='action:understood-button']")
    private WebElement consentButton;

    public CookiesBanner(WebElement container) {
        super(container);
    }

    public void acceptCookies() {
        click(consentButton);
    }
}
