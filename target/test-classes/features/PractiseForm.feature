# Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
#     username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
#     bir dosya yukler
#     checkbox1 i secer
#     radio2 yi secer
#     selection item3 secer
#     dropdown itmem4 secer
#     submite tiklar
#     dosyanin yuklendigini dogrular
@practiceForm
Feature: Form doldurma

  Scenario Outline: Practice form doldurma


    Given Kullanici "https://testpages.herokuapp.com/styled/basic-html-form-test.html" adresine gider
    When username "<kullanici adi>" password "<sifre>" ve textarea "<metin alani>" kisimlarini doldurur
    And bir dosya yukler
    And checkbox1 i secer
    And radio2 yi secer
    And selection item3 secer
    And dropdown itmem4 secer
    And submite tiklar
    Then dosyanin yuklendigini dogrular

    Examples:
      | kullanici adi | sifre | metin alani |
      | kullanici adi | sifre | metin alani |