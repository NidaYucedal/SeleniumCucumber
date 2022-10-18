package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class PractiseFormStepDef {
    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {

        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String arg0, String arg1, String arg2) {
    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {
    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {
    }

    @And("radio{int} yi secer")
    public void radioYiSecer(int arg0) {
    }

    @And("selection item{int} secer")
    public void selectionItemSecer(int arg0) {
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer(int arg0) {
    }

    @And("submite tiklar")
    public void submiteTiklar() {
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {
    }
}
