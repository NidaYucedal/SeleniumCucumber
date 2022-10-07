package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AtmPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinition {

    AtmPage atmPage=new AtmPage();
    Faker faker=new Faker();
    @Given("kullanici {string} sayfasinda")
    public void kullaniciSayfasinda(String arg0) {

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
    }

    @And("sign in butonuna tiklar")
    public void signInButonunaTiklar() {

        atmPage.login.click();
    }

    @And("create and account box email girer")
    public void createAndAccountBoxEmailGirer() {

        atmPage.name.sendKeys(faker.name().firstName());
        atmPage.email.sendKeys(faker.internet().emailAddress());

    }

    @And("create an account butonuna tiklar")
    public void createAnAccountButonunaTiklar() {

        atmPage.signup.click();
    }

    @And("user valid degerler girer")
    public void userValidDegerlerGirer() {

        Actions actions=new Actions(Driver.getDriver());
        actions.click(atmPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("8")
                .sendKeys(Keys.TAB)
                .sendKeys("December")
                .sendKeys(Keys.TAB)
                .sendKeys("2022")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("Quebec")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys("CND").perform();
    }

    @And("register butonuna tiklar")
    public void registerButonunaTiklar() {
        atmPage.create.click();
    }

    @Then("hesap olustugunu dogrular")
    public void hesapOlustugunuDogrular() {

        Assert.assertTrue(atmPage.accountCreated.isDisplayed());
        Driver.closeDriver();
    }
}
