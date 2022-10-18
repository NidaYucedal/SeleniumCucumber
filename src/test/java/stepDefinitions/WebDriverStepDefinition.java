package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebDriverStepDefinition {

    WebPage webPage = new WebPage();

    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {

        webPage.login.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {

        ArrayList<String> windows = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));

    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String userName) {
        webPage.userName.sendKeys(userName);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String arg0) {


    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
    }
}
