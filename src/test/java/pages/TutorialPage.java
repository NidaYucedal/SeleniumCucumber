package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {

    public TutorialPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Phones & PDAs']")
    public WebElement phone;


    @FindBy(xpath = "//h4")
    public List<WebElement> telefonlar;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> add;

    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement sepet;

    @FindBy(xpath = "//strong[normalize-space()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "(//*[@class='table table-bordered'])[2]//tbody//td[2]")
    public List<WebElement> urunler;
}
