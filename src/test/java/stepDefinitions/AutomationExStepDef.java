package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AtmPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class AutomationExStepDef {

    AtmPage atmPage=new AtmPage();
    @Given("kullanici {string} sayfasina")
    public void kullaniciSayfasina(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @And("Ana sayfanın gorunur oldugulu dogrular")
    public void anaSayfanınGorunurOlduguluDogrular() {

        Assert.assertTrue(atmPage.home.isDisplayed());

    }

    @And("Test Case buttonu na tıklar")
    public void testCaseButtonuNaTıklar() {

        atmPage.testcase.click();

    }

    @And("Test case sayfasinda oldugunu dogrular")
    public void testCaseSayfasindaOldugunuDogrular() {

        Assert.assertTrue(atmPage.caseVisible.isDisplayed());
    }

    @Then("sayfanın ekran görüntüsünü alın")
    public void sayfanınEkranGörüntüsünüAlın() throws IOException {

        ReusableMethods.getScreenshot("testCase");
    }
}
