package ru.marshenina;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.marshenina.page.InnValidationPage;

public class TestWithCsvSourceAnnotation {

    InnValidationPage innValidationPage = new InnValidationPage();

    @CsvSource(value = {
            "494076965205, valid INN 12 numbers, error.message:",
            "8583958943, valid INN 10 numbers, error.message:",
            "858395894, invalid INN 9 numbers, error.message: ИНН может состоять только из 10 или 12 цифр",
            "8583958941, invalid INN 10 numbers, error.message: Неправильное контрольное число",
    })

    @ParameterizedTest(name = "{1}")
    void checkErrorMessage(String inn,
                           String testName,
                           String errorMessage) {
        innValidationPage.openInnValidationPage();
        innValidationPage.inputInn(inn);
        innValidationPage.clickCheckButton();
        innValidationPage.checkErrorMessageOrCode(errorMessage);
    }
}
