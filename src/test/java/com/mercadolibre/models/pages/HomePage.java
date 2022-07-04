package com.mercadolibre.models.pages;

import com.mercadolibre.models.BaseMLPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseMLPage {

    @FindBy(className = "andes-carousel-snapped")
    private WebElement mainCarousel;

    public boolean isVisible() {
        return isVisible(mainCarousel);
    }
}
