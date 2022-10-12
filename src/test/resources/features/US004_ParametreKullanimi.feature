Feature: US004 parametre kullanimi
  Scenario: TC01 parametre kullanimi

    Given kullanici "https://hepsiburada.com" sayfasind
    Then kullanici 3 saniye bekler
    When Url in "hepsi" icerdigini test edelim
    And sayfayi kapatir
