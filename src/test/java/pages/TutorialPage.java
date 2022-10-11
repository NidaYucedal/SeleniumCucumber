package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TutorialPage {

    public TutorialPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='http://tutorialsninja.com/demo/index.php?route=product/category&path=24']")
    public WebElement phone;
    @FindBy(xpath = "//h4")
    public List<WebElement> phones;
    @FindBy(xpath = "//*[text()='Add to Cart']")
    public List<WebElement> addToCart;

    @FindBy(xpath = "(//*[text()='Shopping Cart'])[1]")
    public WebElement sepeteTiklar;
    @FindBy(css = ".btn.btn-inverse.btn-block.btn-lg.dropdown-toggle")
    public WebElement viewCart;
    @FindBy(xpath = "//body//tr//td[@class='text-left']")
    public List<WebElement> urunler;
}
