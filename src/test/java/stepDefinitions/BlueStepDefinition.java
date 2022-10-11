package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueStepDefinition {

    BrcPage brcPage = new BrcPage();

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {

        brcPage.ilkLogin.click();

    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {

        brcPage.email.sendKeys("nid@gmail.com");
    }

    @And("supersize password girer")
    public void supersizePasswordGirer() {

        brcPage.password.sendKeys("123123204923053");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {

        brcPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {

        Assert.assertTrue(brcPage.invalid.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {

        Driver.closeDriver();
    }
}
