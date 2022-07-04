package com.mercadolibre.models.components.searchresultspage;

import com.framework.page.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchView extends WebComponent {

    @FindBy(className = "andes-dropdown__trigger")
    private WebElement dropdownButton;

    @FindBy(css = "li.andes-list__item")
    private List<WebElement> options;

    @FindBy(className = "andes-dropdown__display-values")
    private WebElement currentSortedValue;

    public SearchView(WebElement container) {
        super(container);
    }

    public SearchView sortBy(Options option) {
        click(dropdownButton);
        isVisible(options.get(0));
        click(options.get(option.ordinal()));
        return this;
    }

    public String getCurrentSortedValue() {
        return getText(currentSortedValue);
    }

    public enum Options {
        MOST_RELEVANT, LOWER_PRICE, HIGHER_PRICE;
    }
}
