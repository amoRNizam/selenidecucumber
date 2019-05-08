package pageobjects.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import pageobjects.PageObject;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static util.ActionsOnElements.removeEvilBanner;

public class Plp extends PageObject {
    public Plp() {
        validateIsExpectedPage();
        removeEvilBanner();
    }

    @Override
    public void validateIsExpectedPage() {
        $(".o-plp-container_sub-header").should(exist);
        $(By.xpath("//div[contains(@class, 'o-plp-container__main-block')]")).should(exist);
    }

    public ElementsCollection productTitleList = $$(By.xpath(".//div[@data-init='productTileList']//child::h4[@title]"));
}
