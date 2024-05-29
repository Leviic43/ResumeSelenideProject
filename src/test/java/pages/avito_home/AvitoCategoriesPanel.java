package pages.avito_home;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class AvitoCategoriesPanel {


    SelenideElement categoriesLocator = $x("//div[starts-with(@class, 'top-rubricator-buttonText')]");
    SelenideElement transportCategory = $x("//p[contains(text(), 'Транспорт')]");
    SelenideElement truckCategory = $x("//span[contains(text(), 'Грузовики')]");

    public AvitoCategoriesPanel categories() {
        categoriesLocator.click();
        return this;
    }

    public AvitoCategoriesPanel transportCategory() {
        transportCategory.hover();
        return this;
    }

    public AvitoCategoriesPanel pickTrucksCategory() {
        truckCategory.click();
        return this;
    }
}
