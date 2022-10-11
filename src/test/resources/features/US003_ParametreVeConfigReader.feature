Feature: Parametre kullanimi

@gp1
  Scenario:TC01 parametre kullaniminda configReader kullanimi

    Given kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "facebook" oldugunu test edelim
    And sayfayi kapatir

@gp2
  Scenario:TC02 parametre kullaniminda configReader kullanimi

    Given kullanici "amznUrl" sayfasina gider
    Then kullanici 2 saniye bekler
    When url'in "amazon" oldugunu test edelim
    And sayfayi kapatir

  @gp1
  Scenario:TC03 parametre kullaniminda configReader kullanimi

    Given kullanici "faceUrl" sayfasina gider
    Then kullanici 3 saniye bekler
    When url'in "facebook" oldugunu test edelim
    And sayfayi kapatir

@gp2
  Scenario:TC04 parametre kullaniminda configReader kullanimi

    Given kullanici "google" sayfasina gider
    Then kullanici 1 saniye bekler
    When url'in "google" oldugunu test edelim
    And sayfayi kapatir

