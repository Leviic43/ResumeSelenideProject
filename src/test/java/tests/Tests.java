package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import pages.avito_category_name_page.TransportCategoriesPage;
import pages.avito_category_name_page.TransportFiltersAndSearchPage;
import pages.avito_home.AvitoCategoriesPanel;
import pages.avito_home.AvitoHomePage;
import pages.avito_home.AvitoHomePageStories;

import java.util.ArrayList;
import java.util.Arrays;

import static constants.URLs.AVITO_HOME_PAGE;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests extends _BaseTest {

    @Test
    public void openAutoPage() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePage()
                .enterAutoPage();
    }

    @Test
    public void openRealtyPage() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePage()
                .enterRealtyPage();
    }

    @Test
    public void openLisaStory() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePageStories()
                .openLisaStory()
                .closeStory();
    }

    @Test
    public void typeMessage() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePage().clickToFindField().typeMessage("Куплю гаражик!").searchButtonClick();
        Selenide.back();
    }

    @Test
    public void kamazBunkerTypeFind() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoCategoriesPanel()
                .categories()
                .transportCategory()
                .pickTrucksCategory();
        new TransportFiltersAndSearchPage()
                .selectBunkerBodyType()
                .selectKamazBrandType()
                .searchButtonClick();
    }

    @Test
    public void twoHundredLetters() {
        Selenide.open(AVITO_HOME_PAGE);
        AvitoHomePage avitoHomePage = new AvitoHomePage();
        avitoHomePage.clickToFindField();
        for (int i = 0; i < 40; i++) {
            avitoHomePage.typeMessage("Спам");
        }
        avitoHomePage.searchButtonClick();
        Selenide.back();
    }

    @Test
    public void isButtonsDisplayed() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePage().isAllButtonsDisplayed();
    }


    @Test
    public void expectedCars() {
        Selenide.open(AVITO_HOME_PAGE);
        new AvitoHomePage().changeRegion().enterAutoPage();
        ArrayList<SelenideElement> actualCars = new TransportCategoriesPage().getAndSortBrands();
        assertEquals(28, actualCars.size());
        System.out.println(Arrays.toString(actualCars.toArray()));

    }
}