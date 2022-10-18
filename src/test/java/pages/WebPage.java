package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebPage {
    public WebPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Login Portal']")
    public WebElement login;

    @FindBy(xpath = "//*[@id='text']")
    public WebElement userName;


}