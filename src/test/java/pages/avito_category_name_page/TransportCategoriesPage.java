package pages.avito_category_name_page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$$x;


public class TransportCategoriesPage {
    public ArrayList<SelenideElement> getAndSortBrands() {

        ElementsCollection realCars = $$x("//div[@data-marker='popular-rubricator/links']//div[@data-marker='popular-rubricator/links/row']//a[@data-marker='popular-rubricator/link']");
        ArrayList<SelenideElement> realBrands = new ArrayList<>();
        for (SelenideElement car : realCars) {
            realBrands.add(car);
        }
        return realBrands;
    }
}
