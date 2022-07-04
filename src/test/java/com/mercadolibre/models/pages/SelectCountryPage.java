package com.mercadolibre.models.pages;

import com.framework.page.WebPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SelectCountryPage extends WebPage {

    @FindBy(className = "ml-logo")
    private WebElement logo;

    @FindBy(css = ".ml-site-list li")
    private List<WebElement> countries;

    public HomePage selectCountry(Country country) {
        click(countries.get(country.ordinal()));
        return new HomePage();
    }

    public boolean isLogoVisible() {
        return isVisible(logo);
    }

    public enum Country {
        ARGENTINA, BOLIVIA, BRASIL, CHILE, COLOMBIA, COSTA_RICA, DOMINICANA, ECUADOR, GUATEMALA, HONDURAS, MEXICO, NICARAGUA, PANAMA, PARAGUAY, PERU, EL_SALVADOR,
        URUGUAY, VENEZUELA;
    }
}
