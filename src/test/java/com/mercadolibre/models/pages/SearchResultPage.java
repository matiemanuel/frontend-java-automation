package com.mercadolibre.models.pages;

import com.mercadolibre.models.BaseMLPage;
import com.mercadolibre.models.components.searchresultspage.SearchResultSideBar;
import com.mercadolibre.models.components.searchresultspage.SearchView;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BaseMLPage {

    @FindBy(className = "ui-search-sidebar")
    private WebElement sideBarContainer;

    @FindBy(className = "ui-search-view-options__container")
    private WebElement searchViewContainer;

    private SearchResultSideBar sideBar = new SearchResultSideBar(sideBarContainer);

    private SearchView searchView = new SearchView(searchViewContainer);

    public SearchView getSearchView() {
        return searchView;
    }

    public SearchResultSideBar getSideBar() {
        return sideBar;
    }

    public boolean isVisible() {
        return isVisible(sideBarContainer) && isVisible(searchViewContainer);
    }
}
