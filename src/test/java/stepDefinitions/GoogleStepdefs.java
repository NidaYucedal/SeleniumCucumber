package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepdefs {

    GooglePage googlePage=new GooglePage();
    String [] sonuc;
    String [] result;
    String trendWindow;
    String morhipo;

    @Given("user google gider")
    public void userGoogleGider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }

    @Then("user trendyolu aratir")
    public void userTrendyoluAratir() {
        googlePage.search.sendKeys("Trendyol", Keys.ENTER);
    }

    @And("user trendyola gider")
    public void userTrendyolaGider() {
        googlePage.trendyol.click();
        trendWindow=Driver.getDriver().getWindowHandle();
    }

    @And("user makas aratir")
    public void userMakasAratir() {
        googlePage.makas.sendKeys("makas",Keys.ENTER);
    }

    @And("toplam urun sayisini alir")
    public void toplamUrunSayisiniAlir() {

        String sonuc=googlePage.trendmakassonuc.getText();
        result=sonuc.split(" ");
        System.out.println(result[3]);


    }

    @And("yeni sekmede morhipo gider")
    public void yeniSekmedeMorhipoGider() {

        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get("https://www.morhipo.com");
        morhipo=Driver.getDriver().getWindowHandle();
    }
    @And("user morhipoda makas aratir")
    public void userMorhipodaMakasAratir() {
        googlePage.morhipoSearch.sendKeys("makas",Keys.ENTER);


    }

    @And("toplam makas sayisini alir")
    public void toplamMakasSayisiniAlir() {
        String morMakas=googlePage.morhipoMakas.getText();
        sonuc=morMakas.split(" ");
        System.out.println(sonuc[0]);
    }

    @Then("iki sitedeki topla makas sayısını karşılaştırınız")
    public void ikiSitedekiToplaMakasSayisiniKarsilastiriniz() {

        Assert.assertNotEquals(result,sonuc);
    }

    @And("once ürün sayısı fazla olan siteyi kapatınız")
    public void onceUrunSayisiFazlaOlanSiteyiKapatiniz() {



        Driver.getDriver().switchTo().window(trendWindow);
        Driver.closeDriver();
    }

    @Then("Sonra diğer sayfayıda kapatınız")
    public void sonraDigerSayfayidaKapatiniz() {


        Driver.getDriver().switchTo().window(morhipo).close();
        //Driver.getDriver().switchTo().window(morhipo);
        //Driver.quitDriver();

    }


}
