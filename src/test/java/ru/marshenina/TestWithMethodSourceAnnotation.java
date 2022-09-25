package ru.marshenina;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.marshenina.page.InnValidationPage;

import java.util.List;
import java.util.stream.Stream;

public class TestWithMethodSourceAnnotation {

    private InnValidationPage innValidationPage = new InnValidationPage();

    static Stream<Arguments> checkErrorCode() {
        return Stream.of(
                Arguments.of(
                        "Empty field", "", "error.code: 1"
                ),
                Arguments.of(
                        "Latin characters", "abc", "error.code: 2"
                ),
                Arguments.of(
                        "INN != 10 or 12 numbers", "12345", "error.code: 3"
                ),
                Arguments.of(
                        "Wrong check digit", "1234567890", "error.code: 4"
                )

        );
    }


    @MethodSource("checkErrorCode")
    @ParameterizedTest(name = "{0}")
    void checkErrorCode(String testName, String inn, String errorCode) {
        innValidationPage.openInnValidationPage();
        innValidationPage.inputInn(inn);
        innValidationPage.clickCheckButton();
        innValidationPage.checkErrorMessageOrCode(errorCode);
    }
}
