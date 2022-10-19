package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.PractiseFormPage;
import utilities.Driver;

import java.util.Random;

public class PractiseFormStepDef {

    PractiseFormPage formPage=new PractiseFormPage();


    @Given("Kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String url) {

        Driver.getDriver().get(url);
    }

    @When("username {string} password {string} ve textarea {string} kisimlarini doldurur")
    public void usernamePasswordVeTextareaKisimlariniDoldurur(String username, String password, String textarea) {

        username=Faker.instance().name().username();
        password=Faker.instance().internet().password();
        textarea=Faker.instance().animal().name();



        formPage.username.sendKeys(username);
        formPage.password.sendKeys(password);
        formPage.textarea.clear();
        formPage.textarea.sendKeys(textarea);


    }

    @And("bir dosya yukler")
    public void birDosyaYukler() {

       // formPage.filename.sendKeys("C:\\Users\\Administrator\\Desktop\\text.txt");

        String homeDirectory=System.getProperty("user.home");
        String filePath=homeDirectory+"/Desktop/text.txt";
        formPage.filename.sendKeys(filePath);
    }

    @And("checkbox{int} i secer")
    public void checkboxISecer(int arg0) {

        if(!formPage.checkBox1.isSelected()){

            formPage.checkBox1.click();
        }

        if(formPage.checkBox2.isSelected()){
            formPage.checkBox2.click();
        }

        if (formPage.checkBox3.isSelected()){
            formPage.checkBox3.click();
        }
    }

    @And("radio{int} yi secer")
    public void radioYiSecer() {

        formPage.radio2.click();
    }

    @And("selection item{int} secer")
    public void selectionItemSecer() {

        formPage.selectItem3.click();
    }

    @And("dropdown itmem{int} secer")
    public void dropdownItmemSecer() {

        Select select=new Select(formPage.drop);
        Random random=new Random();
        int rnd= random.nextInt(select.getOptions().size()-1);
        select.selectByIndex(rnd);
    }

    @And("submite tiklar")
    public void submiteTiklar() {

        formPage.submit.click();
    }

    @Then("dosyanin yuklendigini dogrular")
    public void dosyaninYuklendiginiDogrular() {

        Assert.assertTrue(formPage.file.isDisplayed());



    }
}
