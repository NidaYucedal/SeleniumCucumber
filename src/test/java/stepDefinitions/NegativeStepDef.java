package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeStepDef {

    BrcPage brcPage=new BrcPage();

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Login yazisina tikla")
    public void loginYazisinaTikla() {

        brcPage.ilkLogin.click();
    }

    @Then("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String username) {

        brcPage.email.sendKeys(username);
    }

    @Then("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String password) {
        brcPage.password.sendKeys(password);
    }

    @And("Login butonuns basar")
    public void loginButonunsBasar() {
        brcPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(brcPage.invalid.isDisplayed());
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {

        Driver.closeDriver();
    }
}
