Feature: US004 parametre kullanimi
  Scenario: TC01 parametre kullanimi

    Given kullanici "https://hepsiburada.com" sayfasind
    Then kullanici 3 saniye bekler
    When url'in "hepsi" oldugunu test edelim
    And sayfayi kapatir
