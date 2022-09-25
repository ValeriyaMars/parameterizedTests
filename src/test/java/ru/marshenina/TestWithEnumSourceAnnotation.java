package ru.marshenina;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.marshenina.domain.NameOfRealisation;
import ru.marshenina.page.InnValidationPage;

public class TestWithEnumSourceAnnotation {
    InnValidationPage innValidationPage = new InnValidationPage();

    @EnumSource(NameOfRealisation.class)
    @ParameterizedTest(name = "Check realisations")
    void checkRealisations(NameOfRealisation nameOfCheck) {
        innValidationPage.openInnValidationPage();
        innValidationPage.checkRealisation(nameOfCheck);
    }
}
