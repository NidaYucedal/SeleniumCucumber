package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class PractiseAmazonStepDefs {

    AmazonPage amazonPage=new AmazonPage();
    Faker faker=new Faker();

    @Given("kullanici Amazon web sitesine gider")
    public void kullaniciAmazonWebSitesineGider() {

        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
    }

    @When("sign in butonuna tikla")
    public void signInButonunaTikla() {

        amazonPage.signinButton.click();

    }

    @And("faker kullanarak e-posta gonderir")
    public void fakerKullanarakEPostaGonderir() {

        amazonPage.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @And("gonderdigi e-postanin ekran goruntusunu alir")
    public void gonderdigiEPostaninEkranGoruntusunuAlir() {

        try {
            ReusableMethods.getScreenshotWebElement("screen",amazonPage.emailBox);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("continiue'a tiklar")
    public void continiueATiklar() {
        amazonPage.continiueButton.click();
    }

    @Then("There was a problem mesajini dogrular")
    public void thereWasAProblemMesajiniDogrular() {
        Assert.assertTrue(amazonPage.problemMessage.isDisplayed());
    }

    @And("Need help e tiklar")
    public void needHelpETiklar() {

        amazonPage.needHelp.click();
    }

    @And("forgot your password e tiklar")
    public void forgotYourPasswordETiklar() {

        amazonPage.forgotPasswordLink.click();
    }

    @And("Password assistance metnini dogrular")
    public void passwordAssistanceMetniniDogrular() {
        amazonPage.passwordAssistanceText.click();
    }

    @And("Geri gider")
    public void geriGider() {
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().refresh();
    }

    @And("Create your account butonuna tiklar")
    public void createYourAccountButonunaTiklar() {
        amazonPage.createYourAccountButton.click();
    }

    @Then("Create account metnini dogrular")
    public void createAccountMetniniDogrular() {
        Assert.assertTrue(amazonPage.createAccountText.isDisplayed());
    }

    @And("websayfasini kapatir")
    public void websayfasiniKapatir() {

        Driver.closeDriver();
    }
}
