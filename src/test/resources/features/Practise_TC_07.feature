# Tarayıcıyı başlatarak "http://automationexercise.com" url'sine gidin
# Ana sayfanın başarıyla görünür olduğunu doğrulayın
# Test Case buttonu na tıklayın
# Kullanıcının test case sayfasına başarıyla yönlendirildiğini doğrulayın
# İlgili sayfanın ekran görüntüsünü alın

  Feature: TC verify TestCase

    @automation
    Scenario:TC_07_TestCases


      Given kullanici "automationUrl" sayfasina
      And Ana sayfanın gorunur oldugulu dogrular
      And Test Case buttonu na tıklar
      And Test case sayfasinda oldugunu dogrular
      Then sayfanın ekran görüntüsünü alın
