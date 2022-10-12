package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

public class NegativeStepDef {
    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String url) {

        Driver.getDriver().get(url);
    }

    @Then("Login yazisina tikla")
    public void loginYazisinaTikla() {
    }

    @Then("gecersiz username olarak {string} girer")
    public void gecersizUsernameOlarakGirer(String arg0) {
    }

    @Then("gecersiz password olarak {string} girer")
    public void gecersizPasswordOlarakGirer(String arg0) {
    }

    @And("Login butonuns basar")
    public void loginButonunsBasar() {
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
    }

    @And("sayfayi kapat")
    public void sayfayiKapat() {
    }
}
