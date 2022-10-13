#Kullanici adi  Manager5@gmail.com  Manager6@gmail.com  Manager7@gmail.com  Manager8@gmail.com  Manager9@gmail.com
  #Password  Manager5!  Manager6!  Manager7!  Manager8!  Manager9!


  #Scenario: TC11 kullanici gecersiz bilgilerle giris yapar
  # Given kullanici Blue RentaCar ana sayfasinda
  # Then Log in yazisina tiklar
  #And gecersiz username girer
  # And gecersiz password girer
  # And Login butonuna basar
  #Then sayfaya giris yapilamadigini kontrol eder
  #And kulllanici sayfayi kapatir
Feature: US008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz

  @negative
  Scenario Outline: TC11 kullanici gecerli bilgilerlegiris yapar
    Given kullanici "brcUrl" anasayfasinda
    Then Login yazisina tikla
    Then gecersiz username olarak "<username>" girer
    Then gecersiz password olarak "<password>" girer
    And Login butonuns basar
    Then kullanici 3 saniye bekler
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapat

    Examples:
      |username           |password |
      |Manager5@gmail.com |Manager5!|
      |Manager6@gmail.com |Manager6!|
      |Manager7@gmail.com |Manager7!|
      |Manager8@gmail.com |Manager8!|
      |Manager9@gmail.com |Manager9!|