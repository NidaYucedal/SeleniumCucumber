Feature: US006 kullanici amazonda istedigi kelimeyi aratır


  Scenario Outline: TC01 kullanici istedigi kelimeyi aratır

    Given kullanici amazon anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |istenenKelime|istenenKelime|
      |nutella      |nutella      |
      |java         |java         |
      |elma         |elma         |
      |armut        |armut        |


#TestNG deki dataProvider kullanimindaki gibi Cucumberda da    Scenario Outline kullaniriz
#Bu sekilde birden fazla kelimeyi tek seferde aratabiliriz
    # Feature dosyasinda yazdığımız komutta eğer "" (Tırnak) kullanirsak stepDefinition da parametreli
 # bir method oluşturur. Ve artik stepDefinition'ı kullanmadan Feature dosyasında ""(tırnak) içindeki
 # string'i değiştirerek istediğim kelimeyi aratabilirim.
 # Scenario Outline da ise yine ""(Tırnak) içinde birden fazla kelime aratıcaksam "<>" şeklindeki kullanım ile
 # "<>" içine yazdığım herhangi bir kelimeyi Scenario Outline'ın aşağıda oluşturduğu Examples altında aratmak
 # istediğim kelimeleri yazar ve sırasıyla aratabiliriz