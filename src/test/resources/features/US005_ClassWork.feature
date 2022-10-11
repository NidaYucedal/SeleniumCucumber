Feature: US005

  Scenario: TC01 kullanici gecerli bilgilerle giris yapar
    Given kullanici bluerentacar ana sayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And supersize password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And kulllanici sayfayi kapatir