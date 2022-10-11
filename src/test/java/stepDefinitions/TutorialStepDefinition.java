package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TutorialStepDefinition {

    TutorialPage tutorialPage = new TutorialPage();

    List<String> list=new ArrayList<>();

    List<String> phones = new ArrayList<>();


    @Given("kullanici tutorial anasayfasinda")
    public void kullaniciTutorialAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("tutorialUrl"));
    }

    @Then("user Phones & PDAs'a tiklar")
    public void userPhonesPDAsATiklar() {
        tutorialPage.phone.click();
    }

    @And("telefonların markalarını alir")
    public void telefonlarinMarkalariniAlir() {


        for (WebElement w : tutorialPage.phones) {
            System.out.println("Tum telefon markalari: " + w.getText());
            phones.add(w.getText());
        }
    }

    @And("Tum ogeler sepete eklenir")
    public void tumOgelerSepeteEklenir() {

       // for (int i = 0; i < tutorialPage.add.size(); i++) {
           // tutorialPage.add.get(i).click();
       // }

        tutorialPage.addToCart.forEach(WebElement::click);
    }

    @And("user sepete tiklar")
    public void userSepeteTiklar() throws InterruptedException {

        tutorialPage.viewCart.click();


    }

    @And("Sepetteki isimleri aliniz")
    public void sepettekiIsimleriAliniz() {


        for (WebElement each : tutorialPage.urunler) {
            list.add(each.getText());
        }

    }

    @Then("Sepetteki ve sayfadaki ürünleri verify edin")
    public void sepettekiVeSayfadakiUrunleriVerifyEdin() {

        Collections.sort(phones);
        Collections.sort(list);
        Assert.assertEquals(phones, list);


    }


}
