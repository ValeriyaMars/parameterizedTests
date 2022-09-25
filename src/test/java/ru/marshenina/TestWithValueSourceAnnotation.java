package ru.marshenina;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.marshenina.page.InnValidationPage;

public class TestWithValueSourceAnnotation {

    InnValidationPage innValidationPage = new InnValidationPage();

    @ValueSource(strings = {
            "8583958943",
            "494076965205",
            "1234567890" //неверный ИНН
    })


    @ParameterizedTest(name = "Check inn validation results: {0}")
    void checkInnValidation(String inn) {
        innValidationPage.openInnValidationPage();
        innValidationPage.inputInn(inn);
        innValidationPage.clickCheckButton();
        innValidationPage.checkInn();
    }
}
