package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDef {
    @Given("kullanici {string} sayfasind")
    public void kullaniciSayfasind(String istenenUrl) {

        Driver.getDriver().get(istenenUrl);
    }
}
