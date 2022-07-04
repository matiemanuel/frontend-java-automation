package com.mercadolibre.models.components;

import com.framework.page.WebComponent;
import com.mercadolibre.models.pages.SearchResultPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBar extends WebComponent {

    @FindBy(id = "cb1-edit")
    private WebElement searchInput;

    @FindBy(className = "nav-search-btn")
    private WebElement searchButton;

    @FindBy(id = "sb-suggestions-1")
    private WebElement suggestionBar;

    public NavBar(WebElement container) {
        super(container);
    }

    public SearchResultPage searchFor(String search) {
        type(searchInput, search);
        isVisible(suggestionBar);
        click(searchButton);
        return new SearchResultPage();
    }
}
