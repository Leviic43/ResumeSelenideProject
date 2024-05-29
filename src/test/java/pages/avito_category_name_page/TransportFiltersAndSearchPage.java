package pages.avito_category_name_page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TransportFiltersAndSearchPage {

    SelenideElement bodyTypeSelector = $x("//input[contains(@data-marker, 'params[110705]/multiselect-outline-input')]");
    SelenideElement brandTypeSelector = $x("//input[contains(@data-marker, 'params[110599]/multiselect')]");
    SelenideElement searchWithFiltersButton = $x("//button[@data-marker='search-filters/submit-button']");
    SelenideElement selectTypeBunker = $x("//div[text() = 'Бункер']");
    SelenideElement selectBrandKamaz = $x("//div[text() = 'КАМАЗ']");

    public TransportFiltersAndSearchPage selectBunkerBodyType() {
        bodyTypeSelector.sendKeys("Бун");
        selectTypeBunker.click();
        return this;
    }

    public TransportFiltersAndSearchPage selectKamazBrandType() {
        brandTypeSelector.sendKeys("Кам");
        selectBrandKamaz.scrollTo().click();
        return this;
    }

    public TransportFiltersAndSearchPage searchButtonClick() {

        searchWithFiltersButton.scrollTo().click();
        return this;
    }
}
