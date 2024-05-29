package pages.avito_home;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$x;

public class AvitoHomePageStories {


    SelenideElement lisaStory = $x("//div[text()='Помогаем «ЛизаАлерт»']");
    SelenideElement closeStory = $x("//button[text()='Закрыть']");

    public AvitoHomePageStories openLisaStory() {
        lisaStory.shouldBe(clickable).click();
        return this;
    }

    public AvitoHomePageStories closeStory() {
        closeStory.shouldBe(clickable).click();
        return this;
    }

}
