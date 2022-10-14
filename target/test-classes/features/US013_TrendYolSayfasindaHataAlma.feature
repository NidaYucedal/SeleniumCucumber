Feature: US0013 Parametre Kullanimi
  @gp5
  Scenario:TC01 Parametre Kullanimi
    Given kullanici "trend" anasayfasinda
    Then kullanici 3 saniye bekler
    When url'nin "trendyol" icerdigini test edelim
    And sayfayi kapatir