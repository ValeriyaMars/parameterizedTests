Примеры параметризованных тестов сервиса для валидации ИНН

1. Тест с аннотацией @CsvSource: проверка текста ошибок при вводе невалидного ИНН

  1.1 Открыть страницу http://www.kholenkov.ru/data-validation/inn/
  
  1.2 Ввести в поле ИНН
  
  1.3 Нажать кнопку "Проверить"
  
  1.4 Проверить текст ошибок.
  
 2. Тест с аннотацией @EnumSource: проверка существующих реализаций для разных языков программирования
 
  2.1 Открыть страницу http://www.kholenkov.ru/data-validation/inn/
  
  2.2 Проверить список доступных реализаций
  
 3. Тест с аннотацией @MethodSource: проверка кодов ошибок при вводе невалидного ИНН
 
  3.1 Открыть страницу http://www.kholenkov.ru/data-validation/inn/
  
  3.2 Ввести в поле ИНН
  
  3.3 Нажать кнопку "Проверить"
  
  3.4 Проверить код ошибок.
  
 4. Тест с аннотацией @ValueSource: проверка ИНН на валидность (сервис не выдаёт ошибок после проверки ИНН) 
 
  4.1 Открыть страницу http://www.kholenkov.ru/data-validation/inn/
  
  4.2 Ввести в поле ИНН
  
  4.3 Нажать кнопку "Проверить"
  
  4.4 Проверить ИНН на отсутствие ошибок
