package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MedunnaPage;
import utilities.Driver;

public class PractiseNegativeTestStepDef {

    MedunnaPage medunnaPage=new MedunnaPage();
    @Given("kullanici {string} sayfasında")
    public void kullaniciSayfasında(String url) {

        Driver.getDriver().get(url);
    }
    @When("login olmak icin signin e tiklar")
    public void loginOlmakIcinSigninETiklar() {

        medunnaPage.signInSymbol.click();
        medunnaPage.signIn.click();
    }

    @And("username icin {string} kullanici adini gonderir")
    public void usernameIcinKullaniciAdiniGonderir(String username) {

        username=Faker.instance().name().username();

        medunnaPage.userName.sendKeys(username);

    }

    @And("password icin {string} parolasini gonderir")
    public void passwordIcinParolasiniGonderir(String password) {

        password=Faker.instance().internet().password();
        medunnaPage.pass.sendKeys(password);
    }

    @And("signine tiklar")
    public void signineTiklar() {

        medunnaPage.sign.click();
    }

    @Then("Authentication information not correct uyarisini dogrular")
    public void authenticationInformationNotCorrectUyarisiniDogrular() {
    }


}
