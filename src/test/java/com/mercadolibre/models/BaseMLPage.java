package com.mercadolibre.models;

import com.framework.page.WebPage;
import com.mercadolibre.models.components.CookiesBanner;
import com.mercadolibre.models.components.NavBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BaseMLPage extends WebPage {

    @FindBy(className = "nav-header")
    private WebElement navBarContainer;

    @FindBy(className = "cookie-consent-banner-opt-out")
    private WebElement cookieBannerContainer;

    private NavBar navBarElement = new NavBar(navBarContainer);
    private CookiesBanner cookieBannerElement = new CookiesBanner(cookieBannerContainer);

    public NavBar getNavBar() {
        return navBarElement;
    }

    public CookiesBanner getCookieBanner() {
        return cookieBannerElement;
    }

}