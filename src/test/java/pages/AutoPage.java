package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {

    public AutoPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement singin;

    @FindBy(xpath = "(//input[@id='email_create'])[1]")
    public WebElement email;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    public WebElement createAccount;

    @FindBy(xpath = "(//input[@id='id_gender2'])[1]")
    public WebElement gender;


    @FindBy(xpath = "(//*[text()='My account'])[1]")
    public WebElement confirm;


}
