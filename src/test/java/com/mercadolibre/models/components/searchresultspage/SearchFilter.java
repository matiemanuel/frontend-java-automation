package com.mercadolibre.models.components.searchresultspage;

import com.framework.page.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.lang.Integer.getInteger;

public class SearchFilter extends WebComponent {

    @FindBy(css = "[role='heading']")
    private WebElement headerLabel;

    @FindBy(className = "ui-search-link")
    private List<WebElement> links;

    @FindBy(className = "ui-search-filter-name")
    private List<WebElement> filterNames;

    @FindBy(className = "ui-search-filter-results-qty")
    private List<WebElement> filterResultsQuantity;

    protected SearchFilter(WebElement container) {
        super(container);
    }

    public String getHeaderText() {
        return getText(headerLabel);
    }

    public void clickOption(int index) {
        areVisible(links);
        click(links.get(index));
    }

    public void clickOption(String filterName) {
        areVisible(filterNames);
        click(filterNames.stream().filter(filter -> filterName.equalsIgnoreCase(getText(filter)))
                .findFirst().get());
    }

    public String getFilterName(int index) {
        areVisible(filterNames);
        return getText(filterNames.get(index));
    }

    public int getOptionResultsQuantity(int index) {
        areVisible(filterResultsQuantity);
        return getInteger(getText(filterResultsQuantity.get(index)).replace("[^0-9]", ""));
    }
}
