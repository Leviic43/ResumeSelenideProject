package pages.avito_home;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class AvitoHomePage {


    SelenideElement autoButton = $x("(//*[@data-marker='visual-rubricator/image-Авто'])[1]");
    SelenideElement realtyButton = $x("(//*[@data-marker='visual-rubricator/image-Недвижимость'])[1]");
    SelenideElement workButton = $x("(//*[@data-marker='visual-rubricator/image-Работа'])[1]");
    SelenideElement clothesButton = $x("(//*[@data-marker='visual-rubricator/image-Одежда, обувь, аксессуары'])[1]");
    SelenideElement hobbyButton = $x("(//*[@data-marker='visual-rubricator/image-Хобби и отдых'])[1]");
    SelenideElement animalsButton = $x("(//*[@data-marker='visual-rubricator/image-Животные'])[1]");
    SelenideElement businessButton = $x("(//*[starts-with(@data-marker,'visual-rubricator/image-Готовый бизнес и')])[1]");
    SelenideElement servicesButton = $x("(//*[@data-marker='visual-rubricator/image-Услуги'])[1]");
    SelenideElement sparePartsButton = $x("(//*[@data-marker='visual-rubricator/image-Запчасти'])[1]");
    SelenideElement electronicsButton = $x("(//*[@data-marker='visual-rubricator/image-Электроника'])[1]");
    SelenideElement forHomeButton = $x("(//*[@data-marker='visual-rubricator/image-Для дома и дачи'])[1]");
    SelenideElement forKidsButton = $x("(//*[@data-marker='visual-rubricator/image-Товары для детей'])[1]");
    SelenideElement travelButton = $x("(//*[@data-marker='visual-rubricator/image-Путешествия'])[1]");
    SelenideElement healthButton = $x("(//*[@data-marker='visual-rubricator/image-Красота и здоровье'])[1]");
    SelenideElement findField = $x("//input[@data-marker='search-form/suggest']");
    SelenideElement findButton = $x("//button[contains(., 'Найти')]");
    SelenideElement regionMoscow = $x("//span[@data-attribute-tag='block']//span[text()='Москва']");
    SelenideElement regionButton = $x("//span[@class]//span[@data-attribute-tag='block']");
    SelenideElement clearRegion = $x("//button[@data-marker='popup-location/region/clearButton']");
    SelenideElement findRegionField = $x("//input[@data-marker='popup-location/region/search-input']");
    SelenideElement moscowInSelector = $x("(//strong[text()='Москва'])[1]");
    SelenideElement acceptChanges = $x("//button[@data-marker='popup-location/save-button']");

    public AvitoHomePage enterAutoPage() {
        autoButton.shouldBe(clickable).click();
        return this;
    }

    public AvitoHomePage enterRealtyPage() {
        realtyButton.shouldBe(clickable).click();
        return this;
    }

    public AvitoHomePage clickToFindField() {
        findField.shouldBe(clickable).click();
        return this;
    }

    public AvitoHomePage typeMessage(String message) {
        findField.sendKeys(message);
        return this;
    }

    public AvitoHomePage searchButtonClick() {
        findButton.click();
        return this;
    }

    public AvitoHomePage isAutoButtonDisplayed() {
        autoButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Авто\": " + autoButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isRealtyButtonDisplayed() {
        realtyButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Недвижимость\": " + realtyButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isWorkButtonDisplayed() {
        workButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Работа\": " + workButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isClothesButtonDisplayed() {
        clothesButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Одежда, обувь, аксессуары\": " + clothesButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isHobbyButtonDisplayed() {
        hobbyButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Хобби и отдых\": " + hobbyButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isAnimalsButtonDisplayed() {
        animalsButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Животные\": " + animalsButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isBusinessButtonDisplayed() {
        businessButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Готовый бизнес и оборудование\": " + businessButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isServicesButtonDisplayed() {
        servicesButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Услуги\": " + servicesButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isSparePartsButtonDisplayed() {
        sparePartsButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Запчасти\": " + sparePartsButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isElectronicsButtonDisplayed() {
        electronicsButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Электроника\": " + electronicsButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isForHomeButtonDisplayed() {
        forHomeButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Для дома и дачи\": " + forHomeButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isForKidsButtonDisplayed() {
        forKidsButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Товары для детей\": " + forKidsButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isTravelButtonDisplayed() {
        travelButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Путешествия\": " + travelButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isHealthButtonDisplayed() {
        healthButton.shouldBe(visible);
        System.out.println("Отображение элемента \"Красота и здоровье\": " + healthButton.isDisplayed());
        return this;
    }

    public AvitoHomePage isAllButtonsDisplayed() {
        isAutoButtonDisplayed();
        isRealtyButtonDisplayed();
        isWorkButtonDisplayed();
        isClothesButtonDisplayed();
        isHobbyButtonDisplayed();
        isAnimalsButtonDisplayed();
        isBusinessButtonDisplayed();
        isServicesButtonDisplayed();
        isSparePartsButtonDisplayed();
        isElectronicsButtonDisplayed();
        isForHomeButtonDisplayed();
        isForKidsButtonDisplayed();
        isTravelButtonDisplayed();
        isHealthButtonDisplayed();
        return this;
    }

    public AvitoHomePage changeRegion() {

        if (!regionMoscow.exists()) {
            regionButton.click();
            clearRegion.click();
            findRegionField.sendKeys("Москва");
            moscowInSelector.click();
            acceptChanges.click();
            return this;
        } else {
            return this;
        }
    }
}
