package com.mercadolibre.models.components.searchresultspage;

import com.framework.page.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.lang.Integer.parseInt;

public class SearchResultsSideBar extends WebComponent {

    @FindBy(className = "ui-search-filter-dl")
    private List<WebElement> filterContainers;

    @FindBy(className = "andes-tag__label")
    private List<WebElement> filteredValues;

    @FindBy(className = "ui-search-breadcrumb__title")
    private WebElement currentSearch;

    @FindBy(className = "ui-search-search-result__quantity-results")
    private WebElement searchResultsQuantity;

    public SearchResultsSideBar(WebElement container) {
        super(container);
    }

    public SearchFilter getFilterByIndex(int index) {
        WebElement filterContainer = filterContainers.get(index);
        isVisible(filterContainer);
        return new SearchFilter(filterContainer);
    }

    public int getFilteredValuesQuantityApplied() {
        areVisible(filteredValues);
        return filteredValues.size();
    }

    public boolean filteredValuesContains(String value) {
        areVisible(filteredValues);
        return filteredValues.stream()
                .anyMatch(filter -> value.equalsIgnoreCase(getText(filter)));
    }

    public String getCurrentSearch() {
        return getText(currentSearch);
    }

    public int getSearchResultsQuantity() {
        return parseInt(getText(searchResultsQuantity).replaceAll("[^0-9]", ""));
    }
}
