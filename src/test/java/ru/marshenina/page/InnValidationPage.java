package ru.marshenina.page;

import com.codeborne.selenide.SelenideElement;
import ru.marshenina.domain.NameOfRealisation;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InnValidationPage {

    /*
    1. Открыть страницу http://www.kholenkov.ru/data-validation/inn/
    2. Ввести ИНН в поле
    3. Нажать кнопку проверить
    4. Проверить сообщение под кнопкой
     */
    private SelenideElement innInput = $(".js-action").$(byAttribute("name", "inn")),
            checkButton = $(".js-action").$(byAttribute("data-actions", "data-validation.validate-inn")),
            resultMessage = $(".js-action").$(".js-result");

    public void openInnValidationPage() {
        open("http://www.kholenkov.ru/data-validation/inn/");

    }

    public InnValidationPage inputInn(String value) {
        innInput.setValue(value);

        return this;
    }

    public void clickCheckButton() {
        checkButton.click();
    }


    public void checkInn() {
        resultMessage.shouldHave(text("error.code: 0"));
    }


    public InnValidationPage checkRealisation(NameOfRealisation nameOfRealisation) {
        $(".main-wrapper-main-text").shouldHave(text(nameOfRealisation.getDesc()));
        return this;
    }

    public void checkErrorMessageOrCode(String error) {
        resultMessage.shouldHave(text(error));
    }
}
