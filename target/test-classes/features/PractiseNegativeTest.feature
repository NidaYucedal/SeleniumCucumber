#kullanici "https://medunna.com/" sayfasina gider
#     login olmak icin signin e tiklar
#     username icin "<username>" kullanici adini gonderir
#     password icin "<password>" parolasini gonderir
#     signine tiklar
#     Authentication information not correct uyarisini dogrular
@medunna
Feature: Medunna Login Negative Test

  Scenario Outline: Negative login test

    Given kullanici "https://medunna.com/" sayfasında
    When login olmak icin signin e tiklar
    And username icin "<username>" kullanici adini gonderir
    And password icin "<password>" parolasini gonderir
    And signine tiklar
    Then Authentication information not correct uyarisini dogrular

    Examples:
      | username | password |
      | username | password |