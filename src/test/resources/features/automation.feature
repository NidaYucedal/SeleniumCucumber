Feature: US001 AutomationExercise register

  @aut
  Scenario: TC001 Kullanici valid datalar ile register olabilmeli

    Given kullanici "automationUrl" sayfasinda
    And sign in butonuna tiklar
    And create and account box email girer
    And create an account butonuna tiklar
    And user valid degerler girer
    And register butonuna tiklar
    Then hesap olustugunu dogrular

