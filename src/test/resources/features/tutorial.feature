#// http://tutorialsninja.com/demo/index.php?route=common/home sayfasına gidiniz
#// Phones & PDAs'a tıklayınız
#// Telefonların markalarını alınız
#// Tüm öğeleri sepete ekleyiniz
#// Sepete tıklayınız
#// Sepetteki isimleri alınız
#// Sepetteki ve sayfadaki ürünlerin doğru olduğunu karşılaştırınız
Feature: US001 tutorialsninda
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici tutorial anasayfasinda
    Then user Phones & PDAs'a tiklar
    And telefonların markalarını alir
    And Tum ogeler sepete eklenir
    And user sepete tiklar
    And Sepetteki isimleri aliniz
    Then Sepetteki ve sayfadaki ürünleri verify edin