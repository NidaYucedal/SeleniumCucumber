package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {

    public GuruPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//thead//tr//th") // başlık thead- tbody tablo -th sutun
    ////thead//tr//th[3]
    public List<WebElement> basliklar;


}
