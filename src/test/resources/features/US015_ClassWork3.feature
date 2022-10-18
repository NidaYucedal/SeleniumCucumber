#https://automationpractice.com/index.php sayfasina gidelim
#Cucumber ile asagidaki testi yapalim
#Given user web sayfasinda
#And user sign in linkine tiklar
#And user Create and account bölümüne email adresi girer
#And Create an Account butonuna basar
#And user kisisel bilgilerini ve iletisim bilgilerini girer  And user Register butonuna basar
#Then hesap olustugunu dogrulayin
  Feature: US015 User Login Test
    Scenario: User sitede hesap olusturur
      Given kullanici "autoUrl" anasayfasinda
      And user sign in linkine tiklar
      And user Create and account bölümüne email adresi girer
      And Create an Account butonuna basar
      And user kisisel bilgilerini ve iletisim bilgilerini girer  And user Register butonuna basar
      And kullanici 10 saniye bekler
      Then hesap olustugunu dogrulayin
     And sayfayi kapatir