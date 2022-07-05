package com.mercadolibre.models.pages;

import com.mercadolibre.models.BaseMLPage;
import com.mercadolibre.models.components.searchresultspage.SearchResultsSideBar;
import com.mercadolibre.models.components.searchresultspage.SearchView;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BaseMLPage {

    @FindBy(className = "ui-search-sidebar")
    private WebElement sideBarContainer;

    @FindBy(className = "ui-search-view-options__container")
    private WebElement searchViewContainer;

    private SearchResultsSideBar sideBar = new SearchResultsSideBar(sideBarContainer);

    private SearchView searchView = new SearchView(searchViewContainer);

    public SearchView getSearchView() {
        return searchView;
    }

    public SearchResultsSideBar getSideBar() {
        return sideBar;
    }

    public boolean isVisible() {
        return isVisible(sideBarContainer) && isVisible(searchViewContainer);
    }
}
